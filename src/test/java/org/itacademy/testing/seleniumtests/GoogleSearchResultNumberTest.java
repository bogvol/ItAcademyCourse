package org.itacademy.testing.seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleSearchResultNumberTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Set path to chrome web driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //open browser window full mode;
	}

	@Test
	public void googleSearchResultNumberTest() throws InterruptedException {
		// Launch the Google Website
		driver.get("http://www.google.com");
		Thread.sleep(4000); // wait for 4 seconds (4000 milliseconds)

		// select search field
		WebElement searchField = driver.findElement(By.name("q"));

		// type text "buy a car" and press enter
		searchField.sendKeys("buy a car" + Keys.RETURN);
		Thread.sleep(4000); // wait for 4 seconds (4000 milliseconds)

		List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='srg']/div[@class='g']"));
		Thread.sleep(4000); // wait for 4 seconds (4000 milliseconds)

		//validate that the number of found results is equal to 10
		Assert.assertEquals(searchResults.size(), 10, "Search result is not equal to 10");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit(); // close all windows, clear sessions and finish job (preferable)
	}

}
