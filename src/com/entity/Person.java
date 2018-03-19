package com.entity;

public class Person {
	private int id;
	private String name;
	private Integer sex;
	private Integer age;
	private String phone;
	public Person() {
		super();
	}
	public Person(int id, String name, Integer sex, Integer age, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", phone=" + phone + "]";
	}
	
}
