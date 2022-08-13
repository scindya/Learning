package dataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven1 {
	
	
	
	 String[][] data= {
			
			 {"Admin", "admin123"},
			 {"admin12", "adminwq"},
			 {"Adswe", "adimn123"},
			 {"Admin", "admin321"}
			
				
	};
	 
	 
	 
	 @DataProvider(name="loginData")
	 public String[][] loginTestData() {
		 
		return data;
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

//Store the data in string Array
// Create a method with data Provider annotation.
// return the method with string data.
// Assign the data provider name to the @Test annotation using data Provider attribute.
// Pass the value of string in the code.