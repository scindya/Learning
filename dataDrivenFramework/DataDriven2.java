package dataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven2 {
	
	
	
	
	 @DataProvider(name="loginData")
	 public String[][] loginTestData() throws IOException {
		 
		return ReadExcel.excelData();
	 }
	
	
	
	
	
	@Test(dataProvider = "loginData")
	public void login(String uname, String pword) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
