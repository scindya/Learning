package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://stqatools.com/demo/WebTable.php");
		driver.manage().window().maximize();
		
		
		// number of rows
		
		List<WebElement> row= driver.findElements(By.tagName("tr"));
		int rowsize = row.size();
		System.out.println("No of rows : "+rowsize);
		
		
		// number of columns
		
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnsize = column.size();
		System.out.println("Number of columns : "+columnsize);
		
		
		WebElement email= driver.findElement(By.xpath("//td[normalize-space()='Swapnil']//following::td[2]"));
		String text = email.getText();
		System.out.println("swapnil email id : "+text);
		

	}

}
