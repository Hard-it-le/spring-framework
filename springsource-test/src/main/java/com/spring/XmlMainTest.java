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
	public static void main(String[] args)  throws Throwable{
		test01();
		String s = new String();


		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder stringBuilder = new StringBuilder();
		s.equals(stringBuilder);

	}


	/**
	 * ClassPathXmlApplicationContext使用
	 * FileSystemXmlApplicationContext一般不推荐使用（全路径）
	 */
	public static void test01() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println("xml使用spring");
		System.out.println(person);
	}

	public static void test02() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
