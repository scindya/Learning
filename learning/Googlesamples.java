package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/webhp?authuser=2");
		driver.manage().window().maximize();
	WebElement a= driver.findElement(By.name("q"));
	    a.sendKeys("A.P.J");
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
