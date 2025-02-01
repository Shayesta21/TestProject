package mouseactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rcbutton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions action = new Actions(driver);
        
       action.contextClick(rcbutton).build().perform();
       Thread.sleep(5000);
       WebElement ebutton = driver.findElement(By.xpath("/html/body/ul/li[1]"));
       ebutton.click();
        
        
        Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();
	
	
	
	
	}

}
