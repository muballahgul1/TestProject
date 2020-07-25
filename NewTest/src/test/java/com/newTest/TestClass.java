package com.newTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass 
{
	WebDriver driver;
	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test
	public void test() throws Exception 
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		Utility.getScreenshots(driver);
		driver.findElement(By.xpath("//INPUT[@class='button-1 login-button']")).click();
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
