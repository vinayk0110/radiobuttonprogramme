package javaexamples;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumradiobutton extends Screenshot
{

	static WebDriver driver;
	static String url = "https://www.seleniumeasy.com/test/";
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkumar5\\OneDrive - Publicis Groupe\\DemoProject\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver = new  ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		WebElement element	= driver.findElement(By.xpath("//div[@id='at-cv-lightbox-button-holder']//a[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();",element);

		inputform()	;	
		driver.findElement(By.xpath("(//a[contains(text(),\"Radio Buttons Demo\")])[2]")).click();
	
		
		utility();	
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		String text = "Radio button is Not checked";
		
		Thread.sleep(1000);
		int a = driver.findElements(By.xpath("//label/input[@type='radio']")).size();
		System.out.println(a);
		for(int i=1;i<=a;i++)
		{
			driver.findElements(By.xpath("//label/input[@type='radio']")).get(i).click();
			break;
		}
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		utility();
		inputform();
		driver.findElement(By.xpath("(//a[contains(text(),\"Checkbox Demo\")])[2]")).click();
		driver.findElement(By.xpath("(//label/input[@type='checkbox'])[3]")).click();
		//driver.quit();

	}
	
	public static void utility()
	{
		WebElement e =driver.findElement(By.cssSelector("p.radiobutton"));
		System.out.println(e.getText());
	}
	public static void inputform()
	{
		driver.findElement(By.xpath("(//a[contains(text(),\"Input Forms\")])[2]")).click();
	}
	/*public void A() throws InvalidFormatException, IOException
	{
	
	HashMap<String,String> oem = excel("Sheet1",1);
	
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkumar5\\OneDrive - Publicis Groupe\\DemoProject\\chromedriver.exe");
		driver = new  ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		//sending keys
	

		driver.findElement(By.xpath("//input[@name='emaill']")).sendKeys("vinay");
		driver.findElement(By.xpath("(//a[contains(text(),\"Input Forms\")])[2]")).click();
		
	}

*/}
	
	
	
	

