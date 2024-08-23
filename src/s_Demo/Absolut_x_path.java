package s_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolut_x_path {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/s"
				+ "ection/main/div/div/div[1]/div[2]/form/div/div[1]/div/label/input ")).sendKeys("9043398175");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/s"
				+ "ection/main/div/div/div[1]/div[2]/form/div/div[2]/div/label/input")).sendKeys("mani2681");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/s"
				+ "ection/main/div/div/div[1]/div[2]/form/div/div[3]/button")).click();
		Thread.sleep(3000);
	
		
		
	/*	/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]/button
		/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]/button
	    /html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[1]/div/label/input 
        /html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[1]/div/label/input
		/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[2]/div/label/input
	    /html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[2]/div/label/input
	*/
	}

}
