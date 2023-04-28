package com.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\murug\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement ca = driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

		ca.click();

		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));

		Select sc1 = new Select(date);

		sc1.selectByVisibleText("23");
		
		//driver.quit();
		
		List<WebElement> list1 = sc1.getOptions();
		
		System.out.println(list1);
		
	    System.out.println("------------------------------");
		
		
		
		for (WebElement a1 : list1) {
			
			System.out.println(a1.getText());
			
		}
		System.out.println("------------------------------");
		
		int size1 = list1.size();

		System.out.println(size1); 
		
		
	}
}
