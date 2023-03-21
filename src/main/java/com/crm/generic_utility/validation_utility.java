package com.crm.generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validation_utility {
	//initilization
	public validation_utility(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//decleration


	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement campaignvalidation;

	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement productlidation;

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement organizationvalidation;




	//getters
	public WebElement getCampaignvalidation() {
		return campaignvalidation;
	}

	public WebElement getProductlidation() {
		return productlidation;
	}

	public WebElement getOrganizationvalidation() {
		return organizationvalidation;
	}

	//buisness class


	/**
	 * this methood is used to validate campaign
	 * @param driver
	 * @param data1
	 * @author shubham
	 */
	public void campaignValid(WebDriver driver , String data1) {
		String text = campaignvalidation.getText();

		if(text.contains(data1)) 
		{
			System.out.println("thankyou the testcase is pass");
		}
		else {
			System.out.println("fail");
		}
	}

	/**
	 * this methood is used to validate organization
	 * @param driver
	 * @param data1
	 * @author shubham
	 */
	public void organizationValid(WebDriver driver , String value) {
		String text = organizationvalidation.getText();

		if(text.contains(value)) 
		{
			System.out.println("thankyou the testcase is pass");
		}
		else {
			System.out.println("fail");
		}
	}


	/**
	 * this methood is used to validate product
	 * @param driver
	 * @param data1
	 * @author shubham
	 */
	public void productValid(WebDriver driver , String value) {
		String text = productlidation.getText();

		if(text.contains(value)) 
		{
			System.out.println("thankyou the testcase is pass");
		}
		else {
			System.out.println("fail");
		}
	}
}