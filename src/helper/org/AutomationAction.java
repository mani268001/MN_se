package helper.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AutomationAction extends driver_util {
	public static void url(String c) {
		game_Box().get(c);
	}
	// div click
	public static void clickdivclass(String w) {
		game_Box().findElement(By.xpath("//div[@class='" + w + "']")).click();
	}
	public static void clickdivid(String w) {
		game_Box().findElement(By.xpath("//div[@id='" + w + "']")).click();
	}
	public static void clickdivname(String w) {
		game_Box().findElement(By.xpath("//div[@name='" + w + "']")).click();
	}
	public static void clickdivplaceholder(String w) {
		game_Box().findElement(By.xpath("//div[@placeholder='" + w + "']")).click();
	}
	public static void clickdivtype(String w) {
		game_Box().findElement(By.xpath("//div[@type='" + w + "']")).click();
	}
	public static void clickdivvalue(String w) {
		game_Box().findElement(By.xpath("//div[@value='" + w + "']")).click();
	}
	public static void clickdivalt(String w) {
		game_Box().findElement(By.xpath("//div[@alt='" + w + "']")).click();
	}
	public static void clickdivtext(String w) {
		game_Box().findElement(By.xpath("//div[@text()='" + w + "']")).click();
	}
	// a
	public static void clickaclass(String w) {
		game_Box().findElement(By.xpath("//a[@class='" + w + "']")).click();
	}
	public static void clickaid(String w) {
		game_Box().findElement(By.xpath("//a[@id='" + w + "']")).click();
	}
	public static void clickaname(String w) {
		game_Box().findElement(By.xpath("//a[@name='" + w + "']")).click();
	}
	public static void clickaplaceholder(String w) {
		game_Box().findElement(By.xpath("//a[@placeholder='" + w + "']")).click();
	}
	public static void clickatype(String w) {
		game_Box().findElement(By.xpath("//a[@type='" + w + "']")).click();
	}
	public static void clickavalue(String w) {
		game_Box().findElement(By.xpath("//a[@value='" + w + "']")).click();
	}
	public static void clickaalt(String w) {
		game_Box().findElement(By.xpath("//a[@alt='" + w + "']")).click();
	}
	public static void clickatext(String w) {
		game_Box().findElement(By.xpath("//a[@text()='" + w + "']")).click();
	}
	// li
	public static void clickliclass(String w) {
		game_Box().findElement(By.xpath("//li[@class='" + w + "']")).click();
	}
	public static void clickliid(String w) {
		game_Box().findElement(By.xpath("//li[@id='" + w + "']")).click();
	}
	public static void clickliname(String w) {
		game_Box().findElement(By.xpath("//li[@name='" + w + "']")).click();
	}
	public static void clickliplaceholder(String w) {
		game_Box().findElement(By.xpath("//li[@placeholder='" + w + "']")).click();
	}
	public static void clicklitype(String w) {
		game_Box().findElement(By.xpath("//li[@type='" + w + "']")).click();
	}
	public static void clicklivalue(String w) {
		game_Box().findElement(By.xpath("//li[@value='" + w + "']")).click();
	}
	public static void clicklialt(String w) {
		game_Box().findElement(By.xpath("//li[@alt='" + w + "']")).click();
	}
	public static void clicklitext(String w) {
		game_Box().findElement(By.xpath("//li[@text()='" + w + "']")).click();
	}
	// option
	public static void clickoptionclass(String w) {
		game_Box().findElement(By.xpath("//option[@class='" + w + "']")).click();
	}
	public static void clickoptionid(String w) {
		game_Box().findElement(By.xpath("//option[@id='" + w + "']")).click();
	}
	public static void clickoptionname(String w) {
		game_Box().findElement(By.xpath("//option[@name='" + w + "']")).click();
	}
	public static void clickoptionplaceholder(String w) {
		game_Box().findElement(By.xpath("//option[@placeholder='" + w + "']")).click();
	}
	public static void clickoptiontype(String w) {
		game_Box().findElement(By.xpath("//option[@type='" + w + "']")).click();
	}
	public static void clickoptionvalue(String w) {
		game_Box().findElement(By.xpath("//option[@value='" + w + "']")).click();
	}
	public static void clickoptionalt(String w) {
		game_Box().findElement(By.xpath("//option[@alt='" + w + "']")).click();
	}
	public static void clickoptiontext(String w) {
		game_Box().findElement(By.xpath("//option[@text()='" + w + "']")).click();
	}
	// span
	public static void clickspanclass(String w) {
		game_Box().findElement(By.xpath("//span[@class='" + w + "']")).click();
	}
	public static void clickspanid(String w) {
		game_Box().findElement(By.xpath("//span[@id='" + w + "']")).click();
	}
	public static void clickspanname(String w) {
		game_Box().findElement(By.xpath("//span[@name='" + w + "']")).click();
	}
	public static void clickspanplaceholder(String w) {
		game_Box().findElement(By.xpath("//span[@placeholder='" + w + "']")).click();
	}
	public static void clickspantype(String w) {
		game_Box().findElement(By.xpath("//span[@type='" + w + "']")).click();
	}
	public static void clickspanvalue(String w) {
		game_Box().findElement(By.xpath("//span[@value='" + w + "']")).click();
	}
	public static void clickspanalt(String w) {
		game_Box().findElement(By.xpath("//span[@alt='" + w + "']")).click();
	}
	public static void clickspantext(String w) {
		game_Box().findElement(By.xpath("//span[@text()='" + w + "']")).click();
	}
	// h1
	public static void clickh1class(String w) {
		game_Box().findElement(By.xpath("//h1[@class='" + w + "']")).click();
	}
	public static void clickh1id(String w) {
		game_Box().findElement(By.xpath("//h1[@id='" + w + "']")).click();
	}
	public static void clickh1name(String w) {
		game_Box().findElement(By.xpath("//h1[@name='" + w + "']")).click();
	}
	public static void clickh1placeholder(String w) {
		game_Box().findElement(By.xpath("//h1[@placeholder='" + w + "']")).click();
	}
	public static void clickh1type(String w) {
		game_Box().findElement(By.xpath("//h1[@type='" + w + "']")).click();
	}
	public static void clickh1value(String w) {
		game_Box().findElement(By.xpath("//h1[@value='" + w + "']")).click();
	}
	public static void clickh1alt(String w) {
		game_Box().findElement(By.xpath("//h1[@alt='" + w + "']")).click();
	}
	public static void clickh1text(String w) {
		game_Box().findElement(By.xpath("//h1[@text()='" + w + "']")).click();
	}
	// h2
	public static void clickh2class(String w) {
		game_Box().findElement(By.xpath("//h2[@class='" + w + "']")).click();
	}
	public static void clickh2id(String w) {
		game_Box().findElement(By.xpath("//h2[@id='" + w + "']")).click();
	}
	public static void clickh2name(String w) {
		game_Box().findElement(By.xpath("//h2[@name='" + w + "']")).click();
	}
	public static void clickh2placeholder(String w) {
		game_Box().findElement(By.xpath("//h2[@placeholder='" + w + "']")).click();
	}
	public static void clickh2type(String w) {
		game_Box().findElement(By.xpath("//h2[@type='" + w + "']")).click();
	}
	public static void clickh2value(String w) {
		game_Box().findElement(By.xpath("//h2[@value='" + w + "']")).click();
	}
	public static void clickh2alt(String w) {
		game_Box().findElement(By.xpath("//h2[@alt='" + w + "']")).click();
	}
	public static void clickh2text(String w) {
		game_Box().findElement(By.xpath("//h2[@text()='" + w + "']")).click();
	}
	// input
	public static void clickinputclass(String w) {
		game_Box().findElement(By.xpath("//input[@class='" + w + "']")).click();
	}
	public static void clickinputid(String w) {
		game_Box().findElement(By.xpath("//input[@id='" + w + "']")).click();
	}
	public static void clickinputname(String w) {
		game_Box().findElement(By.xpath("//input[@name='" + w + "']")).click();
	}
	public static void clickinputplaceholder(String w) {
		game_Box().findElement(By.xpath("//input[@placeholder='" + w + "']")).click();
	}
	public static void clickinputtype(String w) {
		game_Box().findElement(By.xpath("//input[@type='" + w + "']")).click();
	}
	public static void clickinputvalue(String w) {
		game_Box().findElement(By.xpath("//input[@value='" + w + "']")).click();
	}
	public static void clickinputalt(String w) {
		game_Box().findElement(By.xpath("//input[@alt='" + w + "']")).click();
	}
	public static void clickinputtext(String w) {
		game_Box().findElement(By.xpath("//input[@text()='" + w + "']")).click();
	}
	// textarea
	public static void clicktextareaclass(String w) {
		game_Box().findElement(By.xpath("//textarea[@class='" + w + "']")).click();
	}
	public static void clicktextareaid(String w) {
		game_Box().findElement(By.xpath("//textarea[@id='" + w + "']")).click();
	}
	public static void clicktextareaname(String w) {
		game_Box().findElement(By.xpath("//textarea[@name='" + w + "']")).click();
	}
	public static void clicktextareaplaceholder(String w) {
		game_Box().findElement(By.xpath("//textarea[@placeholder='" + w + "']")).click();
	}
	public static void clicktextareatype(String w) {
		game_Box().findElement(By.xpath("//textarea[@type='" + w + "']")).click();
	}
	public static void clicktextareavalue(String w) {
		game_Box().findElement(By.xpath("//textarea[@value='" + w + "']")).click();
	}
	public static void clicktextareaalt(String w) {
		game_Box().findElement(By.xpath("//textarea[@alt='" + w + "']")).click();
	}
	public static void clicktextareatext(String w) {
		game_Box().findElement(By.xpath("//textarea[@text()='" + w + "']")).click();
	}
	// p
	public static void clickpclass(String w) {
		game_Box().findElement(By.xpath("//p[@class='" + w + "']")).click();
	}
	public static void clickpid(String w) {
		game_Box().findElement(By.xpath("//p[@id='" + w + "']")).click();
	}
	public static void clickpname(String w) {
		game_Box().findElement(By.xpath("//p[@name='" + w + "']")).click();
	}
	public static void clickpplaceholder(String w) {
		game_Box().findElement(By.xpath("//p[@placeholder='" + w + "']")).click();
	}
	public static void clickptype(String w) {
		game_Box().findElement(By.xpath("//p[@type='" + w + "']")).click();
	}
	public static void clickpvalue(String w) {
		game_Box().findElement(By.xpath("//p[@value='" + w + "']")).click();
	}
	public static void clickpalt(String w) {
		game_Box().findElement(By.xpath("//p[@alt='" + w + "']")).click();
	}
	public static void clickptext(String w) {
		game_Box().findElement(By.xpath("//p[@text()='" + w + "']")).click();
	}
	// button
	public static void clickbuttonclass(String w) {
		game_Box().findElement(By.xpath("//button[@class='" + w + "']")).click();
	}
	public static void clickbuttonid(String w) {
		game_Box().findElement(By.xpath("//button[@id='" + w + "']")).click();
	}
	public static void clickbuttonname(String w) {
		game_Box().findElement(By.xpath("//button[@name='" + w + "']")).click();
	}
	public static void clickbuttonplaceholder(String w) {
		game_Box().findElement(By.xpath("//button[@placeholder='" + w + "']")).click();
	}
	public static void clickbuttontype(String w) {
		game_Box().findElement(By.xpath("//button[@type='" + w + "']")).click();
	}
	public static void clickbuttonvalue(String w) {
		game_Box().findElement(By.xpath("//button[@value='" + w + "']")).click();
	}
	public static void clickbuttonalt(String w) {
		game_Box().findElement(By.xpath("//button[@alt='" + w + "']")).click();
	}
	public static void clickbuttontext(String w) {
		game_Box().findElement(By.xpath("//button[@text()='" + w + "']")).click();
	}
	// * all
	public static void clickallclass(String w) {
		game_Box().findElement(By.xpath("//*[@class='" + w + "']")).click();
	}
	public static void clickallid(String w) {
		game_Box().findElement(By.xpath("//*[@id='" + w + "']")).click();
	}
	public static void clickallname(String w) {
		game_Box().findElement(By.xpath("//*[@name='" + w + "']")).click();
	}
	public static void clickallplaceholder(String w) {
		game_Box().findElement(By.xpath("//*[@placeholder='" + w + "']")).click();
	}
	public static void clickalltype(String w) {
		game_Box().findElement(By.xpath("//*[@type='" + w + "']")).click();
	}
	public static void clickallvalue(String w) {
		game_Box().findElement(By.xpath("//*[@value='" + w + "']")).click();
	}
	public static void clickallalt(String w) {
		game_Box().findElement(By.xpath("//*[@alt='" + w + "']")).click();
	}
	public static void clickalltext(String w) {
		game_Box().findElement(By.xpath("//*[@text()='" + w + "']")).click();
	}
//----------------------------------------------------------------------------------------sendkeys step
 // option sendKeys
	public static void sendkeysoptionclass(String w, String s) {
		game_Box().findElement(By.xpath("//option[@class='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysoptionid(String w, String s) {
		game_Box().findElement(By.xpath("//option[@id='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysoptionname(String w, String s) {
		game_Box().findElement(By.xpath("//option[@name='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysoptionplaceholder(String w, String s) {
		game_Box().findElement(By.xpath("//option[@placeholder='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysoptiontype(String w, String s) {
		game_Box().findElement(By.xpath("//option[@type='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysoptionvalue(String w, String s) {
		game_Box().findElement(By.xpath("//option[@value='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysoptionalt(String w, String s) {
		game_Box().findElement(By.xpath("//option[@alt='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysoptiontext(String w, String s) {
		game_Box().findElement(By.xpath("//option[@text()='" + w + "']")).sendKeys(s);
	}
	//input	sendKeys
	public static void sendkeysinputclass(String w, String s) {
		game_Box().findElement(By.xpath("//input[@class='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysinputid(String w, String s) {
		game_Box().findElement(By.xpath("//input[@id='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysinputname(String w, String s) {
		game_Box().findElement(By.xpath("//input[@name='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysinputplaceholder(String w, String s) {
		game_Box().findElement(By.xpath("//input[@placeholder='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysinputtype(String w, String s) {
		game_Box().findElement(By.xpath("//input[@type='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysinputvalue(String w, String s) {
		game_Box().findElement(By.xpath("//input[@value='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysinputalt(String w, String s) {
		game_Box().findElement(By.xpath("//input[@alt='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysinputtext(String w, String s) {
		game_Box().findElement(By.xpath("//input[@text()='" + w + "']")).sendKeys(s);
	}	
	//textarea	sendKeys
	public static void sendkeystextareaclass(String w, String s) {
		game_Box().findElement(By.xpath("//textarea[@class='" + w + "']")).sendKeys(s);
	}
	public static void sendkeystextareaid(String w, String s) {
		game_Box().findElement(By.xpath("//textarea[@id='" + w + "']")).sendKeys(s);
	}
	public static void sendkeystextareaname(String w, String s) {
		game_Box().findElement(By.xpath("//textarea[@name='" + w + "']")).sendKeys(s);
	}
	public static void sendkeystextareaplaceholder(String w, String s) {
		game_Box().findElement(By.xpath("//textarea[@placeholder='" + w + "']")).sendKeys(s);
	}
	public static void sendkeystextareatype(String w, String s) {
		game_Box().findElement(By.xpath("//textarea[@type='" + w + "']")).sendKeys(s);
	}
	public static void sendkeystextareavalue(String w, String s) {
		game_Box().findElement(By.xpath("//textarea[@value='" + w + "']")).sendKeys(s);
	}
	public static void sendkeystextareaalt(String w, String s) {
		game_Box().findElement(By.xpath("//textarea[@alt='" + w + "']")).sendKeys(s);
	}
	public static void sendkeystextareatext(String w, String s) {
		game_Box().findElement(By.xpath("//textarea[@text()='" + w + "']")).sendKeys(s);
	}	
	
		
	//button sendKeys
	public static void sendkeysbuttonclass(String w, String s) {
		game_Box().findElement(By.xpath("//button[@class='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysbuttonid(String w, String s) {
		game_Box().findElement(By.xpath("//button[@id='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysbuttonname(String w, String s) {
		game_Box().findElement(By.xpath("//button[@name='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysbuttonplaceholder(String w, String s) {
		game_Box().findElement(By.xpath("//button[@placeholder='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysbuttontype(String w, String s) {
		game_Box().findElement(By.xpath("//button[@type='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysbuttonvalue(String w, String s) {
		game_Box().findElement(By.xpath("//button[@value='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysbuttonalt(String w, String s) {
		game_Box().findElement(By.xpath("//button[@alt='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysbuttontext(String w, String s) {
		game_Box().findElement(By.xpath("//button[@text()='" + w + "']")).sendKeys(s);
	}	
	//*	all sendKeys
	public static void sendkeysallclass(String w, String s) {
		game_Box().findElement(By.xpath("//*[@class='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysallid(String w, String s) {
		game_Box().findElement(By.xpath("//*[@id='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysallname(String w, String s) {
		game_Box().findElement(By.xpath("//*[@name='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysallplaceholder(String w, String s) {
		game_Box().findElement(By.xpath("//*[@placeholder='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysalltype(String w, String s) {
		game_Box().findElement(By.xpath("//*[@type='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysallvalue(String w, String s) {
		game_Box().findElement(By.xpath("//*[@value='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysallalt(String w, String s) {
		game_Box().findElement(By.xpath("//*[@alt='" + w + "']")).sendKeys(s);
	}
	public static void sendkeysalltext(String w, String s) {
		game_Box().findElement(By.xpath("//*[@text()='" + w + "']")).sendKeys(s);
		}	
	//--------------------------------------------------------------------------------------------
	
}