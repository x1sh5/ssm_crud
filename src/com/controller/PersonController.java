package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Person;
import com.service.PersonService;

@Controller
public class PersonController {
	@Resource(name="personService")
	private PersonService personService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list() {
		List<Person> list = personService.SelectAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("jsp/show");
		return mv;
	}
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView edit(@RequestParam("id") Integer id) {
		Person person = personService.SelectByid(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		mv.setViewName("jsp/edit");
		return mv;
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@RequestParam("id") Integer id) {
		personService.Delete(id);
		return "redirect:list";
	}
	//±£¥Ê∂‘œÛ
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String save(Person person) {
		personService.Update(person);
		return "redirect:list";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Person person) {
		personService.Addone(person);
		return "redirect:list";
	}
	
	@RequestMapping(value="/addpage",method=RequestMethod.GET)
	public String addpage() {
		
		return "jsp/add";
	}
	@RequestMapping(value="/result",method=RequestMethod.POST)
	public ModelAndView result(String selectbyname) {
		System.out.println(selectbyname);
		List<Person> list1 = new ArrayList<Person>();
		list1 = personService.SeclectByName(selectbyname);
		for(Person list:list1) {
			System.out.println(list.toString());
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list1);
		mv.setViewName("jsp/show");
		return mv;
	}
}
