package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	ChromeDriver driver;
	
	@Parameters("url")
	@BeforeSuite
public void startApp(String URL) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}


	@Parameters({"username","password"})
	@Test
	public void loginTestcases(String uname, String pword) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
		driver.findElement(By.id("btnLogin")).click();
	}

}
