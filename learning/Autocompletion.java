package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryucom/autocomplete/i.");
		driver.switchTo().frame(0);
		WebElement tag1= driver.findElement(By.id("tags"));
		tag1.click();
		tag1.sendKeys("a");
		Thread.sleep(1000);
		List<WebElement> suggestions= driver.findElements(By.xpath("//ul[@id='ui-id-1']//following::li"));
		
		for (WebElement options : suggestions) {
			String text=	options.getText();
			System.out.println(text);
			if (text.contains("Java")) {
			options.click();	
			}
			
			
			
			
			
		}

		
		
		
		//iframe learnings
		//driver.switchTo().defaultContent();
		//driver.findElement(By.linkText("Draggable")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
