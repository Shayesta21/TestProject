package datepickershandling;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerPractice {

	public static void main(String[] args) {
		/*
		 *1) using send keys method
		 *2)using date picker element
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		//1) using send keys method
	//	driver.findElement(By.cssSelector("input#datepicker")).sendKeys("01/07/2025");
		
		//2)using date picker element
		driver.findElement(By.cssSelector("input#datepicker")).click();//opens date picker
		//select month and year
		String month="May";
		String year="2020";
		String date="9";
		while(true) {
		String currentmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(currentmonth.equals(month) && currentyear.equals(year)) {
			break;
		}
		//	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next button
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous button
		}
		
		List <WebElement> alldates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dts: alldates) {
			
			if(dts.getText().equals(date)) {
				dts.click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
