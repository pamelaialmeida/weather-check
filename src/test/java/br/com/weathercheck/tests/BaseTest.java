package br.com.weathercheck.tests;

import org.junit.BeforeClass;

import br.com.weathercheck.common.Constants;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class BaseTest implements Constants{
	
	/**
	 * The apiSetUp method sets the base url to Rest Assured. 
	 * It also builds the request specification with the content type to be used in all requests.
	 * 
	 * @author Pamela Inacio Almeida
	 */
	@BeforeClass
	public static void apiSetUp() {
		RestAssured.baseURI = BASE_URL;
		
		RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
		requestBuilder.setContentType(CONTENT_TYPE);
		RestAssured.requestSpecification = requestBuilder.build();
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}

}
