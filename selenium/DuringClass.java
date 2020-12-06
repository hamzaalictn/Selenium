package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DuringClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");

		// login
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		;
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']")).sendKeys("test");
		;
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']")).click();

		// Verify the text Welcome, Tester at the top right of the screen.

		String text = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).getText();
		System.out.println(text);

		Assert.assertTrue(text.contains("Welcome, Tester"), "String doesn't exist");

		// -5-

		int totalOrder = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr")).size();
		System.out.println("Number of Total order : " + totalOrder);

		// -6-
		driver.findElement(By.xpath("//*[@id='ctl00_menu']/li[3]/a")).click();

		TimeUnit.SECONDS.sleep(10);

		driver.close();

	}

}
