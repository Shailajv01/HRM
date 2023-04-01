package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	@FindBy(xpath ="//h5[text()='Login']")
	private WebElement lblLogin;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement txtBoxUsername;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement txtBoxPassword;
	 
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}

	public String getLoginText() {
		logger.info("Starting of getLoginText method");
		logger.info("Ending of getLoginText method");
		return lblLogin.getText();
		
	}
	
	public void setUsername(String strName) {
		logger.info("Starting of setUsername method");
		this.clickOnWebElement(txtBoxUsername);
		this.txtBoxUsername.sendKeys(strName);
		logger.info("Ending of setUsername method");
	}
	
	public void setPassword(String strPassword)  {
		logger.info("Starting of setPassword method");
		
		this.clickOnWebElement(txtBoxPassword);
		this.txtBoxPassword.sendKeys(strPassword);
		logger.info("Ending of setPassword method");
	}
	
	public void clickOnLoginButton() {
		logger.info("Starting of clickOnLoginButton method");
		
		this.implicitWait();
		this.clickOnWebElement(btnLogin);
		logger.info("Ending of clickOnLoginButton method");
	
	
}
}