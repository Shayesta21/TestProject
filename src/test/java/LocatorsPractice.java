import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		/*test case
		 * launch browser
		 * maximize page
		 * click on laptops button
		 * select sonyvio i5
		 * Add to cart
		*/
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	/*Locators: using id, link text, partial link text
	  UsingID
	  driver.findElement(By.id("itemc")).click();
		
	  Using link text
	  driver.findElement(By.linkText("Laptops")).click(); 
		
	  Using partial link text	*/
	  driver.findElement(By.partialLinkText("Lap")).click();
	  Thread.sleep(3000);
	  
	  //Using Xpath
	  driver.findElement(By.xpath("//a[@class=\"hrefch\"]")).click();
	  
	  //Using CSS
	  
	   driver.findElement(By.cssSelector("a.btn[onclick=\"addToCart(8)\"] ")).click();
	

}
}