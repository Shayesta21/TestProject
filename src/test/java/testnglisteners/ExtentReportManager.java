package testnglisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter; //This manages the ui of the report
	public ExtentReports extent; //populates common info on the report like tester name, browser name, platform 
	public ExtentTest test; // creates test case entries in the report and updates the status of the rest methods
	
	 public void onStart(ITestContext context) {
		  
		 sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myExtentReport.html");
		 sparkReporter.config().setDocumentTitle("Automation report"); //for the title of the report
		 sparkReporter.config().setReportName("Functional Testing"); //name of the report
		 sparkReporter.config().setTheme(Theme.DARK);
		 
		 extent = new ExtentReports();
		 extent.attachReporter(sparkReporter);
		 
		 extent.setSystemInfo("computer name", "local host");
		 extent.setSystemInfo("Environment", "QA");
		 extent.setSystemInfo("Tester name","SHAY");
		 extent.setSystemInfo("os", "Windows 10");
		 extent.setSystemInfo("Browser name","chrome");
		 
		 }
	
	 
	 public void onTestSuccess(ITestResult result) {
		 
		 test = extent.createTest(result.getName()); //creates a new entry the report
		 test.log(Status.PASS, "Test case passed is:"+result.getName());
		 
		 		 
	 }
	 
	 public void onTestFailure(ITestResult result) {
		 test = extent.createTest(result.getName()); //creates a new entry the report
		 test.log(Status.FAIL, "Test case failed is:"+result.getName());//updates status pass or fail or skip
		 test.log(Status.FAIL,"Test case failed cause is"+result.getThrowable());
		 
	 }
	 
	 public void onTestSkipped(ITestResult result) {
		 
		 test = extent.createTest(result.getName());
		 test.log(Status.SKIP, "Test case skipped is"+result.getName());
		 
		 
	 }
	 
	 
	 public void onFinish(ITestContext context) {
		
		 extent.flush();
	 }
	 
	 
	 
	

}
