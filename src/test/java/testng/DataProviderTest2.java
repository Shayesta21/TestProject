package testng;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataProviderTest2 {
     WebDriver driver;
	@BeforeTest
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
			}
	
	@Test (dataProvider="dp1")
	 void LoginTest(String email, String pwd) throws InterruptedException {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(2000);
		
		
		
		Boolean logo =driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();

		 if (logo==true){

			 
		Assert.assertTrue(true);
		
		    	

		}else{
		Assert.fail();
		}
		 
	 }
	
	@AfterTest
	void tearDown() {
		driver.close();
	}
	
	
	@DataProvider (name="dp1")
	
	Object  [][]loginData(){
    Object data[][]={{"abc@gmail.com","test123"},
                     {"xyz@gmail.com","Test123"},
                     {"lmn@gmail.com","Test123"},
                     {"nausheen.shayesta86@gmail.com","Password123"} };  



return data;
}
	
	
	
	
	
	
}
