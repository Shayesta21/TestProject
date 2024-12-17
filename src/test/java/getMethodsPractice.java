import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getMethodsPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*There are 6 common get methods used
		  1)get: to open the url on the browser
		  2)getTitle(): to return the title of the webpage
		  3)getCurrentUrl():to get the current url of the page
		  4)getPageSource():to get the source code of the page
		  5)getWindowHandle():to get the ID of the single browser window
		  6)getWIndowhandles():to get theId's of multiple browser windows
		*/
		
		WebDriver driver= new ChromeDriver();
		
		//1)get: to open the url on the browser
		
		driver.get("https://www.demoblaze.com/");
		
		//2)getTitle(): to return the title of the webpage
		
		//method 1: direct method using print statement
		
		System.out.println(driver.getTitle());
		
		//method 2: storing in string variable and validating response
		String title= driver.getTitle();
		if(title.equals("STORE")) {
			System.out.println(title+" this is the correct title");
		}else {
			System.out.println(title+" this is the incorrect title");
		}
		
		//3)getCurrentUrl():to get the current url of the page
		//method 1: direct method using print statement
		System.out.println(driver.getCurrentUrl());
		
		//method 2: storing in string variable and validating response
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.demoblaze.com/")) {
			System.out.println(url+" this is the correct url");
		}else {
			System.out.println(url+" this is the incorrect url");
		}
		
		//4)getPageSource():to get the source code of the page not used  a lot
		//System.out.println(driver.getPageSource());
		
		
		//5)getWindowHandle():to get the ID of the single browser window
		String id=driver.getWindowHandle();
		System.out.println(id+" this is the currentwindow id");
		
		//6)getWIndowhandles():to get the Id's of multiple browser windows
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Write for us")).click();
		Thread.sleep(4000);
		Set<String> id1=driver.getWindowHandles();
		System.out.println(id1+ "these are the window id's");
		
		
		
		
	}

}
