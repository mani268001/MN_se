package s_Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_Dowen_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@rel='async'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("mani");
		driver.findElement(By.name("lastname")).sendKeys("kutty");
		driver.findElement(By.name("reg_email__")).sendKeys("9043398175");
		driver.findElement(By.id("password_step_input")).sendKeys("mani2681");
		WebElement Day = driver.findElement(By.id("day"));
		Select s=new Select(Day);
		//boolean multiple = s.isMultiple();
		//System.out.println(multiple);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.print(webElement.getText());
		}
		s.selectByIndex(19);
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.id("year"));
	    Select s2=new Select(year);
	   s2.selectByValue("1996");
	   
	    driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]")).click();
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	   // Thread.sleep(5000);
	  //   WebElement findElement = driver.findElement(By.xpath("(//input[@type='text'])"));
	  //  findElement.sendKeys("97087");
	    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	    
	
		
		
		
		
		
	}

}
