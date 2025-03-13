package testng;

import org.testng.annotations.Test;
public class PT1 {
	
	@Test (priority=3)
	void openapp() {
		System.out.println("Open the application");
		
	}
	@Test (priority=2)
	void login() {
		System.out.println("login to the application");
	}
	
	@Test (priority=1)
	void logout() {
		System.out.println("logout of the application");
	}
	
	
	

}
