package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		findElement.click();
//		Thread.sleep(3000);
//		WebElement findElement2 = driver.findElement(By.name("firstname"));
//		findElement2.sendKeys("mani");
//		WebElement findElement3 = driver.findElement(By.name("lastname"));
//		findElement3.sendKeys("kutty");
//		
		
		

	}

}
