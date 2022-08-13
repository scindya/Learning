package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		// MOUSE HOVER ON FROM ELEMENT
	   // CLICK AND HOLD FROM ELEMENT
	   //DRAG FROM ELEMENT TO THE TARGET LOCATION
		//RELEASE OVER TARGET LOACTION
		driver.switchTo().frame(0);
		
		WebElement fromEle= driver.findElement(By.id("draggable"));
		WebElement toEle= driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		//action.clickAndHold(fromEle).moveToElement(toEle).release(fromEle).build().perform();
		
		action.dragAndDrop(fromEle, toEle).build().perform();
		
		
		
		

	}

}
