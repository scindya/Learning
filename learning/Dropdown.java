package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement drop1=  driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(drop1);
		select.selectByIndex(1);
		
		
		WebElement drop2=  driver.findElement(By.name("dropdown2"));
		Select select1=new Select(drop2);  
		select1.selectByVisibleText("Selenium");
		
		WebElement drop3=  driver.findElement(By.id("dropdown3"));
		Select select2=new Select(drop3);
		select2.selectByValue("1");
		
		WebElement drop4= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select select3=new Select(drop4);
		/*
		 * List<WebElement> dropValues = select3.getOptions(); int size =
		 * dropValues.size();
		 * System.out.println("NUmber of options available is : "+size);
		 */
		List<WebElement> values=  select3.getOptions();
		int size1 = values.size();
		System.out.println("numbers available;"+size1);
		
		WebElement drop5=   driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		drop5.sendKeys("Selenium");
		
		WebElement drop6=  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select4=new Select(drop6);
		select4.selectByValue("1");
		select4.selectByIndex(2);
		
		
	}

}
