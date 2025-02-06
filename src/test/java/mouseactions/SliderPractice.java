package mouseactions;
import java.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SliderPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		/*driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		       
		WebElement sliderleft=driver.findElement(By.xpath("//div[@id='slider-range']"));
		System.out.println("Default location of slider: "+sliderleft.getLocation());
		
		Actions	 act = new Actions(driver);
		act.dragAndDropBy(sliderleft,110,297).perform();
		System.out.println("The new location of the slider is: "+sliderleft.getLocation());
		
		WebElement sliderright=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		System.out.println("Default location of slider: "+sliderright.getLocation());
		act.dragAndDropBy(sliderleft,110,297).perform();
		System.out.println("The new location of the slider is: "+sliderright.getLocation());*/
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement button=driver.findElement(By.xpath("//h2[contains(text(),'Slider')]"));
		Point p=button.getLocation();
		 int x=p.getX();
		 int y =p.getY();
		 System.out.println(x);
		System.out.println(y);//939//1260
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(939,1823)");
		
		Thread.sleep(5000);//ui-slider-handle ui-corner-all ui-state-default
		WebElement slider =driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		System.out.println("The default location of the slider is: "+slider.getLocation());
		
		
		Thread.sleep(1000);
		Actions actn =new Actions(driver);
		
		actn.dragAndDropBy(slider, -100, 1103).perform();
		System.out.println("The newlocation of the slider is: "+slider.getLocation());
		
		WebElement slider2 =driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		System.out.println("The default location of the slider is: "+slider2.getLocation());
		
		
		

	}
	
	

}
