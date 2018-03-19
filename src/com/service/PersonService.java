package com.service;

import java.util.List;

import com.entity.Person;

public interface PersonService {
	List<Person> SelectAll();
	List<Person> SeclectByName(String name);
	Person SelectByid(int id);
	void Addone(Person person);
	void Delete(int id);
	void Update(Person person);
}
