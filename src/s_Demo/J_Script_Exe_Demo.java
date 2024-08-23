package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class J_Script_Exe_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0,1000)");
		Thread.sleep(3000);
		jse.executeScript("window.scroll(0,-1000)");
		
		
		Thread.sleep(3000);
		jse.executeScript("window.scroll(0,document.body.scrollHight)");
		
//		WebElement sing = driver.findElement(By.xpath("//span[@class='action-inner']"));
//		jse.executeScript("window[0].scrollIntoview(true);", sing);
//		
		Thread.sleep(3000);
		jse.executeScript("window.scroll(0,0)");
		
		driver.findElement(By.partialLinkText("Amazon miniTV")).click();
		
		jse.executeScript("window.scroll(document.body.scrollHight,0)");
		Thread.sleep(3000);
		
		
		
	}

}
