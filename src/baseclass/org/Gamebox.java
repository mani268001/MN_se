package baseclass.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gamebox {

	public static WebDriver driver;

	public static WebDriver Browserlunch(String w) { // browser lunch

		if (w.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions(); // Chrome options
			option.addArguments("incognito");

			driver = new ChromeDriver(option);
			driver.manage().window().maximize();

		} else if (w.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		} else if (w.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}

	public static void url(String s) {
		driver.get(s);

	}

	public static void navigat(String n) {
		driver.navigate().to(n);

	}

	public static void sendkeys(WebElement w, String s) {
		w.sendKeys(s);
	}

	public static void click(WebElement w) {
		w.click();

	}

	public static void screenshot(String s) {
		try {
			TakesScreenshot st = (TakesScreenshot) driver;
			File screenshotAs = st.getScreenshotAs(OutputType.FILE);

			File f = new File("C:\\Users\\user\\eclipse-workspace\\Seleniam_Demo\\ScreenShot\\" + s + ".png");

			FileUtils.copyFile(screenshotAs, f);
		} catch (IOException e) {
			e.printStackTrace();
          System.err.println("see the pic");
		}
	}

public static void main(String[] args) {
	Browserlunch("Chrome");
	url("https://www.facebook.com/");

	sendkeys(driver.findElement(By.id("email")),"manikutty");
	click(driver.findElement(By.name("login")));
	screenshot("facebook pic");
}


}
