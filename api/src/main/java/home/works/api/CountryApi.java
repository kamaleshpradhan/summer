package home.works.api;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CountryApi {
	
	private String uri;
	public CountryApi(String uri) {
		this.uri=uri;
	}
	public int getStatusCode() {
		Response res= given().
		baseUri(uri).
		when().
		get().
		andReturn();
		//getStatusCode();
		//System.out.println(res.prettyPrint());
		return res.getStatusCode();
	}

}
