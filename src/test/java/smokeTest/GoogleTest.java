package smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



@Test
public class GoogleTest {
	
	
	public void Google() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("rolex");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
