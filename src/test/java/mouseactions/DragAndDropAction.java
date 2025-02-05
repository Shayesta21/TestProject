package mouseactions;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropAction {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement button=driver.findElement(By.xpath("//h2[contains(text(),\"Drag and Drop\")]"));
	
		Point p=button.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(x);//939 1540
		System.out.println(y);
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(939,1540)");
		
		
		Actions act = new Actions(driver);
		
		WebElement sourceEl=driver.findElement(By.xpath("//p[contains(text(),\"Drag me to my target\")]"));
		
		WebElement targetel=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(sourceEl, targetel).build().perform();
		
		
		
		
		
		
		
		
	}

}
