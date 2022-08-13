package dataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothCorrect {
	
	@Parameters({"username","password"})
	@Test
	public void loginBothCorrect(String uname, String pword) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
		driver.findElement(By.id("btnLogin")).click();
		
		//1.check username validation
		//2. check cart functionaily
		
		
	}

}
