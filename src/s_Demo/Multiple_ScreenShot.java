package s_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_ScreenShot {

	public static void Multiple_ScreenShotms(String a) {
		if (a == "chrome") {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
			
		

		} else if (a == "Firefox") {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.microsoft.com");

		} else if (a == "Edge") {
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.mozilla.org/");
		}

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		Multiple_ScreenShotms("chrome");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Seleniam_Demo\\ScreenShot\\college3.png");
		FileUtils.copyFile(screenshotAs, f);

	}
}
