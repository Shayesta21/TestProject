package pageobjectmodel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
public class LoginTest {
	
	WebDriver driver;
	@BeforeClass
	void setUp(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	
	
	@Test
	void testLogin() throws InterruptedException {
	//	LoginPage1 lp = new LoginPage1(driver);
		LoginPage2 lp = new LoginPage2(driver);
		Thread.sleep(7000);
		lp.clickSignIn();
		lp.setUserName("Shay21");
		lp.setPassword("Password123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(), "JPetStore Demo");
		
	}
	

	@AfterClass
	void teatDown() {
		driver.close();
		
	}
	
	
	
}
