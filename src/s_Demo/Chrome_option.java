package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Chrome_option {
	
public static void main(String[] args) {
 
	ChromeOptions option =new ChromeOptions();
	option.addArguments("incognito");
	option.addArguments("disabel-Notifications");
	option.addArguments("New tab");

	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/ ");
	
	driver.findElement(By.name("ndwbg"));
	
	
}
}