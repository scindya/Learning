package learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");

		WebElement button1=  driver.findElement(By.id("alertButton"));
		button1.click();
		Thread.sleep(2000);
		Alert alert1= driver.switchTo().alert();
		alert1.accept();
	

		WebElement button2= driver.findElement(By.id("confirmButton"));
		button2.click();
		Alert alert2=	driver.switchTo().alert();
		alert2.dismiss();


		WebElement button3= driver.findElement(By.id("promtButton"));
		button3.click();
		Alert alert3=	driver.switchTo().alert();
		alert3.sendKeys("abc");
		alert3.accept();

        


	}

}
