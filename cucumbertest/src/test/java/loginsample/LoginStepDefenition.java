package loginsample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginStepDefenition {
	
//	WebDriver driver = null;
//	@Before
//	@When("open browser")
//	public void open_browser() {
//	
//		System.out.println("Open browser");
//		
//		String path = System.getProperty("user.dir");
//		System.out.println("path is: "+path);
//		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/driver/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//	
//	@And("goto login page")
//	public void goto_login_page() {
//		
//		System.out.println("goto login page");
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");		
//	}
//
//	@Given("enter valid username")
//	public void enter_valid_username() {
//		
//		System.out.println("enter username");
//		driver.findElement(By.id("username")).sendKeys("student");
//	}
//
//	@And("enter valid password")
//	public void enter_valid_password() throws InterruptedException {
//		
//		System.out.println("enter password");
//		driver.findElement(By.id("password")).sendKeys("Password123");
//		Thread.sleep(3000);
//	}
//
//	@And("click login")
//	public void click_login() {
//		
//		System.out.println("Click login");
//		driver.findElement(By.id("submit")).click();
//	}
//
//	@Then("navigate to home page")
//	public void navigate_to_home_page() throws InterruptedException {
//		
//		System.out.println("Navigate Home page");
//		Thread.sleep(3000);
//		driver.getPageSource().contains("Log out");	
//	}
//	
//	@After
//	public void closebrowser() {
//		
//		System.out.println("Browser closed");
//		//driver.close();
//		driver.quit();
//		
//	}



}
