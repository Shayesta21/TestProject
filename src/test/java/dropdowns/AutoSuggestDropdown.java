package dropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestDropdown {
public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();	
		
	driver.get("https://www.google.com");	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Thread.sleep(5000);
//	driver.findElement(By.cssSelector("button[aria-label='Stay signed out']")).click();
	
	WebElement searchbut =driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	searchbut.sendKeys("java");
	
	
	List<WebElement>searchlist =driver.findElements(By.xpath("//ul[@jsname='bw4e9b' and @class='G43f7e' and @role='listbox']//li"));
	
	System.out.println("the total no of diplayed options list are: "+searchlist.size());
	//to select all options
	for(int i=0;i<searchlist.size();i++) {
		System.out.println(searchlist.get(i).getText());
		//to select a single option
		
		if(searchlist.get(i).getText().equals("java compiler")) {
			searchlist.get(i).click();
			break;
		}
		
		
	}
	

	
		
	}

}
