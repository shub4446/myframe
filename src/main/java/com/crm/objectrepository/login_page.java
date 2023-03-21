package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	
	//initialization
	public login_page (WebDriver driver) {
	
		PageFactory.initElements(driver, this);	
	}
	
	//decleration
	
	@FindBy(name="user_name")
	private WebElement usernametextfield;
	
	@FindBy(name="user_password")
	private WebElement passwordtextfield;
	
	@FindBy(id="submitButton")
	private WebElement submitbutton;
	
	//getters
	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}


	/**
	 * this methood is used to login the application
	 * @author shubham
	 */
	public void Login(String username,String password)
	{
		usernametextfield.sendKeys(username);
		passwordtextfield.sendKeys(password);
		submitbutton.click();
		
	}	
	
	
}
