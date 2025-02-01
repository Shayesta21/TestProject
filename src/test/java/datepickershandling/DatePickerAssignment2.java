package datepickershandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerAssignment2 {

	public static void main(String[] args) throws InterruptedException {
	
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();
		
		String exmonthyear ="April 2025";
		String day="16";
		
		while(true)
		{
			String currentmonthyear = driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div")).getText();	
			if(currentmonthyear.equals(exmonthyear)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			
				List <WebElement> alldates= driver.findElements(By.xpath("//p[@class='fsw__date']"));
				
				for(WebElement e :alldates) {
					
					String calendarDay=e.getText();
					if(calendarDay.equals(day)) {
						e.click();
						break;
					}
				}
			
		      
		      
		
					
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
