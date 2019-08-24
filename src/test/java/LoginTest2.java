import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test
	public void Khulja() throws InterruptedException{
//		String driverPath = System.getProperty("user.dir")+"\\browserDriver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
	
		driver.findElements(By.xpath("//form//preceding::button")).get(1).click();	
		
		  Actions action = new Actions(driver);
		  action.sendKeys(Keys.ESCAPE).build().perform();
		 WebElement we= driver.findElement(By.xpath("//span[text=\"TVs & Appliances\"]"));

		  	action.moveToElement(we).perform();
		  
	
	}
	

}
