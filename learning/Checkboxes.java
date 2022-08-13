package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		WebElement check1=  driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		check1.click();

		
		List<WebElement> check= driver.findElements(By.xpath("//span[@class='rct-title']"));
		
		for (WebElement values : check) {
			String text = values.getText();
			
			if (text.contains("Downloads")) {
				values.click();
			}
		}
		
		
		

	}

}
