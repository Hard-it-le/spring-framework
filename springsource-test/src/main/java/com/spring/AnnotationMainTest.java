package com.spring;


import com.spring.bean.Cat;
import com.spring.bean.Person;
import com.spring.bean.PersonRegistrar;
import com.spring.config.MainConfig;
import com.spring.config.MainConfigImport;
import com.spring.config.MainConfigImportRegistrar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解版Spring的用法
 *
 * @author yujiale
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
		annotationTest();
	}

	/**
	 * annotation注解的简单实用
	 */
	public static void annotationTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		String name = bean.getName();
		System.out.println("annotation注解加载Spring");
		System.out.println("Person1的name:" + name);
		System.out.println(bean);
	}

	/**
	 * import注解的简单使用
	 */
	public static void importTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigImport.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println("import注解的简单使用");
		System.out.println(bean);
		bean.setName("赵六");
		String name = bean.getName();
		System.out.println("Person2的name:" + name);
	}

	/**
	 * BeanDefinitionRegister图纸中心简单使用
	 * <p>
	 * 获取所有bean定义信息的名字
	 */
	public static void importBeanDefinitionRegistryTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigImportRegistrar.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}

	/**
	 * scope简单用法
	 */
	public static void scopeTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigImportRegistrar.class);
		Cat cat1 = applicationContext.getBean(Cat.class);
		Cat cat2 = applicationContext.getBean(Cat.class);
		System.out.println(cat1 == cat2);
	}

	public static void scopeTest01() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigImportRegistrar.class);
		PersonRegistrar person1 = applicationContext.getBean(PersonRegistrar.class);
		Cat cat1 = person1.getCat();
		PersonRegistrar person2 = applicationContext.getBean(PersonRegistrar.class);
		Cat cat2 = person2.getCat();
		//true
		System.out.println(cat1 == cat2);
	}
}
