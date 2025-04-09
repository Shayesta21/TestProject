package testng;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ParallelTesting {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browser"})
	void setupTest(String br){
		switch(br) {
		
		case "chrome"	:driver = new ChromeDriver(); break;
		case "edge"     :driver =new EdgeDriver();    break;
		case "firefox" : driver = new FirefoxDriver();break;
		default: System.out.println("invalid browser"); return;
		}
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	void logoTest() throws InterruptedException {
		Thread.sleep(7000);
		Boolean logo =driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
		
	}
	
	@Test
	void titleTest() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	
	
	@Test
	void urlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterTest
	void teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
