package brokenlink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
public class BrokenLinkPractice {

	public static void main(String[] args) throws IOException {
	
	    /*
	     * 1)get total no of links from the page
	     * we need to check if href has value or not
	     * 
	     * 2)check if the server returns the status code by sending value to server
	     * 
	     * 3) if status code >=400 broken link
	     *    if status code<=400 not a broken link
	     */
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com//");
		
		//Getting all the links from the webpage 
		
	    List<WebElement>links =driver.findElements(By.tagName("a"));
		System.out.println("The total no of links are:"+links.size());
		
		int noofbrokenlinks=0;
		
		//checking if they contain a value or not
	    for(WebElement linkelement:links) {
	    String hrefattvalue	= linkelement.getAttribute("href");
	    
	    if(hrefattvalue==null ||hrefattvalue.isEmpty()) {                              //if they do not contain a value skip and move to next one
	    	
	    	System.out.println("href attribute value is null or empty, it is not possible to check");
	    	continue;
	    }
	    
	    //hit url to the server
	   // convert the String href value to url format
	    try {
	    URL linkurl = new URL(hrefattvalue);
	    HttpURLConnection connection= (HttpURLConnection) linkurl.openConnection();  //opens connection to the server 
	    connection.connect(); //connect server and send request to the server  
	    
	    //if status code >=400 broken link
	    //if status code<=400 not a broken link
	    
	   if( connection.getResponseCode()>=400) {
		   System.out.println(hrefattvalue+"BrokenLink");
		   noofbrokenlinks++;
	   }else {
		   System.out.println(hrefattvalue+"Not a broken link");
	   }
	    }catch(Exception e) {
	    }
	    }
	    System.out.println(" no of broken links:"+noofbrokenlinks);
	    
	    }
	    
	
		
		
		
		
		
		
		
	}


