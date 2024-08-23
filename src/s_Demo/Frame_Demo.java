package s_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame_Demo {


	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
	

		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);


		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("manikutty");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
	  	WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	  	driver.switchTo().frame(frame1);
	  	WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	  	driver.switchTo().frame(frame2);
	  	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Nithi");
	    driver.switchTo().defaultContent();
	  	driver.findElement(By.partialLinkText("Home")).click();
        Thread.sleep(5000);
       
    	
        
        TakesScreenshot ts=(TakesScreenshot)driver;   //-------------------------> TakesScreenshort
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f26=new File("C:\\Users\\user\\eclipse-workspace\\Seleniam_Demo\\ScreenShot\\Nithi.png");
		FileUtils.copyFile(screenshotAs, f26);
	  	Thread.sleep(3000);
	 
	  	
        
//       driver.findElement(By.xpath("ns-yl6yf-e-18")).click();
//		Alert alert = driver.switchTo().alert();
//	  	alert.accept(); 
//	  //	alert.dismiss();
	  	
	  	
	}
	
	
	}
	
	
	
	
	
