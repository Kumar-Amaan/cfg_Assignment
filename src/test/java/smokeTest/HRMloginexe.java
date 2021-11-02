package smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class HRMloginexe {

	public void HRM() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();
		driver.findElement(By.cssSelector("#menu_directory_viewDirectory > b")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}
}
