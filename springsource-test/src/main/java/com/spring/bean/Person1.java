package com.spring.bean;


/**

 * @author yujiale
 */

public class Person1 {

	private String name;

	public Person1() {
		System.out.println("person创建....");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}


}
