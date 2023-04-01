package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationStagePage extends BasePage {

	@FindBy(xpath = "//h6[text()='Application Stage']")
	private WebElement lblApplicationStage;

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
	private WebElement chkBoxEdit;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	private WebElement radioReplaceCurrent;

	@FindBy(xpath = "//label[text()='Upload Resume']")
	private WebElement lblUploadResume;

	@FindBy(xpath="(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]")
	private WebElement radioKeepCurrent;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnASSave;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement btnShortlist;


	public ApplicationStagePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public String getApplicationStageText() {
		logger.info("Starting of getApplicationStageText method");
		logger.info("Ending of getApplicationStageText method");
		return lblApplicationStage.getText();

	}

	public void clickOnEditCheckbox() {
		logger.info("Starting of clickOnEditCheckbox method");
		this.chkBoxEdit.click();
		logger.info("Ending of clickOnEditCheckbox method");

	}

	public void clickOnReplaceCurrentRadioBtn() {
		logger.info("Starting of clickOnReplaceCurrentRadioBtn method");
		this.clickOnWebElement(radioReplaceCurrent);
		logger.info("Starting of clickOnReplaceCurrentRadioBtn method");

	}

	public String getUploadResumeText() {
		logger.info("Starting of getUploadResumeText method");
		logger.info("Ending of getUploadResumeText method");
		return lblUploadResume.getText();

	}

	public void clickOnKeepCurrentRadioBtn() {
		logger.info("Starting of clickOnKeepCurrentRadioBtn method");
		this.radioKeepCurrent.click();
		logger.info("Starting of clickOnKeepCurrentRadioBtn method");

	}
	
	public boolean radioKeepCurrentRadioBtnIsDisabled() {
		
		logger.info("Starting of radioKeepCurrentCurrentRadioBtnIsDisabled method");
		logger.info("Ending of radioKeepCurrentCurrentRadioBtnIsDisabled method");
		return radioKeepCurrent.isEnabled();
		
		}
	
	
	public void clickOnASSaveBtn() {
		logger.info("Starting of clickOnASSaveBtn method");
		this.clickOnWebElement(btnASSave);
		logger.info("Starting of clickOnASSaveBtn method");

	}
	
	
	public void clickOnShortlistBtn() {
		logger.info("Starting of clickOnShortlistBtn method");
		this.clickOnWebElement(btnShortlist);
		logger.info("Starting of clickOnShortlistBtn method");

	}

	
	
	
	
	
	
	
	
	
	
	
	
}
