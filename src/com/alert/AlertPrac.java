package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\murug\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.xpath("//button[@onclick = 'alertbox()']")).click();
		
		Thread.sleep(1000);
		
		Alert a1 = driver.switchTo().alert();
		
		a1.accept();

		
		
		driver.findElement(By.xpath("//a[text() ='Alert with OK & Cancel ']")).click();
		

		driver.findElement(By.xpath("//button[text() = 'click the button to display a confirm box ']")).click();
		
		Thread.sleep(1000);
		
		Alert ok = driver.switchTo().alert();
		
		ok.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		WebElement v = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		v.click();
		v.sendKeys("w");
		Thread.sleep(1000);
		
		
		Alert yes = driver.switchTo().alert();
		String text = yes.getText();
		System.out.println(text);
		
		
		
	}

}
