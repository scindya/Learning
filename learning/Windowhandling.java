package learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement box1= driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[2]/img"));
		box1.click();

		String parentWindow = driver.getWindowHandle();
		
		//SWITCING TO NEW WINDOW
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String newWindow : allWindow) {
			
			driver.switchTo().window(newWindow);
		}
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		driver.switchTo().window(parentWindow);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
