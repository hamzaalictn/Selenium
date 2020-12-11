package selenium;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG_01 {
	public String baseURL = "https://www.edureka.co/";
	String driverPath = "/Users/hamzaalicetin/Downloads/chromedriver";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseURL);
	}

	@Test
	public void verifyingHomapageTitle() {
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void termination() {

		driver.close();

	}
}
