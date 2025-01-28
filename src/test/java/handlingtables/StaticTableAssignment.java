package handlingtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticTableAssignment {

	public static void main(String[] args) {

           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
           driver.get("https://blazedemo.com");
           
           
           WebElement dropdown = driver.findElement(By.name("fromPort"));
           
           Select select = new Select(dropdown);
           
           select.selectByVisibleText("Boston");
           
           WebElement dropdown2=driver.findElement(By.name("toPort"));
           Select sel2 = new Select(dropdown2);
           
           sel2.selectByValue("New York");
           
           driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();
           
           int row =driver.findElements(By.tagName("tr")).size();
           System.out.println("The total no of rows are: "+ row);
           
          int column = driver.findElements(By.xpath("//table[@class='table']//tr//th")).size();
          System.out.println("the total no of columns in this table are: "+ column); 
          
          String clotext =driver.findElement(By.xpath("//table[@class='table']//tr[4]//td[3]")).getText();
          System.out.println(clotext);
          
          //print price of all flights
           System.out.println("The price of each flight is: ");
           int lp=0;
          for(int r=1;r<=row;r++) {
        	  
        	 String price= driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
        	 System.out.println(price);
        	 
        	 
        	 
        	
          }
         
          
          
          
           
           
           
           
           
           
	}

}
