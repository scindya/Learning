package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");


		List<WebElement> buttons= driver.findElements(By.xpath("//input[@id='yesRadio']//following::label"));


		for (WebElement radio : buttons) {

			String text = radio.getText();

			if (text.contains("Yes")) {
				radio.click();
			}
		}










	}

}
