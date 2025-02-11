package screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificSectionScreenshot {

	public static void main(String[] args) {
		
		//capturing screenshot at a specific section
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement form =driver.findElement(By.xpath("//div[@class='widget-content']"));
		
		File sourcefile =form.getScreenshotAs(OutputType.FILE);
	    File targetfile = new File(System.getProperty("user.dir")+"\\ScreenShots folder\\specific shot.png");
		sourcefile.renameTo(targetfile); 
		 
		//capturing screenshot of specific webElement
		 WebElement button =driver.findElement(By.xpath("//h2[contains(text(),'Double Click')]"));
		 
		File srcfile= button.getScreenshotAs(OutputType.FILE);
		File trgfile =new File(System.getProperty("user.dir")+"\\ScreenShots folder\\elementshot.png");     
		srcfile.renameTo(trgfile);

	}

}
