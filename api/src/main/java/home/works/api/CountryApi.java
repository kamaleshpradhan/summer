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
	public static void jvmStat(){
		System.out.println("================== JVM Memory =====================");
		System.out.println("Max Memory -> "+ (Runtime.getRuntime().maxMemory()/(1024*1024)) + " MB");
		System.out.println("Total Memory -> "+ (Runtime.getRuntime().totalMemory()/(1024*1024)) + " MB");
		System.out.println("Free Memory -> "+ (Runtime.getRuntime().freeMemory()/(1024*1024)) + " MB");
		System.out.println("====================================================");
	}

}
