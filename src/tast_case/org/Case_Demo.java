package tast_case.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_Demo {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("9715957419");
		driver.findElement(By.id("passs")).sendKeys("mani2681");
		driver.findElement(By.name("login")).click();
		
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
	    File screenshotAs1 = ts1.getScreenshotAs(OutputType.FILE);
	    File f1=new File("C:\\Users\\user\\eclipse-workspace\\Seleniam_Demo\\ScreenShot\fb11.png");
	  //  FileUtils.copyFile(screenshotAs1, f1);
	}
		
	}


