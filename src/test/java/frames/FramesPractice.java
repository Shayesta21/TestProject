package frames;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FramesPractice {

	public static void main(String[] args) throws InterruptedException {
		/*We can switch to the frame using 4 conditions:
		 * switch from one frame to another frame using driver.switchTo().defaultContent()
		 * 
		 * 1)driver.swtichTo().frame(index)
		 * 
		 * 2)driver.swtichTo().frame(WebElement)
		 * 
		 * 3)driver.swtichTo().frame(name)
		 * 
		 * 4)driver.swtichTo().frame(id)
		 * 
		 */
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		/*1)driver.swtichTo().frame(index)  using index
		driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("hello");*/
		
        //2)driver.swtichTo().frame(WebElement)  using webelement
        WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.name("mytext1")).sendKeys("Hi");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        //switch from one frame to another frame using defaultContent()
        WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.name("mytext2")).sendKeys("How are you?");
        driver.switchTo().defaultContent();
        
        //frame with iframe 
        WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        
        driver.findElement(By.name("mytext3")).sendKeys("What is your name?");
        
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
        driver.switchTo().defaultContent();
        //clicking link in frame and validating logo 
        
        WebElement frame4= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.name("mytext5")).sendKeys("What is this?");
        
        driver.findElement(By.linkText("https://a9t9.com")).click();
        
        Boolean logo=driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
        
        System.out.println("The status of logo displayed is: "+logo);
        
        
        
        
        
        
        
        
        
	}

}
