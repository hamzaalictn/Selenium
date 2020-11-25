package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceHomePageTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("hamzacetn@salesforce.com");
		
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345678");;

		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();		
		
		
	}
}
