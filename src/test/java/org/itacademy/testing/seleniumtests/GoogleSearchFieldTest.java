package org.itacademy.testing.seleniumtests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchFieldTest {

	@Test
	public void firstSeleniumTest() {
		// Set path to chrome web driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		//Launch the Google Website
		driver.get("http://www.google.com");

		//select search field
		WebElement searchField = driver.findElement(By.name("q"));

		//validate that it exists on the page
		Assert.assertTrue(searchField.isDisplayed(), "Search field is not displayed on the page");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.google.com");

		// Close the driver
		driver.quit();
	}
}
