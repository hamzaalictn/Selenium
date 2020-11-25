package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com"); // URL in the browser

		// locate the email box

		driver.findElement(By.id("email")).sendKeys("hmzctn@hotmail.com");
		;

		// enter the password
		driver.findElement(By.name("pass")).sendKeys("iq4jarfk");
		driver.findElement(By.xpath("//*[@target='Forgotten password?']")).clear();

		//driver.close();
	
		// <span class="RveJvd snByac">I agree</span>
		driver.findElement(By.cssSelector("input[name='login']")).click();

		
	}
}
