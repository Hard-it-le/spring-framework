package com.spring.config;


import com.spring.bean.Person2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yujiale
 * <p>
 * 配置类
 */
@Configuration
public class MainConfig2 {

	@Bean
	public Person2 person() {
		Person2 person2 = new Person2();
		person2.setName("李四");
		return person2;
	}
}


