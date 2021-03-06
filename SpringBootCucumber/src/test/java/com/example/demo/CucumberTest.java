package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.runner.RunWith;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources"	)
public class CucumberTest extends SpringBootCucumberApplicationTests{
	ResponseEntity<String> latestResponse;
	
	@When("^the client calls /version$")
	public void the_client_issues_GET_version() throws Throwable{
		
	    latestResponse=restTemplate.getForEntity("http://localhost:8080/version",String.class);
	}
	 
	@Then("^the client receives status code of (\\d+)$")
	public void the_client_receives_status_code_of(int statusCode) throws Throwable {
	    HttpStatus currentStatusCode = latestResponse.getStatusCode();
	    assertThat("status code is incorrect : "+ 
	    latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
	}
	 
	@And("^the client receives server version (.+)$")
	public void the_client_receives_server_version_body(String version) throws Throwable {
	    assertThat(latestResponse.getBody(), is(version));
	}
}