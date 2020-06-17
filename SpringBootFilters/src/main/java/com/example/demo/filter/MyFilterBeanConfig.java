package com.example.demo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterBeanConfig {

	
	@Bean
	FilterRegistrationBean<CustomFilter> getBean(){
		
		FilterRegistrationBean<CustomFilter> mybean= 
				new FilterRegistrationBean<CustomFilter>();
		mybean.setFilter(new CustomFilter());
		mybean.addUrlPatterns("/data");
		return mybean;
	}
}
