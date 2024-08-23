package s_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame_Task_2 {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame);
	    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello Kutty");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("mani");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Manikutty");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement frame4 = driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.name("mytext4")).sendKeys("Manikandan");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File S = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\user\\eclipse-workspace\\Seleniam_Demo\\ScreenShot\\manikutty.png");
		FileUtils.copyFile(S, f);
		
		
		
		
		
		

	}

}
