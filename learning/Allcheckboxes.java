package learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class Allcheckboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		
		
		
		
		

	}

}
