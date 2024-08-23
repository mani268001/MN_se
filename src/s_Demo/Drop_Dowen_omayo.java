package s_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Dowen_omayo {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement mulriselect = driver.findElement(By.id("multiselect1"));
		
		Select s=new Select(mulriselect);
		s.selectByValue("audix");
		s.selectByVisibleText("Hyundai")	;
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		s.selectByValue("volvox");
		s.selectByVisibleText("Hyundai")	;
		s.selectByIndex(3);
  
		Thread.sleep(3000);
		
		s.deselectByValue("volvox");
		s.deselectByVisibleText("Hyundai");
		s.deselectByIndex(3);
		
		Thread.sleep(3000);
		
		s.deselectAll();
		
		
	
				
		
		
	}
}
