package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSelenium {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Load the website
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().fullscreen();

		// Find the WebElement
		driver.findElement(By.xpath("//div[@id='content']/a[2]")).click();

		// wait for the text to appear

		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("results")));
		String result = driver.findElement(By.cssSelector("div[id='results']")).getText();

		System.out.println(result);

		TimeUnit.SECONDS.sleep(10);

		driver.close();

	}
}
