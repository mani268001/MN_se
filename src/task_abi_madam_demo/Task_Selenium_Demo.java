package task_abi_madam_demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Selenium_Demo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// ----------------------------------------------------------------------------task1
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("manikutty332001@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mani2681");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		// ------------------------------------------------------------------------------task2
		driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp\r\n");
		Thread.sleep(2000);
		driver.findElement(By.id("DUMMY1")).click();
		driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL")).sendKeys("MANI2001");
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("Mani2681");
		driver.findElement(By.className("newListSelected")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
      */  //-----------------------------------------------------------------------------task3
		driver.navigate().to("https://netbanking.hdfcbank.com/ ");
		Thread.sleep(2000);	
     	WebElement frame = driver.findElement(By.xpath("//*[@type()='text']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Manikutty2681");
		driver.switchTo().defaultContent();
		
		
		
		
	}

}