package testng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P2Test {
	
	/*
	 * Test case:
	 * open application
	 * check for logo
	 * login
	 * close
	 * 
	 * 
	 */
	WebDriver driver;
  
	@Test (priority=1)
	void openapp() {
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test (priority=2)
	void logocheck() throws InterruptedException {
		
		Thread.sleep(3000);
		boolean logostatus= driver.findElement(By.xpath("//img[@src='../images/logo-topbar.svg']")).isDisplayed();
		System.out.println("The logo is displayed "+logostatus);
	}
	
	@Test (priority=3)
	void login() throws InterruptedException {
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Shay21");
		driver.findElement(By.name("password")).sendKeys("Password123");
	}
	
	@Test (priority=4)
	void close() {
		driver.close();
	}
	
}
