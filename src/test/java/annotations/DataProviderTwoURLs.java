package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTwoURLs {
	
	WebDriver driver;
	
	@Test (dataProvider = "URL")
	
	public void OpenTwoURLsUsingDataProvider(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	@DataProvider
	public Object[] URL() {
		Object [] url = new Object[2];
		
		url[1] = "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/";
		url[0] = "https://www.seleniumeasy.com/testng-tutorials/dataprovider-in-testng";
		
		return url;
	}
	
	/*
	 // This method only close the browser which is active
	  
	  @AfterTest() public void closeBrowser() { 
	  driver.quit(); 
	  }
	 */
	
	//This method will close browser immediately after each method
	@AfterMethod()
	public void closeBrowser() {
		driver.quit();
	}
	
}
