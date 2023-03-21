import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class delete {

	public static void main(String[] args) throws IOException, InterruptedException {
		String key="webdriver.chrome.driver";
		String values="./geckodriver.exe";
		System.setProperty(key, values);
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		FileInputStream fis= new FileInputStream("./commandata.properties");
		Properties pro= new Properties();
		pro.load(fis);
		String url1 = pro.getProperty("url");
		String uN=pro.getProperty("un");
		String pW=pro.getProperty("pw");
		driver.get(url1);
		driver.findElement(By.name("user_name")).sendKeys(uN);
		driver.findElement(By.name("user_password")).sendKeys(pW);
		driver.findElement(By.id("submitButton")).click();
		WebElement more = driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[11]"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		FileInputStream fis1=new FileInputStream("./book1.xlxs.xlsx");
		Workbook wb= WorkbookFactory.create(fis1);
		String data1 = wb.getSheet("Sheet3").getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(data1);
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@title='Delete [Alt+D]'])[1]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		  WebElement sign = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
		  Actions a2=new Actions(driver); a2.moveToElement(sign).perform();
		  driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).
		  click();
		 
	}

}
