package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.click();

		WebElement nextLink= driver.findElement(By.xpath("//a[@title='Next']"));
		nextLink.click();

		driver.findElement(By.xpath("//a[text()='15']")).click();



	}

}
