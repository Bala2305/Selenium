import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kkr {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Work\\Drivers\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		 driver.get("https://www.crictracker.com/ipl-points-table/");
		 
		// WebElement kkr = driver.findElement(By.xpath("//a[contains(text(), 'Kolkata Knight Riders')]"));
		 
	//	 String text = kkr.getText();
	//	 System.out.println(text);
		 
		 List<WebElement> allrow = driver.findElements(By.xpath("//table/tbody/tr"));
		for (WebElement row : allrow) {
			
			if (row.getText().contains("Kolkata Knight Riders")) {
				
				List<WebElement> kkrr = row.findElements(By.tagName("td"));
				
				for (WebElement webElement : kkrr) {
					
					System.out.println(webElement.getText());
					
				}
			}
		}
			 
			 
			 
		
		 
		  
	}
}
