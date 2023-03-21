package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classparametersTest {

	WebDriver driver = null;
	@Test
	public void method() {
		
		
		
		String Browser=System.getProperty("browser");
		System.out.println(Browser);

		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			new OperaDriver();
		}
		else {
			new ChromeDriver();	
		}
		String url=System.getProperty("url");
		driver.get(url);
		String username=System.getProperty("un");
		driver.findElement(By.name("user_name")).sendKeys(username);
		String password=System.getProperty("pw");
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		
		
	}
}