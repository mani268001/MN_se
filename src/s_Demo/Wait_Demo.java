package s_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Demo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		driver.findElement(By.xpath("//*[@rel='async']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	   wait.until(ExpectedConditions.alertIsPresent());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		driver.findElement(By.name("firstname")).sendKeys("manikutty");
		driver.navigate().to("https://web.whatsapp.com/");

	}

}
