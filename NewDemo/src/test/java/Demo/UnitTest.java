package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UnitTest {
	WebDriver dr;
	@Parameters
	@Test
	public void test1() {
		dr=new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.quit();
	}
}
