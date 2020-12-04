package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDynamicDropdowns2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com");
		
	
		
		Wait <WebDriver> wait = new WebDriverWait(driver, 5);
		
		TimeUnit.SECONDS.sleep(20);
		
		driver.close();
	}
}
