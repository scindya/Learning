package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) {
		
		     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		     ChromeDriver driver=new ChromeDriver();
		     driver.get("https://jqueryui.com/selectable/");
		     driver.manage().window().maximize();
		     
		     driver.switchTo().frame(0);
		     List<WebElement> elements=   driver.findElements(By.xpath("//ul[@id='sortable']//following::li"));
		     
		     WebElement fromEle = elements.get(6);
		     WebElement toEle = elements.get(0);
		     
		     
		     
		     Actions action=new Actions(driver);
		     
		     
		    // action.dragAndDrop(fromEle, toEle).build().perform();
		    action.clickAndHold(fromEle).moveToElement(toEle).release(toEle).build().perform();
		     
		     
		
		
		
		
		
		
		
		

	}

}
