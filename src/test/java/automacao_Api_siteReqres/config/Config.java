package automacao_Api_siteReqres.config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class Config {
	
	public static final String BASE_URL ="https://reqres.in/";
	
	static {
		RestAssured.baseURI = BASE_URL;
		RestAssured.requestSpecification = new RequestSpecBuilder()
				.addHeader("Content-Type", "application/json")
				.build();
		
	}
	

}
