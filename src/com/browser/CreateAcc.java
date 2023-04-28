package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\murug\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement ca = driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

		ca.click();

		Thread.sleep(1000);

		WebElement fn = driver.findElement(By.xpath("//input[@name = 'firstname']"));

		fn.sendKeys("Bala");

		Thread.sleep(1000);

		WebElement ln = driver.findElement(By.xpath("//input[@name = 'lastname']"));

		ln.sendKeys("A");

		Thread.sleep(1000);

		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));

		mobile.sendKeys("9884858436");

		Thread.sleep(1000);

		WebElement pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));

		pwd.sendKeys("9884027977");

		Thread.sleep(1000);

		WebElement date = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));

		Select sc1 = new Select(date);

		sc1.selectByVisibleText("23");

		Thread.sleep(1000);

		WebElement month = driver.findElement(By.xpath("//select[@name = 'birthday_month']"));

		Select sc2 = new Select(month);

		sc2.selectByValue("5");

		Thread.sleep(1000);

		WebElement year = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));

		Select sc3 = new Select(year);

		sc3.selectByVisibleText("1991");

		Thread.sleep(1000);

		WebElement sex = driver.findElement(By.xpath("//label[text()='Male']"));

		sex.click();

		Thread.sleep(1000);

		WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));

		signup.click();

	}

}
