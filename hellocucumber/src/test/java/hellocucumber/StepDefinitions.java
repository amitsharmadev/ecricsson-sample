package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }
}


public class StepDefinitions {

	private String today;
    private String actualAnswer;

	@Given("today is Sunday")
	public void today_is_Sunday() {
		 today = "Sunday";
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		actualAnswer = IsItFriday.isItFriday(today);
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer);
	}
	
	
	@Given("Running code example")
	public void Running_code_example() {
		actual="Hello";
	}
	
	String actual;
	@When("Enter parameter {string}")
	public void Enter_parameter(String param){
		actual=actual +" "+param;
	}
	
	@Then("It returns Hello {string}")
	public void returning_data(String param) {
		assertEquals(param, actual);
	}
}
