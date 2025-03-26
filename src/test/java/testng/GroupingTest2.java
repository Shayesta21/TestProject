package testng;
import org.testng.annotations.Test;
public class GroupingTest2 {

	@Test (priority =1, groups="regression")
	void signnTestEmail() {
		
		System.out.println("This is a signinTest with email");
		
	}
	
	
	@Test (priority =2, groups="regression")
    void signinTestPhone() {
		
		System.out.println("This is a signinTest with phone");
		
	}
	
	@Test(priority =3, groups="regression")
    void signinTestGmail() {
	
	System.out.println("This is a signinTest with gmail");
	
}
	
	
	
	
	
	
	
	
	
	
}
