package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		 driver.get("http://www.store.demoqa.com");
		 
	        // Find the element that's ID attribute is 'account'(My Account) 
	 
	        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	        // Find the element that's ID attribute is 'log' (Username)
	 
	        // Enter Username on the element found by above desc.
	 
	        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
	 
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 
	        driver.findElement(By.id("pwd")).sendKeys("Test@123");
	        
	        driver.findElement(By.id("login")).click();
	        Thread.sleep(3000);
	        System.out.println(driver.findElement(By.className("response")).getText());
	 
	        // Close the driver
	 
	        driver.quit();

	}

}
