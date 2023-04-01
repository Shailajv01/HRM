package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class menuPage extends BasePage{
	
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']]")
	private WebElement mnuRecruitment;
	
	@FindBy(xpath="//h5[contains(text(),'Candidates')]")
	private WebElement lblCndidates;
	
	@FindBy(xpath =" (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement ddJobTitle;
	
	@FindBy(xpath="//div[@role=\'listbox']/child::div[1]")
	private WebElement lstOfJobTitle;

	@FindBy(xpath ="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement ddVacancy;
	
	@FindBy(xpath="(//div[@class='oxd-select-option'])[1]")
	private WebElement lstOfVacancy;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")
	private WebElement ddHiringManager;
	
	@FindBy(xpath="(//div[@class='oxd-select-option'])[2]")
	private WebElement lstOfHiringManager;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")
	private WebElement ddStatus;
	
	@FindBy(xpath="(//div[@class='oxd-select-option'])[1]")
	private WebElement lstOfStatus;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement txtBoxCName;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement txtBoxKeywords;
	
	
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")
	private WebElement ddMethodOfApplication;
	
	@FindBy(xpath="(//div[@class='oxd-select-option'])[2]")
	private WebElement lstOfMap;
	
	public menuPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	

}
