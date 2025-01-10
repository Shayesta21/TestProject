import java.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class HandleBrowserWindowPractie2 {

	public static void main(String[] args) {

     
		WebDriver driver= new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.linkText("Write for us"));
		
		/*Point p=button.getLocation();
		int x=p.getX();
	    int y=p.getY();
		
		System.out.println("xvalue"+x);
		System.out.println("yvalue"+y);*/
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(139,2436)");
		
		button.click();
		Set<String> winid= driver.getWindowHandles();
		
		List<String> winlist=new ArrayList(winid);
		
		String parentid= winlist.get(0);
		String childid=winlist.get(1);
		
		System.out.println("The parentid is: "+parentid);
		System.out.println("The child id is: "+childid);
		
		driver.switchTo().window(parentid);
		
		String title= driver.getTitle();
		System.out.println("The current driver focus is on this tab: "+title);
		

	}

}
