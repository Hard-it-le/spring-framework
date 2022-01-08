package com.spring.bean;


import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**

 * @author yujiale
 *
 * PersonRegistrar是单实例的，导致其中cat第一次创建PersonRegistrar对象时，容器初始化的cat是同一个
 */

@Component
public class PersonRegistrar {

	private String name;

	//@Autowired
	private Cat cat;

	public PersonRegistrar() {
		System.out.println("person创建....");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//去容器找
	@Lookup
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "PersonRegistrar{" +
				"name='" + name + '\'' +
				'}';
	}


}
