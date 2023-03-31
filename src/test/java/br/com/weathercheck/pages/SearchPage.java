package br.com.weathercheck.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * The class represents the search page. 
 * 
 * @author Pamela Inacio Almeida
 */
public class SearchPage {
	
	private WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * The method navigates to Google page. 
	 * 
	 * @author Pamela Inacio Almeida
	 */
	public SearchPage navigateToSearchPage() {
		driver.get("https://www.google.com");
		
		return this;
	}
	
	/**
	 * The method searchs for the parameter passed to it. 
	 * 
	 * @param search: the location to be searched in Google
	 * @return an instance of the result search page
	 * @author Pamela Inacio Almeida
	 */
	public ResultSearchPage searchFor(String search) {
		
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.clear();
		searchBar.sendKeys(search);
		searchBar.sendKeys(Keys.ENTER);
		
		return new ResultSearchPage(driver);
	}

}