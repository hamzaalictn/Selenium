package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentWindowHandling {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).click();

		// click ' Click here' button
		driver.findElement(By.xpath("//div[@id='content']/div/a")).click();

		// Getting Windows
		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		/*
		 * Second Solution ArrayList<String> abcList= new ArrayList<String>(abc); String
		 * parent = abcList.get(0); String child= abcList.get(1);
		 */

		// Identifying parent page
		String parent = it.next();

		// Identifying parent page
		String child = it.next();

		// Switching to Child window getting text
		driver.switchTo().window(child);

		// Get the text 'New Window'
		String text1 = driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(text1);

		// Switching to Parent window and getting text
		driver.switchTo().window(parent);
		String text2 = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(text2);

	}
}
