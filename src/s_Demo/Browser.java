package s_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
		public static void main(String[] args) throws InterruptedException {

			WebDriver n = new ChromeDriver();
			n.get("https://www.facebook.com/login/");
			n.manage().window().maximize();
			
			
		}
		}
