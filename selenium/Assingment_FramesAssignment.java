package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.Iterator;

public class Assingment_FramesAssignment {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());

		TimeUnit.SECONDS.sleep(2);
		driver.close();

	}
}
