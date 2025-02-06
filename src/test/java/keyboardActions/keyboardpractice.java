package keyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardpractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
        driver.findElement(By.cssSelector("textarea#inputText1")).sendKeys("hello");
        
        
        Actions act= new Actions(driver);
        
        //ctrl+A  ----select the text
        
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
                      
        //ctrl+C
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
             
        //tab-
        act.keyDown(Keys.TAB).keyUp(Keys.CONTROL).perform();;
        
        //ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		//ctrl+shift+A
		
		
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		
		//enter
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
	}

}
