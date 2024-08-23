package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebBrowser_Task_Demo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver n = new ChromeDriver();
		n.get("https://www.facebook.com/login/");
		n.manage().window().maximize();
		
		WebElement findElement = n.findElement(By.id("email"));
		findElement.sendKeys("2477765866");
		
		Thread.sleep(2000);
		n.navigate().to("https://www.facebook.com/login/");
		//n.manage().window().fullscreen();
		//n.
		//n.navigate().to("https://www.facebook.com/login/");
		n.navigate().back();
//		n.manage().window().getSize();
//		//n.navigate().forward();
//		n.navigate().refresh();
//		String title = n.getTitle();
//		System.out.println(title);
		//n.navigate().to("https://web.whatsapp.com/");
	//	String Url = n.getCurrentUrl();
//		System.out.println(Url);
//		String Source = n.getPageSource();
//		System.out.println(Source);
//		n.close();
//		n.quit();
//		n.findElement(By.partialLinkText(Source));
//		n.findElement(By.className(""));
	}

}
