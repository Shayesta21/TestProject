package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsPractice {
@Test
	void testTitle() {
        String extitle="welcome";
        String actTitle="welcome";
	/*	if(extitle.equals(actTitle)) {
		System.out.println("Test passed");	
		}else {
			System.out.println("Test failed");
		}*/
     
	//	Assert.assertEquals(extitle, actTitle); 
		
		if(extitle.equals(actTitle)) {
		System.out.println("Test passed");	
		Assert.assertTrue(true);
		}else {
			System.out.println("Test failed");
			Assert.assertTrue(false);
		}
		
		
		
		
		
		
		
	}

}
