package br.com.weathercheck.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	private WebDriver driver;	
	
	/**
	 * The method creates and returns a new Chrome driver.
	 * 
	 * @author Pamela Inacio Almeida
	 */
	public WebDriver createWebdriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");			
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

}