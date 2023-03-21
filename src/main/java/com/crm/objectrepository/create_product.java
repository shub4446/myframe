package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_product {

	//initialization
	public create_product (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//decleration
	@FindBy(xpath="//img[@alt='Create Product...']") 
	private WebElement createprod;

	@FindBy(xpath="(//input[@class='detailedViewTextBox'])[1]") 
	private WebElement productfeedname;

	@FindBy(xpath="(//input[@class='crmbutton small save'])[1]") 
	private WebElement saveproductname;

	@FindBy(xpath="(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement deleteproduct;

	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement verifynameprod;


	//getters



	public WebElement getCreateprod() {
		return createprod;
	}

	public WebElement getVerifynameprod() {
		return verifynameprod;
	}

	public WebElement getProductfeedname() {
		return productfeedname;
	}

	public WebElement getSaveproductname() {
		return saveproductname;
	}

	public WebElement getDeleteproduct() {
		return deleteproduct;
	}

	//buisnesslogics

	public void Clickcreateprod() {
		createprod.click();
	}
	public void giveproductfeedname(String data1) {
		productfeedname.sendKeys(data1);
	}
	public void Clicksaveproductname() {
		saveproductname.click();
	}
	public void Clickdeleteproduct() {
		deleteproduct.click();
	}
	public String GETverifiedname() {
		return verifynameprod.getText();


	}

}

