package com.windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDwn {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\murug\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement b = driver.findElement(By.xpath("//a[text() = 'Books']"));

		Actions act = new Actions(driver);

		act.contextClick(b).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		JavascriptExecutor je = (JavascriptExecutor) driver;

		je.executeScript("window.scrollBy(0,4800)");

	}

}
