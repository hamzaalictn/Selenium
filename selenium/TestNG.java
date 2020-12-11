package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

	public String baseURL = "https://www.edureka.co/";
	String driverPath = "/Users/hamzaalicetin/Downloads/chromedriver";
	public WebDriver driver;

	@Test
	public void verifyingHomapageTitle() {
		System.out.println("Lounching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseURL);
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}

	
	
}

