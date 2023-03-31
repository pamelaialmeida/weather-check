package br.com.weathercheck.common;

import io.restassured.http.ContentType;

/**
 * This interface maps all the constants that will be used during the test of the Open Weather API.
 * @author Pamela Inacio Almeida
 */
public interface Constants {
	
	String BASE_URL = "https://api.openweathermap.org";
	
	String BASE_PATH_DATA_WEATHER = "/data/2.5/weather";
	
	ContentType CONTENT_TYPE = ContentType.JSON;
	
	String API_KEY = "6fc37b4c879223b3797a5dc9f8344646";

}
