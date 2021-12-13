package com.spring;

import com.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @author: yjl
 * @created: 2021/12/13
 * xml版Spring的用法
 */
public class XmlMainTest {
	public static void main(String[] args) {
		test01();
	}


	/**
	 * ClassPathXmlApplicationContext使用
	 *FileSystemXmlApplicationContext一般不推荐使用（全路径）
	 *
	 */
	public static void test01(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);

	}
}
