package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DTest {
	WebDriver driver;
	@Test
	public void test1() {
		driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.findElement(By.id(""));
		driver.findElements(By.className(""));
	}

}
