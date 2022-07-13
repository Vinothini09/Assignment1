package seleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.xe.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String amountEditBoxDefaultValue = driver.findElement(By.id("amount")).getAttribute("value");
		System.out.println("amounteditboxdefaultvalue is : " + amountEditBoxDefaultValue);
	}

}
