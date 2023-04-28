package com.windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TabHandle {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\murug\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement td = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));

		Actions act = new Actions(driver);

		act.contextClick(td).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		WebElement cs = driver.findElement(By.xpath("//a[text() = 'Customer Service']"));

		act.contextClick(cs).build().perform();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		WebElement b = driver.findElement(By.xpath("//a[text() = 'Books']"));

		act.contextClick(b).build().perform();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		WebElement f = driver.findElement(By.xpath("//a[text() = 'Fashion']"));

		act.contextClick(f).build().perform();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		int siz = driver.getWindowHandles().size();

		System.out.println(siz);

		System.out.println("***************************************");

		String pw = driver.getWindowHandle();

		System.out.println(pw);

		System.out.println("***************************************");

		Set<String> aw = driver.getWindowHandles();

		System.out.println(aw);

		System.out.println("***************************************");

		for (String pc : aw) {

			String title = driver.switchTo().window(pc).getTitle();

			System.out.println(title);

		}

		System.out.println("***************************************");

		/*
		 * for (String pc : aw) {
		 * 
		 * if (!pc.equals(pw)) {
		 * 
		 * driver.switchTo().window(pc);
		 * 
		 * driver.close();
		 * 
		 * } }
		 */
		String book = "Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";

		String fas = "Amazon.in Great Indian Festival 2022";

		for (String pc : aw) {

			if (driver.switchTo().window(pc).getTitle().equals(book)) {

				break;

			}
		}

		Thread.sleep(1000);

		JavascriptExecutor je =(JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0,4820)");
		
		
		Thread.sleep(1000);
		
		TakesScreenshot ss = (TakesScreenshot) driver;

		File ts = ss.getScreenshotAs(OutputType.FILE);

		File nss = new File("C:\\Users\\murug\\eclipse-workspace\\Selenium\\Screenshots\\pic.png");

		FileHandler.copy(ts, nss);
		

		Thread.sleep(1000);

		for (String pc1 : aw) {

			if (driver.switchTo().window(pc1).getTitle().equals(fas)) {

				break;

			}

		}
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9884027977");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bala@2305");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()= 'OnePlus Nord CE2 5G | Starting from INR 21,999']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id = 'add-to-cart-button']")).click();
		
		Thread.sleep(7000);
		
		driver.quit();	}

}
