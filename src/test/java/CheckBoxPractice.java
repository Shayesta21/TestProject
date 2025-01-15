import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class CheckBoxPractice {

	public static void main(String[] args) {
		
		/*Handling check boxes:
		 * 1)clicking on single check box
		 * 2)clicking all check boxes using normal for loop and enhanced for loop
		 * 3)clicking only specific check boxes
		 * 4)un-check clicked check boxes 
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement button =driver.findElement(By.cssSelector("input#sunday"));
		Point p= button.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(x);
		System.out.println(y);
		

      JavascriptExecutor js =(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(289,815)");

	//1)clicking on single check box
	//	button.click();
		
	//2)clicking on all check-boxes using normal for loop	
		
		List <WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*	for(int i=0;i<checkboxes.size();i++) 
			{
				checkboxes.get(i).click();
			}
		//clicking all check-boxes using enhanced for loop	
		
		/*for(WebElement check:checkboxes) 
		{	
			checkboxes.click();
		}*/
	
	/*3)clicking only specific check boxes- clicking last 3 checkboxes
	//Starting index =total no of check-boxes - how many check-boxes you want to select
	//eg: 7-3=4 so for is the starting index
	//in this case we can only use normal for loop
	
	for(int i=4;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}	*/
	//clicking only specific check boxes- clicking first 3 check-boxes
	
	for(int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
	}
	
	//un-check clicked check boxes
	//use isSelected() to un-check the checked check boxes
	
	for(int i=0; i<3;i++)
	{	
	
		if(checkboxes.get(i).isSelected())
		{
		 checkboxes.get(i).click();
		}
	}
	
		
	}

}
