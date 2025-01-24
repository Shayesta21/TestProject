package dropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment1SelectDropdrowns {
	public static void main(String[]args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https:phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	
	WebElement dropdown=driver.findElement(By.id("country-list"));
	Select select=new Select(dropdown);
	
	//counting total no of options
	List<WebElement> countries=select.getOptions();
	System.out.println("The total no of options in this dropdownlist are: "+countries.size());
	
	//print all the options from the list
	System.out.println("The list of countries are:");
	for(int i=0;i<countries.size();i++) {
		
		System.out.println(countries.get(i).getText());
	}
	
	//select one option
	select.selectByVisibleText("Brazil");
	select.selectByIndex(5);
	select.selectByValue("4");
	
	//using enhanced for loop
       for(WebElement eachoption: countries) {
	        System.out.println(eachoption.getText());
          }
	
	
	
	
	}
}
