package learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {


	   //	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


		ChromeDriver driver=new ChromeDriver();

		driver.get("https://google.co.in");

		driver.manage().window().maximize();//		



	}

	}

