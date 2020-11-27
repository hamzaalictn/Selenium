package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicDropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		
		driver.findElement(By.xpath("//input[@class='select_CTXT'][1]")).sendKeys("DIB");;
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).sendKeys("AMD");;
		TimeUnit.SECONDS.sleep(20);
		
		driver.close();
		
	
		
		
	}
}
