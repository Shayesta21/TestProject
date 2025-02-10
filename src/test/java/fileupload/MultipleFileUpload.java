package fileupload;

import java.time.Duration;

import javax.swing.tree.AbstractLayoutCache;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//multiple file upload
		String file1 ="C:\\Users\\Moham\\OneDrive\\Documents\\M_Arham\\loops and while.txt";
		String file2="C:\\Users\\Moham\\OneDrive\\Documents\\M_Arham\\gittoken.txt";
		driver.findElement(By.cssSelector("input#filesToUpload")).sendKeys(file1+"\n"+file2);
		
		//validate count of uploaded files
		int count =driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(count==2) {
			System.out.println("total files uploaded is correct");
		}else {
			System.out.println("this is an incorrect count");
		}
		
		//validate file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("loops and while.txt") 
		&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("gittoken.txt"))
		{
			System.out.println("the files name match");
		}else {
			System.out.println("the file names do not match");
		}

	}

}
