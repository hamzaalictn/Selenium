package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentHandlingFrames {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com");

		// Nested Frames

		driver.findElement(By.xpath("//div[@id='content']/ul/li[34]/a")).click();

		// How many Frame we have on this web site ?
		int size = driver.findElements(By.tagName("frame")).size();
		System.out.println(size);

		// Nested Frame
		// Get the Frame
		driver.switchTo().frame("frame-top");

		// How many frame we have in frame-top ?
		size = driver.findElements(By.tagName("frame")).size();
		System.out.println(size);

		// Switch to the framework we are going to work on
		driver.switchTo().frame("frame-middle");

		// Find the element > Xpath : "//*[@id='content']"
		System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());

		TimeUnit.SECONDS.sleep(20);
		driver.close();
	}
}
