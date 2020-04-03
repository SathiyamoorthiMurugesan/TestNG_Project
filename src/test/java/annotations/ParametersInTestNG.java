package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	WebDriver driver;
	public static String browser;
	
	@Parameters({"browser"})
	@Test
	public void launchBrowser(String browser) {
		switch(browser){
			case "chrome":
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				/*
				 * driver.get(
				 * "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
				 * driver.manage().window().maximize();
				 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 */
			
			case "firefox":
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.home")+"\\eclipse-workspace\\TestNG_Project\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
		}
	/*@Test
	public void launchBrowser() {
	
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();*/
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
