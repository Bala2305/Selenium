package com.browser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Navigate {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe"); 
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File ts = ss.getScreenshotAs(OutputType.FILE);
		
		File tss = new File("C:\\Users\\murug\\eclipse-workspace\\Selenium\\Screenshots\\pic.png");
		
		FileHandler.copy(ts, tss);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String cu = driver.getCurrentUrl();
		
		System.out.println(cu);
	}
	
	
	
	
	
}
