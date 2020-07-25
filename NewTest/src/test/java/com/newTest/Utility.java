package com.newTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

public class Utility
{
	public static void getScreenshots(WebDriver driver) throws IOException
	{
		TakesScreenshot st=(TakesScreenshot)driver;
		File sourse=st.getScreenshotAs(OutputType.FILE);
		File target= new File("./Screenshorts\\sh.png");
		
		FileUtils.copyFile(sourse, target);
		System.out.println("Screenshort has taken");
	}

}

