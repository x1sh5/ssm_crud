package com.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.entity.Person;
import com.mapper.PersonMapper;
@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Resource(name="personMapper")
	private PersonMapper personMapper;
	
	@Override
	public List<Person> SelectAll() {
		return personMapper.SelectAll();
	}

	@Override
	public List<Person> SeclectByName(String selectbyname) {
		return personMapper.SeclectByName(selectbyname);
	}
	@Override
	public Person SelectByid(int id) {
		return personMapper.SelectByid(id);
	}
	
	@Override
	public void Addone(Person person) {
		personMapper.Addone(person);

	}

	@Override
	public void Delete(int id) {
		personMapper.Delete(id);

	}

	@Override
	public void Update(Person person) {
		personMapper.Update(person);

	}

}
