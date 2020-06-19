package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;


@WebAppConfiguration
@CucumberContextConfiguration
//@ContextConfiguration( classes = CucumberTest.class)
class SpringBootCucumberApplicationTests {

	protected RestTemplate restTemplate = new RestTemplate();
	 
    protected final String DEFAULT_URL = "http://localhost:8080/";

}
