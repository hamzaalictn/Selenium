package selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hamzaalicetin/Downloads/chromedriver");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://google.com"); // hit url on the browser
	
		System.out.println(driver.getTitle()); // validate if your Page title is correct
		
		System.out.println(driver.getCurrentUrl()); // validate you are landed on correct url
		
		//Checking page source 
		
		
		System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");	
	
		driver.navigate().back();
		driver.close();// Close current browser
		driver.quit();// Close all the browsers opened by selenium script
		
		
	}
	
}

