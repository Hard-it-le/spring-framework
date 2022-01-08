package com.spring.config;


import com.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yujiale
 * <p>
 * 配置类
 */
@Configuration
public class MainConfig {

	@Bean
	public Person person() {
		Person person1 = new Person();
		person1.setName("李四");
		return person1;
	}


}


