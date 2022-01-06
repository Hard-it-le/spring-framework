package com.spring.config;

import com.spring.bean.Cat;
import com.spring.bean.Person2;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @author: yjl
 * @created: 2021/12/09
 */
@Configuration
@Import(Person2.class)
public class MainConfigImport2 {

	/**
	 * BeanDefinitionRegistry:bean定义信息的注册中心（每个Bean的信息都在这里）
	 */
	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
											BeanDefinitionRegistry registry) {

			//BeanDefinition
			RootBeanDefinition catDefinition = new RootBeanDefinition();

			catDefinition.setBeanClass(Cat.class);
			//registerBeanDefinition必须知道实例的类型和名字
			registry.registerBeanDefinition("tomCat", catDefinition);
		}
	}
}


