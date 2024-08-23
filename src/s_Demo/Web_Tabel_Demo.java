package s_Demo;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tabel_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement findElement = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		System.out.println(findElement.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        
		List<WebElement> findElement2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]"));
		for (WebElement webElement : findElement2) {
          System.out.println(webElement.getText());	
		}
		
		List<WebElement> findElement3 =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for (WebElement webElement : findElement3) {
			System.out.println(webElement.getText());
		}
		
	WebElement test = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]"));
//		String text = test.getText();
//		System.out.println(text);
		System.out.println(test.getText());	
		
		
		
		
		
		
		
		
		
//		List<WebElement> findElement1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]"));
//		for (WebElement webElement : findElement1) {
//			System.out.println(webElement.getText());
//
//		}

	}

	private static Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
