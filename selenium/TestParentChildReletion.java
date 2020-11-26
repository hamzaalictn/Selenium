package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestParentChildReletion {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		//	TimeUnit.MILLISECONDS.sleep(999);
		
		for (int i = 10; i >=0; i--) {

			

			driver.findElement(By.xpath(
					"//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"))
					.sendKeys(i + "");
			TimeUnit.SECONDS.sleep(1);
			driver.findElement(By.xpath(
					"//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).clear();
		}

		TimeUnit.SECONDS.sleep(1);
		
		driver.close();
		
	}

}
