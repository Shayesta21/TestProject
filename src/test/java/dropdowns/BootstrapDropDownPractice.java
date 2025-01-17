package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDownPractice {
	
	/*1)select single option
	 * 2)capture all options and find the size
	 * 3)Printing options from drop down
	 * 4)select multiple options
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
       
        driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
        //1)select single option
        driver.findElement(By.xpath("//input[@value='Java']")).click();
        
        //2)capture all options and find the size
        
        List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("Number of options: "+options.size());
        
        //3)Printing options from drop down
        System.out.println("The options are: " );
        for(WebElement op:options) {
        	System.out.println(op.getText());
        }
        //4)select multiple options
            for(WebElement op1:options) {
        	String option=op1.getText();
        	if(option.equals("Oracle")||option.equals("Python")|| option.equals("MySQL")) {
        		op1.click();
        	}
        }
        
        
        
        
        
        
        
        
        

	}

}
