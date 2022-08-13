package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	
	ChromeDriver driver;
	
	@BeforeSuite
	public void loadBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();	
		
	}

	//open google
	@Test
	public void Google() {

		driver.get("https://www.google.co.in/");
		
	}
	
	//open bing
	@Test
	public void Bing() {

		driver.get("https://www.bing.com/");
	
	}
			

	
	//open yahoo
	@Test
	public void Yahoo() {

		  driver.get("https://www.yahoo.com/");
		  
	}
	
	
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}
