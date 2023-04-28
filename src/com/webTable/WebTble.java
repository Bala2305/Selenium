package com.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTble {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\murug\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://cosmocode.io/automation-practice-webtable/");


/*List<WebElement> ad = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td"));

for (WebElement arc : ad) {
	
	String text = arc.getText();
	
	System.out.println(text);
}*/

List<WebElement> row = driver.findElements(By.xpath("//table[@id = 'countries']/tbody/tr[78]/td"));

for (WebElement arc : row) {
	
	String text = arc.getText();
	
	System.out.println(text);
}

System.out.println("########################################################");

/*List<WebElement> column = driver.findElements(By.xpath("//table[@id = 'countries']/tbody/tr/td[3]"));

for (WebElement arc : column) {
	
	String text = arc.getText();
	
	System.out.println(text);
}*/
System.out.println("########################################################");

driver.findElement(By.xpath("//table[@id = 'countries']/tbody/tr[78]/td[1]/input")).click();

	}

}
