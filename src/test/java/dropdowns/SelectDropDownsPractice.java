
package dropdowns;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownsPractice {

	public static void main(String[] args) {
		
		/*drop down using Select: 3 methods
		 * 
		 * 1)using  selectByIndex()
		 * 2)using  selectByValue()
		 * 3)using  selectByVisibletext()
		 * 
		 * 4)Counting total no of options in the select drop down
		 * 
		 * 5)printing all options from the select drop down
		 * using normal for loop
		 * using enhanced for loop
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        
       WebElement ele= driver.findElement(By.xpath("//label[@for='country']"));
       
       Point p=ele.getLocation();
       int x=p.getX();
       int y=p.getY();
      
       System.out.println(x);
       System.out.println(y);
       
       
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(289,875)");
       
       
       WebElement countries =driver.findElement(By.xpath("//select[@id='country']"));
       Select country =new Select(countries);
       
       //1)using  selectByIndex()
   //    Select country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
       country.selectByIndex(5);
      

       //2)using  selectByValue()
       country.selectByValue("france");
       
       //3)using  selectByVisibletext()
       country.selectByVisibleText("India");
       
       
       //4) Counting total no of options in the select drop down using options
       
       List <WebElement> optionslist=country.getOptions();
       System.out.println("The total no of options in the select dropdown are: "+ optionslist.size());
       
       
       //5)printing all options from the select drop down-using normal for loop
       
       /*for(int i=0;i<optionslist.size();i++) {
    	   System.out.println(optionslist.get(i).getText());
       }*/
       
       //using enhanced for loop
       
       for(WebElement op: optionslist) {
    	   
    	   System.out.println(op.getText());
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

	
	}

