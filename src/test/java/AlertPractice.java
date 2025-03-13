import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AlertPractice {

public static void main(String[]args) throws InterruptedException {
	
	/*There are 3 types of alerts:
	 * normal alert button-uses accept()to close
	 * confirmation alert has cancel button-uses dismiss() to close
	 * prompt alert
	 * using explicit wait
	 */
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//normal alert button-uses accept() to close
	
	/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	//directly accept alert
	driver.switchTo().alert().accept();
	
	//store in alert variable to perform  more actions
	Thread.sleep(10000);
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();	
	
	//confirmation alert
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click(); 
	driver.switchTo().alert().dismiss();
	
	//Store in a variable to perform more actions using Alert class
	 Alert alert=driver.switchTo().alert();
	 System.out.println(alert.getText());
	 alert.dismiss();
	
	 //to validate the text in alert using String
	 String alerttext=driver.switchTo().alert().getText();
	 if(alerttext.contains("I am a JS Confirm")) {
		 System.out.println("pass");
	 }else {
		 System.out.println("fail");
	 }
	driver.switchTo().alert().dismiss(); 
	
	//prompt alert
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	
	Thread.sleep(2000);
	
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("Welcome");
	alert.accept();*/
	
	//using explicit wait
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
	Alert alert= wait.until(ExpectedConditions.alertIsPresent());
	alert.sendKeys("Welcome");
	alert.accept();
	
	
	
	
}
	
	
	
}
