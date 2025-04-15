package pageobjectmodel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class LoginPage2 {
	//using PageFactory
	//constructor
	WebDriver driver;
	
	public LoginPage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
		
	@FindBy(linkText="Sign In")
	WebElement btn_sign_on;
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(name="signon")
	WebElement btn_login;
	
	
	 //**************Another method************************
	 
	 @FindBy(how=How.NAME, using="username")
	 WebElement txt_username1;
	 
	 //for WebElements
	 @FindBy(tagName="a")
	 List<WebElement>links;
	//Action Methods
	
	public void clickSignIn() {
		btn_sign_on.click();
	
	}
	
	public void setUserName(String user) {
		txt_username.sendKeys(user);
		
	}
	
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	
	public void clickLogin() {
		btn_login.click();
	}
	
	
	
	
	
	
	
	

}
