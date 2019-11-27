package com.iLABWebsite.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"menu-item-1373\"]/a")
	WebElement lnkCareers;
	
	@FindBy(xpath= "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div/div[3]/a")
	public WebElement lnkSouthAfrica;
	
	@FindBy(xpath = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/span[1]/a")
	public WebElement lnkFirstOpening;
	
	@FindBy(xpath = "//*[@id=\"wpjb-scroll\"]/div[1]/a")
	public WebElement lnkApplyNow;
	
	@FindBy(id = "applicant_name")
	public WebElement txtname;
	
	@FindBy(how = How.NAME, using = "email")
	public WebElement txtEmail;
	
	@FindBy(how = How.NAME, using = "phone")
	public WebElement txtPhone;
	
	@FindBy(how = How.ID, using = "wpjb_submit")
	public WebElement btnSendApplication;
	
	@FindBy(xpath = "//*[@id=\"wpjb-apply-form\"]/fieldset[1]/div[5]/div/ul/li")
	public WebElement lblUploadErrorMessage;
	
	
	public void clickCarrers()
	{
		lnkCareers.click();
	}
	
	public void clickSouthAfrica()
	{
		lnkSouthAfrica.click();
	}
	
	public void clickFirstOPening()
	{
		lnkFirstOpening.click();
	}
	
	public void clickApplyNow()
	{
		lnkApplyNow.click();
	}
	
	public void captureName(String name)
	{
		txtname.sendKeys(name);
	}
	
	public void captureEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void capturePhoneNumber(String phone)
	{
		txtPhone.sendKeys(phone);
	}
	
	public void clickSendApplication()
	{
		btnSendApplication.click();
	}
	
	
	public String getTextValidation()
	{
		String results = lblUploadErrorMessage.getText();
		return results;
	}
}
