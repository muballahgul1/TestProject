package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	WebDriver driver;
	@BeforeTest
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
	}
	@Test
	public void validedErrorMasage() {
		WebElement userEmail=driver.findElement(By.xpath("//*[@id=\'Email\']"));
		userEmail.clear();
		userEmail.sendKeys("admin@yourstore.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\'Password\']"));
		password.clear();
		password.sendKeys("gul123");
		WebElement btnlogin=driver.findElement(By.xpath("//INPUT[@class='button-1 login-button']"));
		btnlogin.click();
		WebElement errorMasage=driver.findElement(By.xpath("//DIV[@class='message-error validation-summary-errors']"));
		Assert.assertTrue(!errorMasage.isDisplayed());
		
	}
	@AfterMethod
	public void validateTestCase(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshorts\\sh.png") );
		}
		if(result.getStatus()==ITestResult.SUCCESS) {
			
		}
		if(result.getStatus()==ITestResult.SKIP) {
			
		}
		
	}
		
		
		
	

}
