package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Utf8;

public class Assignment2SelectDropdown {

	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement dropdown= driver.findElement(By.id("colors"));
        
        Point p=dropdown.getLocation();
        
        int x= p.getX();
        int y=p.getY();
        
        System.out.println(x);
        System.out.println(y);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(289,875)");
        
        Select sl=new Select(dropdown);
        
        //get total options
        
        List <WebElement> optionslist =sl.getOptions();
        System.out.println("the total options are: "+optionslist.size());
        
        
        //print all options
        System.out.println("The total options are: ");
        for(int i=0;i<optionslist.size();i++) {
        	System.out.println(optionslist.get(i).getText());
        }
        
        //select single
        sl.selectByValue("green");
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
