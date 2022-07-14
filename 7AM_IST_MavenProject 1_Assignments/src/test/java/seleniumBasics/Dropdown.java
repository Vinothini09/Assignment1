package seleniumBasics;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Dropdown {

			public static void main(String[] args) throws Exception {

				WebDriver driver;
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://blazedemo.com/");

				// Select AUG from Month Dropdown
				//Select fromPort = new Select(driver.findElement(By.xpath("//body//div//form//select")));
				//fromPort.selectByVisibleText("Portland");
				
				//Thread.sleep(1000);
				
				Select fromPort = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));;
		    	fromPort.selectByVisibleText("Portland");

			}

		

	}


