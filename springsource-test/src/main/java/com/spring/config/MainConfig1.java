package com.spring.config;


import com.spring.bean.Person1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yujiale
 * <p>
 * 配置类
 */
@Configuration
public class MainConfig1 {

	@Bean
	public Person1 person() {
		Person1 person1 = new Person1();
		person1.setName("李四");
		return person1;
	}


}


