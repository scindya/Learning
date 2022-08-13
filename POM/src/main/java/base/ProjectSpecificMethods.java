package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	
	
	public ChromeDriver driver;

	
	
	@BeforeMethod
	public void startApp() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		return ReadExcel.excelData();
	}

}
