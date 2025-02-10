package fileupload;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFileUpload {
	
public static void main(String[] args) {
	/*
	 * single file upload using sendkeys method
	 */
	
				WebDriver driver = new ChromeDriver();
			    driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
				
				//single file upload
				driver.findElement(By.cssSelector("input#filesToUpload")).sendKeys("C:\\Users\\Moham\\OneDrive\\Documents\\M_Arham\\loops and while.txt");

				
				//validation of text
				WebElement el=driver.findElement(By.xpath("//ul[@id='fileList']//li"));
				if(el.getText().equals("loops and while.txt")) {
				   System.out.println("file is uploaded");	
				}else
				{
					System.out.println("file not uploaded");
				}
				
				//single line validation
				
				if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("loops and while.txt")) {
					
					System.out.println("file is uploaded");	
				}else
				{
					System.out.println("file not uploaded");
				}
				
				
				
			}

	
	}


