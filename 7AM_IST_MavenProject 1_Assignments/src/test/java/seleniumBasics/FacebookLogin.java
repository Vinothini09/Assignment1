package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		//Object creation for WebDriver interface.
		WebDriver driver;
		
		//Open chrome browser
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
				
		//type FB url
		 driver.get("https://www.facebook.com/");
		 //to maximize the current window
		 driver.manage().window().maximize();
		//type UN and PWD
		 driver.findElement(By.id("email")).sendKeys("vino_b1@yahoo.co.in");
		 driver.findElement(By.name("pass")).sendKeys("AshokVino1");
		//Click on login button
		 driver.findElement(By.name("login")).click();

	}

}
