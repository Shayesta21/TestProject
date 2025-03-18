package testng;

import org.testng.annotations.*;
public class PT3 {
	
	//All Annotations--annotations control the order of execution
	@BeforeSuite
	void bs() {
		System.out.println("This executes Before suite ...");
	}
	
	@AfterSuite
	void as() {
		System.out.println("This executes After suite ...");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("This executes before test ...");
	}
	@AfterTest
    void at() {
    	System.out.println("This executes After test ...");
	}
	
	
	@BeforeClass
    void bc() {
		System.out.println("This executes before class ...");
	}
	@AfterClass
    void ac() {
    	System.out.println("This executes After class ...");
	}
	
    @BeforeMethod
    void bm() {
		System.out.println("This executes before method ...");
	}
	@AfterMethod
    void am() {
    	System.out.println("This executes After method ...");
	}
    
	
	@Test (priority= 1)
	void tc1() {
		System.out.println("This first test is passed");
		
	}
	
	@Test (priority= 2)
	void tc2() {
		System.out.println("This second test is passed");
			
	}
    
    

}
