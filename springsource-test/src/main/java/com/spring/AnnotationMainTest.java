package com.spring;


import com.spring.bean.Cat;
import com.spring.bean.Person;
import com.spring.config.MainConfig;
import com.spring.config.MainConfigImport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解版Spring的用法
 *
 * @author yujiale
 */
public class AnnotationMainTest {

	public static void main(String[] args) {

		scopeTest();

	}


	/**
	 * annotation注解的简单实用
	 */
	public static void annotationTest(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}

	/**
	 * import注解的简单使用
	 */
	public static void importTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigImport.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}

	/**
	 * BeanDefinitionRegister图纸中心简单使用
	 */
	public static void importBeanDefinitionRegistryTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}

	/**
	 * scope简单用法
	 */
	public static void scopeTest(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		Cat cat1 = applicationContext.getBean(Cat.class);
		Cat cat2 = applicationContext.getBean(Cat.class);

		System.out.println(cat1==cat2);


	}


}
