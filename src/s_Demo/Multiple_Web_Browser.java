package s_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Web_Browser {
	String a = "Chrome";
	String b = "Firefox";
	String c = "Edge";

	public void Browser(String n) {
		if (b.equalsIgnoreCase(a)) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");

		} else if (b.equalsIgnoreCase(b)) {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.microsoft.com/");

		} else if (b.equalsIgnoreCase(c)) {
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.mozilla.org/");
		}

	}

	public static void main(String[] args) {
		Multiple_Web_Browser mn = new Multiple_Web_Browser();
		mn.Browser("Chrome");
	}

}
