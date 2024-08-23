package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
 
	public static void main(String[] args) throws Exception {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	
    driver.findElement(By.id("email")).sendKeys("manikutty");
    driver.findElement(By.name("pass")).sendKeys("mani2681");
    driver.findElement(By.name("login")).click();
    Thread.sleep(2000);
    
//    driver.navigate().to("https://www.google.com/");
//    driver.navigate().back();
//    driver.navigate().forward();
    
    
	
	}
}
