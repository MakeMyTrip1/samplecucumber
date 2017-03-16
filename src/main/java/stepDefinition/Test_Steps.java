package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Test_Steps {

	public static ChromeDriver driver;
	
	@Given("^User is in Homepage$")
	public void user_is_in_Homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.get("http://www.store.demoqa.com");

		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Given("^User navigated to login page$")
	public void user_navigated_to_login_page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	    
	}

	@When("^User is able to enter username \"([^\"]*)\"$")
	public void user_is_able_to_enter_username(String userName) throws Throwable {
		driver.findElement(By.id("log")).sendKeys(userName); 
	    
	}

	@When("^able to enter password  \"([^\"]*)\"$")
	public void able_to_enter_password(String password) throws Throwable {
		 driver.findElement(By.id("pwd")).sendKeys(password);
	    
	}

	@When("^User should click Login button\\.$")
	public void user_should_click_Login_button() throws Throwable {
		 driver.findElement(By.id("login")).click();
	    
	}

	@Then("^Error : Invalid Login credential message should be displayed$")
	public void error_Invalid_Login_credential_message_should_be_displayed() throws Throwable {
		Thread.sleep(3000);
        System.out.println(driver.findElement(By.className("response")).getText());
        driver.quit();
	    
	}	
	
}
