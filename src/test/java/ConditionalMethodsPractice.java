import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalMethodsPractice {

	public static void main(String[] args) throws InterruptedException {
		/*Conditional methods
		 * we can access these methods through WebElement
		 * 1)isDisplayed()-checks if the element is displayed  or not
		 * 
		 * 2)isEnabled()-checks if the element is enabled or not
		 * 
		 * 
		 * 3)isSelected()-checks if the radio button is selected or not
		 * 
		 * 
		 */
		
		
		//isDisplayed()-checks if the element is displayed  or not , it is applicable for all web elements
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
		//1st method: using web element
		
		WebElement logo=driver.findElement(By.cssSelector("a[class=\"logo\"]"));
		System.out.println("The display status of the logo is "+logo.isDisplayed());
		
		Thread.sleep(7000);
		
		//2nd method using Boolean directly
		
		Boolean status=driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.widget.block.block-static-block > div.blocks-promo > a > img")).isDisplayed();
		System.out.println("The display status of the image is: "+status);
		
		
		//isEnabled()-checks if the input boxes, drop downs and radio buttons are enabled or disabled
		
		//1st method: using web element
		WebElement textbox=driver.findElement(By.cssSelector("input#search"));
		System.out.println("Enabled Status for search text box: "+textbox.isEnabled());
		
		//2nd method using Boolean directly
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(3000);
		Boolean status1=driver.findElement(By.id("email")).isEnabled();
		System.out.println("Enabled status for email textbox is: "+status1);
		
		//3)isSelected()-checks if the radio button is enabled or not
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		
	   //1st method: using WebElement method:
		WebElement radiobutton=driver.findElement(By.name("account.listOption"));
		System.out.println("Before selection");
		System.out.println(radiobutton.isSelected());
		
		radiobutton.click();
		System.out.println("After selection");
		System.out.println(radiobutton.isSelected());
		
		////2nd method using Boolean directly
		
		Boolean radiobutton2=driver.findElement(By.name("account.bannerOption")).isSelected();
		System.out.println("The status of the button before selection is: "+radiobutton2);
		
		WebElement rb2=driver.findElement(By.name("account.bannerOption"));
		rb2.click();
		
		Boolean radiobutton3=driver.findElement(By.name("account.bannerOption")).isSelected();
		System.out.println("The status of the button after selection is: "+radiobutton3);
		
		
	}

}
