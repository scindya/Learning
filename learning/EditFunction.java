package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditFunction {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();    
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();

		WebElement textbox1=  driver.findElement(By.id("email"));
		textbox1.sendKeys("abc@gmail.com");

		WebElement textbox2=  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		textbox2.sendKeys("selenium");

		WebElement textbox3= driver.findElement(By.name("username"));
		String values= textbox3.getAttribute("value");
		System.out.println("The default value present in textbox 3 : "+values);
		
		WebElement textbox4= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")); 
		textbox4.clear();
		
		WebElement textbox5= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		  boolean status = textbox5.isEnabled();
		  System.out.println("Is enabled -> "+status);
		
	}

}

