package com.spring.config;

import com.spring.bean.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: spring
 * @author: yjl
 * @created: 2021/12/09
 */
@Configuration
@Import(Person.class)
public class MainConfigImport {

}


