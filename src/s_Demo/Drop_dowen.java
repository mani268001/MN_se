package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_dowen {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Selenium143");
		driver.findElement(By.name("password")).sendKeys("password@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	
		WebElement findElement = driver.findElement(By.className("search_combobox"));
		Select s=new Select(findElement);
		s.selectByValue("New York");
		WebElement findElement2 = driver.findElement(By.id("hotels"));
		Select s1=new Select(findElement2);
		s1.selectByIndex(1);
		WebElement findElement3 = driver.findElement(By.xpath("(//select[@name='room_type'])"));
		Select s2=new Select(findElement3);
	   //  s2.selectByValue("")

		WebElement findElement4 = driver.findElement(By.name("room_nos"));
		Select s3=new Select(findElement4);
		s3.selectByIndex(1);
		WebElement findElement5 = driver.findElement(By.xpath("(//select[@name='adult_room'])"));
		findElement5.sendKeys("03/12/2023"); 
		WebElement findElement6 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		findElement6.sendKeys("04/12/2023"); 
		WebElement findElement7 = driver.findElement(By.xpath("(//select[@name='adult_room'])"));
		Select s4=new Select(findElement7);
		s4.selectByIndex(2);
		WebElement findElement8 = driver.findElement(By.id("child_room"));
		Select s5=new Select(findElement8);
		s5.selectByIndex(3);
		//WebElement findElement9 = driver.findElement(By.className("reg_button"));
		//findElement9.click();

		WebElement nextpage = driver.findElement(By.xpath("(//input[@name='radiobutton_0'])"));
		nextpage.click();
		WebElement findElement10 = driver.findElement(By.name("continue"));
		findElement10.click();

		driver.findElement(By.name("first_name")).sendKeys("MANIKUTTY");
		driver.findElement(By.id("last_name")).sendKeys("ANBAZHAGAN");
		driver.findElement(By.name("address")).sendKeys("KUMBAKONAM");
		driver.findElement(By.xpath("(//input[@name='cc_num'])")).sendKeys("1234567891023455");
		driver.findElement(By.xpath("(//select[@name='cc_type'])")).sendKeys("VISA");
		driver.findElement(By.xpath("(//select[@name='cc_exp_month'])")).sendKeys("January");
		driver.findElement(By.xpath("(//select[@name='cc_exp_year'])")).sendKeys("2025");
		driver.findElement(By.xpath("(//input[@name='cc_cvv'])")).sendKeys("143");
		driver.findElement(By.xpath("(//input[@type='button'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='check_all'])")).click();
		driver.findElement(By.xpath("(//input[@name='cancelall'])")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//input[@type='button'])[6]")).click();
		
		
	}
	
}

//	

// WebElement element = driver.findElement(By.name("main"));
// element.click();
// WebElement element2 = driver.findElement(By.name("kitty"));
// element2.click();

// System.out.println(webElement.getText());

// List<WebElement> options = s.getOptions();
// for (WebElement webElement : options) {
// }
// System.out.println(webElement.getText());
// }

// s.deselectByValue("Man");

//_______________________________________________________________________

//driver.findElement(By.xpath("(//a[@class='navy__button-tertiary btn-md btn-tertiary'])")).click();
//driver.findElement(By.id("email-or-phone")).sendKeys("manikutty332001@gmail.com");
//driver.findElement(By.name("password")).sendKeys("mani2681");
//driver.findElement(By.xpath("(//button[@type='submit'])")).click();
//driver.findElement(By.id("first-name")).sendKeys("//main");
//driver.findElement(By.name("last-name")).sendKeys("kitty");
//driver.findElement(By.id("join-form-submit")).click();
//
// WebElement country = driver.findElement(By.xpath("(//select[@id='select-register-phone-country'])"));
//
//
//Select s=new Select(country);
//
//s.selectByValue("Armenia");
//
//Thread.sleep(3000);
//
//s.selectByIndex(13);
//

//import java.io.File;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//TakesScreenshot ts=(TakesScreenshot) driver;
//	    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		File f=new File("C:\\Users\\user\\eclipse-workspace\\Reset\\src\\_ABSTRACTION_DEMO\\adactinhotelapp.com");
//		FileUtils.copyDirectory(screenshotAs, f);
//		Thread.sleep(3000);

//import org.openqa.selenium.JavascriptExecutor;
//
//JavascriptExecutor jse=(JavascriptExecutor)driver;
//	    jse.executeScript("window.scroll5y(0.600)");
//	    Thread.sleep(5000);
