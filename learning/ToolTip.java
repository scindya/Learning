package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {

		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("https://jqueryui.com/tooltip/");
		    driver.manage().window().maximize();
		
		    driver.switchTo().frame(0);
		    WebElement tool1=  driver.findElement(By.id("age"));
		     String text= tool1.getAttribute("title");
		     System.out.println(text);
		     
		     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
