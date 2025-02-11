package screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//taking full page screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sfile =ts.getScreenshotAs(OutputType.FILE);
	//	File tarfile = new File("C:\\Users\\Moham\\OneDrive\\Documents\\Shayesta\\JavaSeleniumProject1\\TestProject\\ScreenShots Folder");//as this location is too lengthy we can use the below code
		
		File tarfile = new File(System.getProperty("user.dir")+"\\Screenshots Folder\\fullpage.png");
		
		//copies sfile into tarfile
		sfile.renameTo(tarfile);
		
		
		
		

	}

}
