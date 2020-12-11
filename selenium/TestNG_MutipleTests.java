package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_MutipleTests {

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
	
	@Test
	public void testCase1() {
		System.out.println("Test 1");
	}

	@Test
	public void testCase2() {
		System.out.println("Test 2");
	}

	
	@AfterTest
	public void termination() {

		driver.close();
	}

	

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass ");
	}

	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("BeforeSuit");
	}

	@AfterSuite
	public void afteSuit() {
		System.out.println("AfterSuit");
	}

	// But execution will be
	/*
	 * 
	 * @BeforeSuite
	 * 
	 * @BeforeClass
	 * 
	 * @BeforeMethod
	 * 
	 * 
	 * @Test
	 * 
	 * 
	 * @AfterMethod
	 * 
	 * 
	 * @AfterClass
	 * 
	 * @AfterSuite
	 * 
	 * 
	 */
}
