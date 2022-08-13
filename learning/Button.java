package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		/*
		 * WebElement button1= driver.findElement(By.id("home")); button1.click();
		 */

		WebElement button2=  driver.findElement(By.id("position"));
		Point xy = button2.getLocation();
		System.out.println(xy);
		int x = xy.getX();
		int y = xy.getY();

		System.out.println("X value is - "+x);
		System.out.println("Y value is - "+y);

		WebElement button3=	driver.findElement(By.xpath("//*[@id=\"color\"]"));
		String Color = button3.getCssValue("background-color");
		System.out.println("Button 3 color is - "+Color);

		WebElement button4= driver.findElement(By.id("size"));
		Dimension buttonsize=	button4.getSize();
		System.out.println("button size "+buttonsize);
		int height = buttonsize.getHeight();
		int width = buttonsize.getWidth();
		System.out.println("button height is "+height);
		System.out.println("button width is "+width);



	}

}
