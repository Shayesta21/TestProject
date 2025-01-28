package datepickershandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerPractice {

	public static void main(String[] args) {
		/*
		 *1) using send keys method
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		//1) using send keys method
	//	driver.findElement(By.cssSelector("input#datepicker")).sendKeys("01/07/2025");
		
		//2)using date picker element
		driver.findElement(By.cssSelector("input#datepicker")).click();
		
		String month="May";
		String year="2025";
		String date="09";
		while(true) {
		String currentmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(currentmonth.equals(month) && currentyear.equals(year)) {
			break;
		}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}

	}

}
