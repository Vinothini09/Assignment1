package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JRISignin {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("imgbtnSignin")).click();
		String errormsg = driver.findElement(By.id("MessageCaption2")).getText();
		System.out.println(errormsg);
	}

}
