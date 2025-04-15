package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage1{
	
	/*Page object class
	 * In page object model you need to have 3 things 1)constructor 2)locators 3) action methods
	 */
	
	
	//constructor- for the constructor declare the WebDriver at class level create a constructor and pass driver as its parameter
	
	WebDriver driver;
	
	

	public LoginPage1(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//locators
	
	
	
	
	By btn_signin_loc= By.linkText("Sign In");
	By txt_username_loc=By.name("username");
	By txt_password_loc= By.name("password");
	By btn_login_loc =By.name("signon");
	
	
	//Action methods
	
	public void clickSignIn() {
		driver.findElement(btn_signin_loc).click();
	
	}
	
	public void setUserName(String user) {
		driver.findElement(txt_username_loc);
		
	}
	
	public void setPassword(String pwd) {
		driver.findElement(txt_password_loc);
	}
	
	
	public void clickLogin() {
		driver.findElement(btn_login_loc);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}