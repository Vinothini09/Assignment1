package seleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args)  throws Exception {
	 
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.id("alertButton")).click();
		 
		 Thread.sleep(1000);		 
		 
		 driver.switchTo().alert().accept();
		 				 
		 Thread.sleep(1000);			
		 
		 driver.findElement(By.id("timerAlertButton")).click();
		 
		 Thread.sleep(6000);
		 
		 driver.switchTo().alert().accept();		 
		
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("confirmButton")).click();
		 
		 Thread.sleep(1000);		 
		 
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.id("promptButton")).click();
		 
		 Thread.sleep(1000);		 
		 
		 driver.switchTo().alert().accept();
			
			
	}
}
		
	


