package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * Aware接口；帮我们装配Spring底层的一些组件
 * 1、Bean的功能增强全部都是有 BeanPostProcessor+InitializingBean  （合起来完成的）
 * 2、骚操作就是 BeanPostProcessor+InitializingBean
 * <p>
 * 你猜Autowired是怎么完成的
 * Person为什么能把ApplicationContext、MessageSource当为自己的参数传进来。
 * - 通过实现接口的方式自动注入了 ApplicationContext、MessageSource。是由BeanPostProcessor（Bean的后置处理器完成的）
 *
 * @author yujiale
 */

public class Person {


	@Autowired
	private Cat cat;
	private String name;


	public Person() {
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
