package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_campaign_pom {
	//initializtion
	public create_campaign_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//decleration
	
	@FindBy(xpath=("//img[@alt='Create Campaign...']"))
	private WebElement createcampbutton;

	@FindBy(xpath=("//input[@name='campaignname']"))
	private WebElement campaignnamefeed;

	@FindBy(xpath=("//input[@title='Save [Alt+S]']"))
	private WebElement savecampbutton;	
	
	//getters

	public WebElement getSavecampbutton() {
		return savecampbutton; 
	}
	
	public WebElement getCreatecampbutton() {
		return createcampbutton;
	}
	public WebElement getCampaignnamefeed() {
		return campaignnamefeed;
	}

	//buisness class

	public void ClickCampaigncreation() {
		createcampbutton.click();	
	}
	public void ClickCampaignnamefeed(String data1) {
		campaignnamefeed.sendKeys(data1);	
	}
	public void ClickCampaignsavebutton() {
		savecampbutton.click();
	}
	
}