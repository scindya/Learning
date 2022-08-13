package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class Loginpage extends ProjectSpecificMethods{


	public Loginpage (ChromeDriver driver) {
		this.driver= driver;
	}

	@Test
	public Loginpage enterUsername(String uname) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		
		return this;
	}

	@Test
	public Loginpage enterpassword(String pword) {
		driver.findElement(By.id("txtPassword")).sendKeys(pword);
		
		return this;
	}

	@Test
	public Homepage clickLoginbutton() {
		driver.findElement(By.id("btnLogin")).click();
	
	
		return new Homepage(driver);
		
	}


}
