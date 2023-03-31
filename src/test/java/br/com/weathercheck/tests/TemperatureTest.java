package br.com.weathercheck.tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.weathercheck.common.Browser;
import br.com.weathercheck.models.Location;
import br.com.weathercheck.models.WeatherData;
import br.com.weathercheck.pages.ResultSearchPage;
import br.com.weathercheck.pages.SearchPage;
import io.restassured.RestAssured;

public class TemperatureTest extends BaseTest{
	
	private WebDriver driver;
	private SearchPage searchPage;
	private ResultSearchPage resultSearchPage;
	private Location locationGoogle;
		
	@Before
	public void setup() {		
		this.driver = new Browser().createWebdriver();				
	}
	
	@Test
	public void getTheTemperatureOnGoogleAndOpenWeatherAPI() {
		String locationTosearch = "San Francisco";
		
		searchPage = new SearchPage(driver).navigateToSearchPage();
		resultSearchPage = searchPage.searchFor("Weather in " + locationTosearch);
		locationGoogle = resultSearchPage.saveLocationTemperature();
		locationGoogle.setLocationName(locationTosearch);
		
		driver.quit();
		
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("q", locationTosearch + ",us");
		parameters.put("units", "metric");
		parameters.put("APPID", API_KEY);		
		
		WeatherData weatherData = RestAssured.given()
										.queryParams(parameters)
										.log().all()
									.when()
										.get(BASE_PATH_DATA_WEATHER)
									.then()
										.statusCode(200)
										.extract().as(WeatherData.class);
		
		Assert.assertEquals(locationGoogle.getLocationName(), weatherData.getName());
		
		System.out.println("The temperature in " + locationTosearch + " according to Google is: " + locationGoogle.getTemperatureInCelsius() + "." + 
					"\n The temperature in " + locationTosearch + " according to Open Weather Map API is: " + weatherData.getMain().getTemp() + "." +
					"\n The difference between Google and the API is: " + (locationGoogle.getTemperatureInCelsius() - weatherData.getMain().getTemp()));
				
	}	

}
