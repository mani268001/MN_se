package s_Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Adacittin_hotel_Task {  // 125.0.6422.113

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();                                                //id,name,select,input,
		
		driver.findElement(By.id("username")).sendKeys("Bassclass2001");
		driver.findElement(By.name("password")).sendKeys("bassclass@2001");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

		WebElement findElement = driver.findElement(By.className("search_combobox"));
		findElement.sendKeys("New York");
		WebElement findElement2 = driver.findElement(By.name("hotels"));
		findElement2.sendKeys("Hotel Creek");
		WebElement findElement3 = driver.findElement(By.xpath("(//select[@name='room_type'])"));
		findElement3.sendKeys("Deluxe");

		WebElement findElement4 = driver.findElement(By.name("room_nos"));
		findElement4.sendKeys("2");
		WebElement findElement5 = driver.findElement(By.xpath("(//select[@name='adult_room'])"));
		findElement5.sendKeys("03/12/2023"); 
		WebElement findElement6 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		findElement6.sendKeys("04/12/2023"); 
		WebElement findElement7 = driver.findElement(By.xpath("(//select[@name='adult_room'])"));
		findElement7.sendKeys("2-Two");
		WebElement findElement8 = driver.findElement(By.id("child_room"));
		findElement8.sendKeys("2-Two"); 
		WebElement findElement9 = driver.findElement(By.className("reg_button"));
		findElement9.click();

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
		
	//pass=	air78449
		
		

	}

}
