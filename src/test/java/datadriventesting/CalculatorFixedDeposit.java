package datadriventesting;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorFixedDeposit {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		 * testcase:
		 * open the webpage
		 * read the data from the excel sheet and pass it to the fields and do the validation 
		 * after validation capture result and update last column as pass or fail in excel sheet
		 */
		
	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	
	//1)we need to capture the path of the excel file path first
	String FilePath = (System.getProperty("user.dir")+"\\TestDataFolder\\CalculatorMoneyControl.xlsx");
	
    //2)we need to get the no of rows
	int rows= ExcelUtils.getRowCount(FilePath, "Sheet1");
	
	//reading data from the excel sheet(in excel sheet we have row header in zero row so we will start count from 1)
	
	for(int i=1;i<=rows;i++) {
		
		//we need to do 3 imp steps in the for loop
		
		//1)read data from excel, 2)pass data to application 3)validation
		
		
		String principle= ExcelUtils.getCellData(FilePath, "Sheet1", i,0 );
		String roi =ExcelUtils.getCellData(FilePath, "Sheet1", i, 1);
		String period1 =ExcelUtils.getCellData(FilePath, "Sheet1", i, 2);
		String period2 =ExcelUtils.getCellData(FilePath, "Sheet1", i, 3);
		String frequency =ExcelUtils.getCellData(FilePath, "Sheet1", i, 4);
		String expvalue =ExcelUtils.getCellData(FilePath, "Sheet1", i, 5);
		
		//2)pass data into application fields
		
		driver.findElement(By.cssSelector("#principal")).sendKeys(principle);
		driver.findElement(By.cssSelector("#interest")).sendKeys(roi);
		driver.findElement(By.cssSelector("#tenure")).sendKeys(period1);
		
		Select tenperiod= new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		tenperiod.selectByVisibleText(period2);
		
		Select freq= new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		freq.selectByVisibleText(frequency);
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
		
		String actvalue =driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		
		//3)validate
		if(Double.parseDouble(expvalue)==Double.parseDouble(actvalue)) {
			
			System.out.println("Test passed");
			ExcelUtils.setCellData(FilePath, "Sheet1", i, 7, "passed");
			ExcelUtils.fillGreenColor(FilePath, "Sheet1", i, 7);
			
		}else {
			System.out.println("Test failed");
			ExcelUtils.setCellData(FilePath, "Sheet1", i, 7, "failed");
			ExcelUtils.fillRedColor(FilePath, "Sheet1", i, 7);
		}
		driver.findElement(By.xpath("//img[@class='PL5']")).click();//click on clear button
	}
	
		
		driver.quit();
		
		
		
	 
	}

}
