package com.spring.config;


import com.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yujiale
 * <p>
 * 配置类
 */
@Configuration
@Import(MainConfigImport.MyImportRegistrar.class)
public class MainConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("李四");
		return person;
	}


}


