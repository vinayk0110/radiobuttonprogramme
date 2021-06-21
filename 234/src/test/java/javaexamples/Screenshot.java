package javaexamples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.apache.commons.io.FileUtils;

public class Screenshot  
{
	 WebDriver driver;
	
	public static void screenshot(WebDriver driver,String filename) throws IOException
	{

	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File DestFile=new File("C:/Users/kkumar5/eclipse-workspace/autotest/234/screenshots/radio.png");
	FileUtils.copyFile(src, DestFile);
}
	public void testfaliureshot(ITestResult result )
	{
		if(result.getStatus()==result.FAILURE)
		{
			try {
				Screenshot.screenshot(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
