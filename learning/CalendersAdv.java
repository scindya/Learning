package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendersAdv {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.click();
		
		WebElement datePicker= driver.findElement(By.className("ui-datepicker-title"));
		String monthyearValue = datePicker.getText();
		
		
		String month = monthyearValue.split(" ")[0].trim();
		String year = monthyearValue.split(" ")[1].trim();
		

		while(!(month.equals("May")&&year.equals("2025"))) {
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			
			datePicker= driver.findElement(By.className("ui-datepicker-title"));
			monthyearValue = datePicker.getText();
			
			
			month = monthyearValue.split(" ")[0].trim();
			year = monthyearValue.split(" ")[1].trim();
			
		}
		
		
		driver.findElement(By.xpath("//a[text()='25']")).click();
		
		////*[@id="btnLogin"]
		
		//REG0022
		//REG0023
		//REG0024
		
		
		
		
		
		
		
		
		
		

	}

}
