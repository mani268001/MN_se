package s_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Dowen_Task2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rentrip.in/");
		driver.manage().window().maximize();
		
		WebElement city = driver.findElement(By.xpath("(//select[@name='city'])"));
		city.click();
		Select s=new Select(city);
		
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());	
		}
	    s.deselectByValue("chennai");
	
	
	}		
	}
		
		
	


