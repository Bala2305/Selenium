package com.browser;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowesrLaunch {

 public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe"); 
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(1000);
	 
	WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
	 
	 id.sendKeys("9884027977");
	 
	 Thread.sleep(1000);
	 
	WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	 
	pwd.sendKeys("9710774656") ;
	
	Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	// log.click();
	 
	 
	 
}
}
