package testng;
import org.testng.annotations.Test;

public class GroupingTest1 {
	@Test (priority =1, groups= {"sanity"})
	void loginTestEmail(){
		System.out.println("this is a login email test");
		
	}
	
	@Test (priority=2, groups= {"sanity"})
	void loginTestPhone(){
		System.out.println("this is a login phone test");
	}
	
	@Test (priority=3, groups= {"sanity"})
	void loginTest2factor() {
		System.out.println("this is a login 2factorauth test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
