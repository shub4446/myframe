package com.crm.objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	//initializtion
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//decleration
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement organizationmod;
	
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaignmod;

	@FindBy(xpath="(//a[text()='Products'])[1]")
	private WebElement productmod;

	@FindBy(xpath=("(//td[@class='small'])[2]"))
	private WebElement signoutmod;

	@FindBy(xpath=("(//a[@class='drop_down_usersettings'])[2]"))
	private WebElement signoutbutton;

	@FindBy(xpath="//a[text()='More']")
	private WebElement morebutton;


	//getters
	public WebElement getCampaignmod() {
		return campaignmod;
	}

	public WebElement getOrganizationmod() {
		return organizationmod;
	}

	public WebElement getProductmod() {
		return productmod;
	}

	public WebElement getSignoutmod() {
		return signoutmod;
	}

	public WebElement getMorebutton() {
		return morebutton;
	}

	public WebElement getSignoutbutton() {
		return signoutbutton;
	}

	//buisness class 

	public void Clickorganizatrion() {
		organizationmod.click();}
	public void Clickproduct() {
		productmod.click();}
	public void Clickcampaign() {
		campaignmod.click();}
	public void Clicksignoutmod() {
		signoutmod.click();}
	public void Clickmore() {
		morebutton.click();}
	public void Clicksignout() {
		signoutbutton.click();}
		
		
		
	}



