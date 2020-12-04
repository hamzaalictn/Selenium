package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.Iterator;

public class AssingmentWindowHandlingAssignment {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");

		// click multiple Windows

		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.cssSelector("a[href*='windows']")).click();

		// Click "opening new Window 'click here' "

		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		String parent = it.next();// parent
		String child = it.next();// child
		// stiwching to child window
		driver.switchTo().window(child); // child

		// get text from child window
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());

		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());

		TimeUnit.SECONDS.sleep(2);
		driver.close();

	}
}
