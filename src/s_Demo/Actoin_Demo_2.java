package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actoin_Demo_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://corporate.spicejet.com");
		driver.manage().window().maximize();
           
		Thread.sleep(3000);
		Actions as = new Actions(driver);
		Thread.sleep(3000);
		as.moveToElement(driver.findElement(By.xpath("//*[@id=\"ctl00_HyperLinkLogin\"]"))).build().perform();
		Thread.sleep(3000);
		as.doubleClick(driver.findElement(By.linkText("Travel Agent Login"))).build().perform();
		Thread.sleep(3000);
		as.contextClick(driver.findElement(By.linkText("Airports"))).build().perform();

	}

}
