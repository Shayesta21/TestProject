package handlingtables;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class StaticTable {

	public static void main(String[] args) {
		/*1)Find total no of rows in a table
		 * 
		 * 2)Find total no of columns in a table	
		 * 
		 * 3)read data from specific row and column
		 * 
		 * 4)read all the data from each row and each column	
		 * 
		 * 5)print data based on a condition- print book names written by a particular author Mukesh	
		 * 
		 * 6)print the price of each book and get total price
		 */
    WebDriver driver = new ChromeDriver();
		 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.manage().window().maximize();
		
	driver.get("https://testautomationpractice.blogspot.com/");
		
	WebElement table= driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
	  Point p=table.getLocation();	
	  int x=p.getX();	
	  int y=p.getY();
	  System.out.println(x);
	  System.out.println(y);
		
	JavascriptExecutor js= (JavascriptExecutor) driver;	
	js.executeScript("window.scrollBy(289,1865)");	
		
		
	//1)Find total no of rows in a table
	int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	System.out.println("The total no of rows are: "+rows);	
	
	//using tagName to find total no of rows in a table
	
	int rows1=driver.findElements(By.tagName("tr")).size();
	System.out.println("The total no of rows are: "+rows1);	
	
	//2)Find total no of columns in a table	
	int colunm =driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th")).size();	
	System.out.println("The total no of columns are "+colunm);
		
	//using tagName to find total no of rows in a table
	
	int colunm1=driver.findElements(By.tagName("th")).size();	
	System.out.println("The total no of rows are: "+colunm1);
		
	//3)read data from specific row and column
	
	String coltext= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
	System.out.println("The text in this column is: "+coltext);	
	System.out.println();	
		
/*	//4)read all the data from each row and each column	-using nested for loop
		
		for(int r=2;r<=rows;r++) {
			
			for(int c=1;c<=colunm;c++) 
			{
			String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value + "\t");
			}
			System.out.println();
			
			
	//5)print data based on a condition- print booknames written by a particular author Mukesh		
		for(int r1=2;r1<=rows;r1++) {
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]//td[2]")).getText();
		//	System.out.println("The name of the author is "+authorname);
			if(authorname.equals("Mukesh")) {
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]//td[1]")).getText();
				System.out.println("The name of the book is "+bookname+" and is written by "+authorname);*/
				
				
	//6)print the price of each book and get total price
	int total=0;
	System.out.println("The price of each book is as below:");
		for(int r2=2; r2<=rows;r2++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r2+"]//td[4]")).getText();
			
			System.out.println(price);
			
			total=total+Integer.parseInt(price);
			
		}
		System.out.println("the total price of the books is: "+total);
			
				
				
				
			}
		
			
	}
			
		
		
		
		
		
		
		
		
		
	


