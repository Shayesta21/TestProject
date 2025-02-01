package datepickershandling;
import java.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class DatePickerPractice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement button=driver.findElement(By.xpath("//label[@for='animals']"));
		
		Point p=button.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(x);
		System.out.println(y);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(289,1115)");
		
		
		driver.findElement(By.cssSelector("input#txtDate")).click();
		
		WebElement selectmonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sm= new Select(selectmonth);
		sm.selectByVisibleText("Aug");
		
		
		WebElement selectyear= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sy= new Select(selectyear);
		sy.selectByValue("2015");
		
		String reqdate="19";
		List <WebElement> selectdate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement date: selectdate) {
			
			if(date.getText().equals(reqdate)) {
				date.click();
				break;
			}
			
		}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Start Date']")).sendKeys("2025-01-28");
		
		
		
		
		
		
	}

}
