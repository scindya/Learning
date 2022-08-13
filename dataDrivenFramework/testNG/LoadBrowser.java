package testNG;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoadBrowser {

	ChromeDriver driver;
	public void loadURL() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
}
