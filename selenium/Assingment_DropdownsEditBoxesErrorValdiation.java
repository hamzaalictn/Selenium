package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment_DropdownsEditBoxesErrorValdiation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath(" //*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[1]/td[6]/a")).click();
		driver.findElement(By.xpath("//*[@id='ReturnDate']")).click();
		driver.findElement(By.xpath(" //*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[2]/td[1" + "]/a")).click();
		// adult

		WebElement adult = driver.findElement(By.id("Adults"));
		Select selectAdult = new Select(adult);
		selectAdult.selectByIndex(2);

		// Children

		WebElement children = driver.findElement(By.id("Childrens"));
		Select selectChildren = new Select(children);
		selectChildren.selectByIndex(1);
		driver.findElement(By.xpath("//select[@id='Infants']/option[@value='2']")).click();

		// driver.findElement(By.xpath("//select[@id='Childrens']/option[@value='5']")).click();
		driver.findElement(By.xpath("//a[@title=\'More search options\']")).click();
		driver.findElement(By.xpath("//*[@id='AirlineAutocomplete']")).sendKeys("TurksihAirlines");
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();

		WebElement classOfTraver = driver.findElement(By.xpath("//select[@id='Class']"));
		Select selectClassOfTraver = new Select(classOfTraver);
		selectClassOfTraver.selectByValue("First");

		// *[@id="Childrens"]
		TimeUnit.SECONDS.sleep(10);

		driver.close();

	}

}
