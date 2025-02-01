package mouseactions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		
		WebElement button =driver.findElement(By.xpath("//*[@id=\"HTML10\"]/h2"));
		Point p=button.getLocation();
		 int x=p.getX();
		 int y =p.getY();
		 System.out.println(x);
		System.out.println(y);//939//1260
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(939,1260)");
		
		WebElement but1=driver.findElement(By.cssSelector("#field1"));
		WebElement but2=driver.findElement(By.id("field2"));
		but1.clear();
		but1.sendKeys("Shayesta");
		
		Thread.sleep(3000);
		
		//perform double click
	    WebElement but3=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions act= new Actions(driver);
		act.doubleClick(but3).perform();
		
		//Validate the result
		String text=but2.getAttribute("value");
		System.out.println("The captured value is: "+text);
		if(text.equals("Shayesta")) {
			System.out.println("correct result");
		}else {
			System.out.println("incorrect result");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
