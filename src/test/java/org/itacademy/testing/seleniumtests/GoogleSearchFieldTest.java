package org.itacademy.testing.seleniumtests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchFieldTest {

	@Test
	public void firstSeleniumTest() throws InterruptedException {
/*		List<String> linkedListCars = new LinkedList<>();
		linkedListCars.add("Volvo");
		linkedListCars.get(0);
		linkedListCars.remove(0);
		linkedListCars.remove("Volvo");

		List<String> arrayListCars = new ArrayList<>();
		arrayListCars.add("Volvo");
		arrayListCars.get(0);
		arrayListCars.remove(0);
		arrayListCars.remove("Volvo");

		Set<String> hashSetCars = new HashSet<>();
		hashSetCars.add("Volvo");
		hashSetCars.remove("Volvo");

		for (Iterator<String> it = hashSetCars.iterator(); it.hasNext(); ) {
			String car = it.next();
			if (car.equals("Volvo")) {
				System.out.println(car);
			}
		}

		Map<String, String> mapCars = new HashMap<>();
		mapCars.put("Trade mark", "Volvo");
		mapCars.get("Trade mark");
		mapCars.remove("Trade mark");*/

		// Set path to chrome web driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		//Launch the Google Website
		driver.get("http://www.google.com");

		Thread.sleep(2000);

		//select search field
		WebElement searchField = driver.findElement(By.name("q"));

		Thread.sleep(2000);

		//validate that it exists on the page
		Assert.assertTrue(searchField.isDisplayed(), "Search field is not displayed on the page");

		Thread.sleep(2000);

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.google.com");

		Thread.sleep(2000);

		// Close the driver
		driver.quit();
	}
}
