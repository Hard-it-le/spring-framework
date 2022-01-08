package com.spring.config;

import com.spring.bean.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @author: yjl
 * @created: 2021/12/09
 */
@Configuration
//@Import({PersonRegistrar.class, MainConfigImportRegistrar.MyImportRegistrar.class})
@ComponentScan("com.spring.bean")
public class MainConfigImportRegistrar {

	/**
	 * BeanDefinitionRegistry:bean定义信息的注册中心（每个Bean的信息都在这里）
	 */
	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
											BeanDefinitionRegistry registry) {

			//BeanDefinition
			RootBeanDefinition catDefinition = new RootBeanDefinition();

			//可以声明定义信息，包括需要自动装配什么？
			catDefinition.setBeanClass(Cat.class);
			//registerBeanDefinition必须知道实例的类型和名字
			registry.registerBeanDefinition("tomCat", catDefinition);
		}
	}
}


