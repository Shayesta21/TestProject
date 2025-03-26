package testng;
import org.testng.annotations.Test;
public class GroupingTest3 {

	@Test (priority=1, groups= {"sanity", "regression","functional"})
	 void addToCart() {
		 System.out.println(" this is to add items in cart");
	 }
	@Test (priority=1, groups= {"sanity", "regression","functional"})
	void selectItem() {
		System.out.println(" this is to select items in cart");
	}
	
	@Test (priority=1, groups= {"sanity", "regression","functional"})
	void viewCart() {
		System.out.println(" this is to view items in cart");
	}
	
}
