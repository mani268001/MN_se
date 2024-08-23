package jr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    try {
	Thread.sleep(2000);
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9715957419");
    driver.findElement(By.id("pass")).sendKeys("mani2681");
    driver.findElement(By.partialLinkText("Log in")).click();
    Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
   
	}

}
