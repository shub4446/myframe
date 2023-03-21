package com.crm.generic_utility;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class_mmt {
	public WebDriver driver ;
	@BeforeSuite(groups = {"smoke Test","reggression Test"})
	public void BS() {
		System.out.println("database connection");
	}
	@BeforeTest(groups = {"smoke Test","reggression Test"})
	public void BT() {
		System.out.println("Execute in parallel mode");
	}
	@BeforeClass(groups = {"smoke Test","reggression Test"})
	public void BC() throws IOException {
		File_utility flib=new  File_utility();
		String Browser = flib.getpropertykeyvalue("browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		if(Browser.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		System.out.println("launching the browser");
	}
	@BeforeMethod(groups = {"smoke Test","reggression Test"})
	public void BM() throws IOException {
		File_utility flib=new  File_utility();
		Webdriver_utility wlib=new Webdriver_utility();
		wlib.maxi_window(driver);
		driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		String url1=flib.getpropertykeyvalue("url2");
		driver.get(url1);
		System.out.println("login to application");
	}
	@AfterMethod(groups = {"smoke Test","reggression Test"})
	public void AM() {
		
		System.out.println("logout the application");
	}
	@AfterClass(groups = {"smoke Test","reggression Test"})
	public void AC() {
		driver.close();
		System.out.println("close the browser");
	}
	@AfterTest(groups = {"smoke Test","reggression Test"})
	public void AT() {
		System.out.println("EXECUTED SCUCESSFULLY");
	}
	@AfterSuite(groups = {"smoke Test","reggression Test"})
	public void AS() {
		System.out.println("database closed");
	}
}

