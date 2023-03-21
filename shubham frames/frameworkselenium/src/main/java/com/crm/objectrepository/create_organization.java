package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_organization {

	//initialization
	public create_organization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//decleration
	
	@FindBy (xpath="//img[@title='Create Organization...']")
	private WebElement createorganiztion;
	@FindBy (xpath="//input[@name='accountname']")
	private WebElement feedorgname; 
	@FindBy (xpath="(//input[@class='crmbutton small save'])[1]")
	private WebElement saveorg;
	@FindBy (xpath="(//span[@class='dvHeaderText'])")
	private WebElement verifyorg;
	
	//getters
	
	public WebElement getCreateorganiztion() {
		return createorganiztion;
	}
	public WebElement getVerifyorg() {
		return verifyorg;
	}
	public WebElement getFeedorgname() {
		return feedorgname;
	}
	public WebElement getSaveorg() {
		return saveorg;
	}
	
	//buisness logics
	
	public void Clickneworganization() {
		createorganiztion.click();
	}
	public void feedorgname(String value) {
		feedorgname.sendKeys(value);
	}
	public void Clicksaveorg() {
		saveorg.click();
	}
	public String Verifyorg() {
		String text = verifyorg.getText();
		return text;
	}
	
	
}
