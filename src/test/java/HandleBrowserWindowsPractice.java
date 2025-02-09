import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleBrowserWindowsPractice {

	public static void main(String[] args) {

       WebDriver driver= new ChromeDriver();
       
       driver.get("https://magento.softwaretestingboard.com/");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.manage().window().maximize();
      /* For Single window id
      String id= driver.getWindowHandle();
      System.out.println("the first window id is "+id); 
      */
     /*to get the button location
      * WebElement button= driver.findElement(By.linkText("Write for us"));
     //to get the location of an element; x-axix, y axis
     Point p=button.getLocation();
     int x=p.getX();
     int y=p.getY();
     
     System.out.println("x-axix"+x);
     System.out.println("y-axix"+y);*/
     
     
     JavascriptExecutor js =(JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(139,2436)");
     
     WebElement button= driver.findElement(By.linkText("Write for us"));
     button.click();
     
     Set<String> winid=driver.getWindowHandles();
     //approach 1: using list when we have 2 window id's, we can use the getTitle() and switch easily
     
    /* List<String>windowlist= new ArrayList(winid);
     String parentid=windowlist.get(0);
     String childid=windowlist.get(1);
     
     //switch to child id
     driver.switchTo().window(childid);
     System.out.println(driver.getTitle());
     
     
     //switch to parent id
     driver.switchTo().window(parentid);
     System.out.println(driver.getTitle());
     
     //Using in  a single line approach
      
      
      List <String> windowlist = new ArrayList(driver.getwindowHandles());   
      driver.switchTo.window(windowlist.get(1));
          
    */
     
     
     //approach 2 using enhanced for loop
     
     for(String windowid:winid) {
    	String t1= driver.switchTo().window(windowid).getTitle();
    	System.out.println("The window id's are: "+windowid);
     if(t1.equals("Home page")) {
    	 System.out.println("this is the fist id: ");
     }else {
    	 System.out.println("This is the second browser window "+driver.getCurrentUrl());
     }
     
     }
     
     
     
     
     
     
	}

}
