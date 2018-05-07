package home.works.api;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class CountryApiStepsDef {
	
	
	CountryApi ca;
	int status;
	@Given("The country api (.*)")
	public void the_Country_Api_Uri(String uri) {
		System.out.println("Given URI - "+uri);
		ca=new CountryApi(uri);
	}
	@When("The api is triggered")
	public void the_Api_Is_Triggerred() {
		status=ca.getStatusCode();
	}
	@Then("(\\d+) is returned")
	public void satus_Code_Is_Returned(int code) {
		
		System.out.printf("Status code - %d\n",status);
		assertTrue("Invalid status code", status==code);
	}
	

}
