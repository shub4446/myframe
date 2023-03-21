package product_int_campaign;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;   
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class integrated {

	public static void main(String[] args) throws IOException, InterruptedException  {
		String key="webdriver.chrome.driver";
		String values="./chromedriver.exe";
		System.setProperty(key, values);
		WebDriver driver=new ChromeDriver();
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
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		FileInputStream fis1=new FileInputStream("./book1.xlxs.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		String data = wb.getSheet("product_int").getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(data);
		driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Set<String> dq = driver.getWindowHandles();
		Iterator<String> it= dq.iterator();
		while(it.hasNext()) {
			String wid=it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains("Products&action")) {
				break;	
			}	
		}

		driver.findElement(By.xpath("(//a[text()='iphone 14pro max'])[1]")).click();
		Set<String> dq1 = driver.getWindowHandles();
		Iterator<String> it1= dq1.iterator();
		while(it1.hasNext()) {
			String wid1=it1.next();
			driver.switchTo().window(wid1);
			if(driver.getTitle().contains("Campaigns&action")) {
				break;	
			}	
		}
		FileInputStream fis2=new FileInputStream("./book1.xlxs.xlsx");
		Workbook wb1=WorkbookFactory.create(fis2);
		String data2 = wb1.getSheet("c_phone").getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(data2);
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		String t1 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(t1.contains(data2)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("tc failed");
		}

		WebElement sign = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(sign).perform();
		driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
	}


}