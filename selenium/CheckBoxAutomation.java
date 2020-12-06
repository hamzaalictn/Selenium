package selenium;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;

public class CheckBoxAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().fullscreen();

		// input box
		// <input ="name" name="enter-name" class="inputs" placeholder="Enter Your
		// Name" type="text">

		// tagName[attribute='value']

		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Hamza");

		List<WebElement> checkBoxList = (List<WebElement>) driver
				.findElements(By.xpath("//*[@id='checkbox-example']/fieldset //input[@type='checkbox']"));

		for (int i = 0; i < checkBoxList.size(); i++) {
			checkBoxList.get(i).click();
		}

		System.out.println(checkBoxList.size());

		TimeUnit.SECONDS.sleep(10);

		driver.close();
	}

}
