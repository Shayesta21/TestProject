package dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;

public class AutoSuggestDropdownAssignment {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://Bjs.com");
		
		driver.findElement(By.cssSelector("input[placeholder='What are you looking for today?']")).sendKeys("water");
		
		List <WebElement> el=driver.findElements(By.xpath("//div[@class='col-6 col-md-4']//a"));
		System.out.println("The displayed search options total is: "+el.size());
		
		System.out.println("The options displayed are: ");
		for(int i=0;i<=el.size();i++) {
			System.out.println(el.get(i).getText());
			if(el.get(i).getText().equals("bottled water")) {
			 el.get(i).click();	
			}
		}
		
		
		
		
		
	}

}
