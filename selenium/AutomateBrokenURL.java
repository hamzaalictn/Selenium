package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutomateBrokenURL {
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		// Load the website
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().fullscreen();

		// get URl's

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		for (WebElement link : links) {

			String URL = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(URL).openConnection();

			conn.setRequestMethod("HEAD");
			conn.connect();

			int resCode = conn.getResponseCode();

			System.out.println(resCode);

			if (resCode > 400) {

				System.out.println("The link with text : \" " + link.getText() + "  \" is broken code " + resCode);
				try {
				Assert.assertTrue(false);
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
				finally {
					driver.close();
				}
			}

			
		}

	}
}
