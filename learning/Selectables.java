package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("ht://jqueryui.com/selectable/tps");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		List<WebElement> select= driver.findElements(By.xpath("//ol[@id='selectable']//following::li"));
		
		Actions action= new Actions(driver);
	//	action.keyDown(Keys.CONTROL).click(select.get(1)).click(select.get(3)).click(select.get(5)).build().perform();
		
		
		action.clickAndHold(select.get(0)).moveToElement(select.get(3)).release().build().perform();
		
		
		
		
		
		
		
		

	}

}
