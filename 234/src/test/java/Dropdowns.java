import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns
{
	static WebDriver driver;
	static String url = "https://www.seleniumeasy.com/test/";
	
	public static void main(String[] args) 
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
			driver.findElement(By.xpath("(//a[@href='./jquery-dropdown-search-demo.html'])[2]")).click();
			Select se = new Select(driver.findElement(By.xpath("//select[@id='country']")));
			List<WebElement> w =	se.getOptions();
			for(WebElement w1 : w)
			{
				System.out.println(w1.getText());
			}
			Select s = new Select(driver.findElement(By.xpath("//select[@id='country']")));
			s.selectByIndex(3);
	        System.out.println("Select value is: " + s.getFirstSelectedOption().getText());
			Select s1 = new Select(driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']")));
			  s1.selectByVisibleText("Denamark");
		        System.out.println("Select value is: " + s1.getFirstSelectedOption().getText());

			
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
}
