package loginpagepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	
	WebDriver driver;
	
	By txt_username = By.id("username");
	
	By txt_password = By.id("password");
	
	By btn_login = By.id("submit");
	
	By btn_logout = By.xpath("/html/body/div/div/section/div/div/article/div[2]/div/div/div/a");
			
	public LoginPagePOM(WebDriver driverpom) {
		driver = driverpom;
		
	}
	
	public void enter_user_name(String username) {
		driver.findElement(txt_username).sendKeys(username);;
	}
	
	public void enter_password(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void click_login() {
		driver.findElement(btn_login).click();
	}
	
	public void check_logout() {
		driver.findElement(btn_logout).isDisplayed();
	}

}
