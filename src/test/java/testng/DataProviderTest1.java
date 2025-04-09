package testng;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DataProviderTest1 {
	
	WebDriver driver;
	
	@BeforeTest
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		}
	
	@Test (dataProvider="dp")
	void loginTest(String email, String pwd) throws InterruptedException {
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys(email);
		
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("signon")).click();
		Thread.sleep(2000);
		boolean message=driver.findElement(By.id("WelcomeContent")).isDisplayed();
		if(message==true) {
			driver.findElement(By.linkText("Sign Out")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
		
			}
	
	@AfterTest
	void tearDown() {
		
		driver.close();
		
	}
	//data provider always returns data in a 2 dimensional array it can be string or object data type
	
	@DataProvider (name="dp", indices= {0,1})
	Object[][] loginTest() {
		
		Object data[][]= {{"abc@gmail.com","test123"},
	                      {"xyz@gmail.com","Test123"},
                          {"lmn@gmail.com","Test123"},
                          {"Shay21","Password123"}};
		
		return data;
	
	
	
		
	}
	
	
	
	
	

}
