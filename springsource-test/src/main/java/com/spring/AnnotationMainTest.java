package com.spring;


import com.spring.bean.Cat;
import com.spring.bean.Person1;
import com.spring.config.MainConfig1;
import com.spring.config.MainConfigImport1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解版Spring的用法
 *
 * @author yujiale
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
		importTest();
	}
	/**
	 * annotation注解的简单实用
	 */
	public static void annotationTest(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig1.class);
		Person1 bean = applicationContext.getBean(Person1.class);
		String name = bean.getName();
		System.out.println("annotation注解加载Spring");
		System.out.println("Person1的name:"+name);
		System.out.println(bean);
	}

	/**
	 * import注解的简单使用
	 */
	public static void importTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigImport1.class);
		Person1 bean = applicationContext.getBean(Person1.class);
		System.out.println("import注解的简单使用");
		System.out.println(bean);
		bean.setName("赵六");
		String name = bean.getName();
		System.out.println("Person2的name:"+name);
	}

	/**
	 * BeanDefinitionRegister图纸中心简单使用
	 * 
	 * 获取所有bean定义信息的名字
	 */
	public static void importBeanDefinitionRegistryTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig1.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}

	/**
	 * scope简单用法
	 */
	public static void scopeTest(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig1.class);
		Cat cat1 = applicationContext.getBean(Cat.class);
		Cat cat2 = applicationContext.getBean(Cat.class);
		System.out.println(cat1==cat2);
	}
}
