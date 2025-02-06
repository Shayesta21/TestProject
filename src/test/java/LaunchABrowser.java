import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchABrowser {

	public static void main(String[] args) throws InterruptedException {

		/* Test case
		 * launch browser
		 * open url: https://www.amazn.ca
		 * validate title
		 * close browser
		 * 
		 * Selenium 4.x has introduced new commands to launch a new browser on separate Tab or separate browser window
		 * 
		 * for TAB
		 * driver.switchTo.newWindow(WindowType.TAB);
		 * 
		 * 
		 * for WINDOW
		 * driver.switchTo().newWindow(WindowType.WINDOW);
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	//launch browser for chrome
		
		WebDriver driver= new ChromeDriver();
     //ChromeDriver driver= new ChromeDriver();
	// open url	
       driver.get("https://www.amazon.com");
       Thread.sleep(5000);
     // Validate title  
       String title= driver.getTitle();
       if(title.equals("Amazon.ca: Low Prices – Fast Shipping – Millions of Items"))
       {
         System.out.println("correct title: "+ title+" -Test case passed");
       }else
       {
    	 System.out.println("incorrect title"+title+" -Test case failed");
       }
       Thread.sleep(5000);
       //close browser
       driver.quit();
	}

}
