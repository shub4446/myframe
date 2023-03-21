package com.crm.generic_utility;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Webdriver_utility {

	/**
	 * used only in find elements and find elements to provide waiting conditions for that
	 * @param driver
	 * @author shubham
	 */
	public void implicit_wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	/**
	 * AFTER EVERY ACTION IT WILL WAIT FOR THE NEXT ACTION TO PERFORM
	 * @param driver
	 */
	public void Scripttimeout(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);	
	}
	/**
	 * used to wait for a element to be clickable in gui , and check for specific element 
	 * @param driver
	 * @param Element
	 */
	public void wait_for_element_to_be_clickable(WebDriver driver, WebElement Element) {
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Element));

	}
	/**
	 * to move to any particular element
	 * @param driver
	 * @param Element
	 */
	public void mouse_hover_onelement(WebDriver driver,WebElement Element) {
		Actions a=new Actions(driver);
		a.moveToElement(Element).perform();
	}
	/**
	 * used to right click on the element
	 * @param driver
	 * @param Element
	 */
	public void rightClickonElement(WebDriver driver,WebElement Element) {
		Actions a=new Actions(driver);
		a.contextClick(Element);
	}
	/**
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void moveby_offset(WebDriver driver,int x,int y) {
		Actions a=new Actions(driver);
		a.moveByOffset(x , y).click().perform();
	}
	/**
	 * used to wait until the page loads completely
	 * @param driver
	 * @author shubham
	 */
	public void page_loadtime(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	/**
	 * explicit wait condition for prescence of element located 
	 * @param driver
	 * @author shubham
	 */
	public void waitexpected_condition(WebDriver driver,WebElement Element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("Element")));
	}
	/**
	 * to select the values according to index
	 * @author shubham
	 */
	public void select_byindex(WebElement Element, int index) {
		Select s=new Select(Element);
		s.selectByIndex(index);
	}
	/**
	 * to select the values according to visible text
	 * @author shubham
	 */
	public void select_byvisibletext(WebElement Element, String vtext) {
		Select s=new Select(Element);
		s.selectByVisibleText(vtext);
	}
	/**
	 * to select the values according to their values
	 * @author shubham
	 */
	public void select_byvalues(WebElement Element, String value) {
		Select s=new Select(Element);
		s.selectByValue(value);
	}
	/**
	 * used to deselect all
	 * @author shubham
	 */
	public void deselectall(WebElement Element) {
		Select s =new Select(Element);
		s.deselectAll();
	}
	/**
	 * used to deselect by indexwise
	 * @author shubham
	 */
	public void deselectbyindex(WebElement Element, int index) {
		Select s =new Select(Element);
		s.deselectByIndex(index);
	}
	/**
	 * used to deselect by values
	 * @author shubham
	 */
	public void deselectbyvalues(WebElement Element, String value) {
		Select s =new Select(Element);
		s.deselectByValue(value);
	}
	/**
	 *  used to deselect by visibletext
	 *  @author shubham
	 */
	public void deselectby_visibletext(WebElement Element, String vtext) {
		Select s =new Select(Element);
		s.deselectByVisibleText(vtext);
	}
	/**
	 * used to switch from one frame to another frame
	 * @param driver
	 * @param index
	 * @author shubham
	 */
	public void switch_to_frameby(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * used to switch by using attribute
	 * @param driver
	 * @param id_by_att
	 * @author shubham
	 */
	public void switch_to_frame_byid(WebDriver driver ,String id_by_att ) {
		driver.switchTo().frame(id_by_att);

	}
	/**
	 * to dismiss the alert we use dismiss
	 * @param driver
	 * author shubham
	 */
	public void switch_to_alert_dismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * to accept the alert we use accept
	 * @param driver
	 * author shubham
	 */
	public void switch_to_alert_accept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * to switch the window based on title
	 * @param driver
	 * @param title
	 * author shubham
	 */
	public void Switch_to_window(WebDriver driver,String title) {
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> it = allid.iterator();
		while(it.hasNext()) {
			String wid=it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(title)) {
				break;
			}
		}}
	/**
	 * in order to maximize the window we use it
	 * @param driver
	 * author shubham
	 */
	public void maxi_window(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * to provide waiting conditions
	 * @throws InterruptedException
	 * @author shubham
	 */
	public void ts() throws InterruptedException {
		Thread.sleep(3000);
	}
}