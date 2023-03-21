package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {

	@Test(dataProvider ="dataprovider_test")
	public void productdetails(String name, String partno, String web) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='productcode']")).sendKeys(partno);
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys(web);
		driver.quit();
		Thread.sleep(3000);
		
	}

	@DataProvider
	public Object[][] dataprovider_test(){
		Object[][] Objarr=new Object[3][3];
		Objarr[0][0]="iphone 13 pro";
		Objarr[0][1]="23423412";
		Objarr[0][2]="www.apple.co.in";

		Objarr[1][0]="iphone 14 pro";
		Objarr[1][1]="25675431";
		Objarr[1][2]="www.apple.co.in";

		Objarr[2][0]="iphone 12 pro";
		Objarr[2][1]="23456543";
		Objarr[2][2]="www.apple.co.in";


		return Objarr;
	}
}
