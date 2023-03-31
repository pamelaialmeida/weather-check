package br.com.weathercheck.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.weathercheck.models.Location;

/**
 * The class represents the result search page. 
 * 
 * @author Pamela Inacio Almeida
 */
public class ResultSearchPage {
	
	private WebDriver driver;

	public ResultSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * The method saves the location temperature according to Google result. 
	 * 
	 * @return a location object
	 * @author Pamela Inacio Almeida
	 */
	public Location saveLocationTemperature() {
		Location location = new Location();
		location.setTemperatureInCelsius(Integer.parseInt(driver.findElement(By.id("wob_tm")).getText()));		
		return location;
	}

}
