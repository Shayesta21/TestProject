import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
import java.util.Set;
public class WindowHandlesAssignment {
	 
	public static void main(String[] args) throws InterruptedException {
		/*Assignment: open Url: https://testautomationpractice.blogspot.com
		 * 1)provide a string in search box and search for it
		 * 2)count no of links
		 * 3)click on each link using for loop
		 * 4)get window id's of each browser
		 * 5)close specific browser window
		 */
        String title;
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1)provide a string in search box and search for it
		WebElement searchbox=driver.findElement(By.cssSelector("input.wikipedia-search-input"));
        searchbox.sendKeys("alert");
        driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();
        
        //2)count no of links
        
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
        System.out.println("The no  of links found are: "+links.size());
        
        //3)click on each link using for loop
        
        for(WebElement link:links) {
        	link.click();
        	Thread.sleep(2000);
        }
        
        //4)get window id's of each browser
       Set<String>windowhandles= driver.getWindowHandles();
       System.out.println("The window id's are: "+windowhandles); 
        
       //5)close specific browser window- Alert - Wikipedia, Alert Bay - Wikipedia
       String originalwindow =driver.getWindowHandle();
       for(String handle: windowhandles) 
    	  
       {
    	   String title1=driver.switchTo().window(handle).getTitle();
       	   System.out.println(title1);
       	   if(title1.equals("Alert - Wikipedia")||title1.equals("Alert Bay - Wikipedia")) {
       		   
    	   driver.close();
    	   
       }  driver.switchTo().window(originalwindow);
    
	      }
}
}
