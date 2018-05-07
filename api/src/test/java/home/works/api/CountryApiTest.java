package home.works.api;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/"
		,glue={"home.works.api"}
		)
public class CountryApiTest {
	
	
	
	/*private static CountryApi ca;
	@BeforeClass
	public static void init() {
		ca=new CountryApi("https://restcountries.eu/rest/v2/all");
	}
	@Test
	public void validateStatusCode() {
		System.out.printf("Status Code - %d\n",ca.getStatusCode());
		Assert.assertTrue("Api failed", ca.getStatusCode()==200);
	}*/

}
