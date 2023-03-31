package br.com.weathercheck.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		WebElement temperature = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("wob_tm")));
		
		location.setTemperatureInCelsius(Integer.parseInt(temperature.getText()));
//		location.setTemperatureInCelsius(Integer.parseInt(driver.findElement(By.id("wob_tm")).getText()));		
		return location;
	}

}
