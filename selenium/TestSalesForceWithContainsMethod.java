package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSalesForceWithContainsMethod {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("hamzacetn@salesforce.com");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");

		
		//<input type="submit" name="proceed" value="Sign in" title="Sign in" tabindex="4" class="signinbtn">
		
		driver.findElement(By.xpath("//input[contains(@title,'Sign in')]")).click();

	
	}

}
