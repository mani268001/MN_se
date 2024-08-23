package s_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort_demo1 {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\user\\eclipse-workspace\\Seleniam_Demo\\ScreenShot\\ashwin.png");
	    FileUtils.copyFile(screenshotAs, f);
	    
		TakesScreenshot ts1=(TakesScreenshot)driver;
	    File screenshotAs1 = ts1.getScreenshotAs(OutputType.FILE);
	    File f1=new File("C:\\Users\\user\\eclipse-workspace\\Seleniam_Demo\\src\\mn.png");
	    FileUtils.copyFile(screenshotAs1, f1);
	}
}
