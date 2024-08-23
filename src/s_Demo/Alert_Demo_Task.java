package s_Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo_Task {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@class='btn btn-danger'])")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		alert.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert taxt = driver.switchTo().alert();
		taxt.sendKeys("Hello Manikutty");
		taxt.accept();
		Thread.sleep(3000);

	}

}
