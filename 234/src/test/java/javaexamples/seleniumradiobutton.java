package javaexamples;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seleniumradiobutton extends Screenshot
{

	static WebDriver driver;
	//static String = "https://www.seleniumeasy.com/test/";
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkumar5\\OneDrive - Publicis Groupe\\DemoProject\\chromedriver.exe");
		driver = new  ChromeDriver();
		
		/*driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='emailll']")).sendKeys();
		driver.findElement(By.xpath("(//a[contains(text(),\"Input Forms\")])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),\"Radio Buttons Demo\")])[2]")).click();
	
		
			
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		String text = "Radio button is Not checked";
		WebElement e =driver.findElement(By.xpath("Radio button is Not checked"));
		System.out.println(e.getText());
		Thread.sleep(1000);
		int a = driver.findElements(By.xpath("//label/input[@type='radio']")).size();
		System.out.println(a);
		for(int i=0;i<=a;i++)
		{
			driver.findElements(By.xpath("//input[@type='radi0']")).get(0).click();
		}
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.quit();

	}*/
	/*public void A() throws InvalidFormatException, IOException
	{
	
	HashMap<String,String> oem = excel("Sheet1",1);
	
	{*/
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkumar5\\OneDrive - Publicis Groupe\\DemoProject\\chromedriver.exe");
		driver = new  ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		//sending keys
		driver.findElement(By.xpath("//input[@name='emaill']")).sendKeys("viny");
		driver.findElement(By.xpath("(//a[contains(text(),\"Input Forms\")])[2]")).click();
		
	}

}
	
	
	
	

