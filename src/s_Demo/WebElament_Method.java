package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElament_Method {
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
	    findElement.sendKeys("manikutty332001@gmail.com");
	
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("mani2681");
		WebElement login=driver.findElement(By.name("login"));
     	String text = login.getText();
		System.out.println(text);
		//login.click();

		
		boolean displayed =login .isDisplayed();
		System.out.println(displayed);
		boolean enabled = login.isEnabled();
		System.out.println(enabled);
		boolean selected = login.isSelected();
 	   System.out.println(selected);
		
 	  login.click();
			
		
		
	}

}
