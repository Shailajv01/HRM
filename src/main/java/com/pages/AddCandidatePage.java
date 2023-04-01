package com.pages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.apache.tools.ant.types.resources.selectors.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCandidatePage extends BasePage {
	private static final Logger logger = Logger.getLogger(AddCandidatePage.class.getName());

	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement mnuRecruitment;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement btnAdd;

	@FindBy(xpath = "h6[text()='Add Candidate']")
	private WebElement lblAddCandidate;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement txtBoxFirstName;

	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement txtBoxMiddleName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement txtBoxLastName;

	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	private WebElement ddVacany;

	@FindBy(xpath = "//div[text()='Junior Account Assistant']")
	private WebElement lstOfVacany;

	@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
	private WebElement txtBoxEmail;

	@FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
	private WebElement txtBoxContact;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement uploaddoc;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	private WebElement pastDate;

	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement iconCalender;

	@FindBy(xpath = "//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")
	private WebElement chkBoxConsentData;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSave;

	@FindBy(xpath = "//div[@class='oxd-date-input']/child::input")
	private WebElement txtcalender;

	public AddCandidatePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnRecruitmentmnu() {
		logger.info("Starting of clickOnRecruitmentmnu method");
		this.clickOnWebElement(mnuRecruitment);
		logger.info("Ending of clickOnRecruitmentmnu method");
	}

	public void clickOnAddBtn() {
		logger.info("Starting of clickOnAddBtn method");
		this.clickOnWebElement(btnAdd);
		logger.info("Ending of clickOnAddBtn method");
	}

	public String getAddCandidatesText() {
		logger.info("Starting of getAddCandidatesText method");
		logger.info("Ending of getAddCandidatesText method");
		return lblAddCandidate.getText();

	}

	public void setFirstName(String strFirstName) {
		logger.info("Starting of setFirstName method");

		this.txtBoxFirstName.click();
		this.txtBoxFirstName.sendKeys(strFirstName);

		logger.info("Ending of setFirstName method");
	}

	public void setMiddleName(String strMiddleName) {
		logger.info("Starting of setMiddleName method");

		this.txtBoxMiddleName.click();
		this.txtBoxMiddleName.sendKeys(strMiddleName);

		logger.info("Ending of setMiddleName method");
	}

	public void setLastName(String strLastName) {
		logger.info("Starting of setLastName method");

		this.txtBoxLastName.click();
		this.txtBoxLastName.sendKeys(strLastName);

		logger.info("Ending of setLastName method");
	}

	public void clickOnVanacyDd() {
		logger.info("Starting of clickOnVanacyDd method");
		this.ddVacany.click();

		ddVacany.sendKeys(Keys.ARROW_DOWN);
		ddVacany.sendKeys(Keys.ENTER);
		this.ddVacany.click();

		logger.info("Ending of clickOnVanacyDd method");

	}

	public void setEmail(String strEmail) {
		logger.info("Starting of setEmail method");

		this.txtBoxEmail.click();
		this.txtBoxEmail.sendKeys(strEmail);

		logger.info("Ending of setEmail method");
	}

	public void setContact(String strContact) {
		logger.info("Starting of setContact method");

		this.txtBoxContact.click();
		this.txtBoxContact.sendKeys(strContact);

		logger.info("Ending of setContact method");
	}

	public void uploaddoc() {

		logger.info("Starting of uploaddoc method");

		String osPath = System.getProperty("os.name");
		if (osPath.contains("Windows")) {

			uploaddoc.sendKeys("C:\\Users\\MICROCHIP\\Desktop\\Notes\\jmeter\\jmetrenotes.txt ");

		} else {

			uploaddoc.sendKeys("C:\\Users\\MICROCHIP\\Desktop\\Notes\\ubuntu terminal commands.txt");

		}
		logger.info("Ending of uploaddoc method");
	}
	/*
	 * public void clickOnFileUpload() {
	 * logger.info("Starting of clickOnFileUpload method");
	 * 
	 * 
	 * this.clickOnWebElement(uploaddoc);
	 * driver.findElement(By.xpath("//input[@type='file']"))
	 * .sendKeys("C:\\Users\\MICROCHIP\\Desktop\\Notes\\jmetrenotes.txt");
	 * 
	 * // this.uploaddoc.sendKeys(
	 * "C:\\Users\\MICROCHIP\\Desktop\\Notes\\jmetrenotes.txt");
	 * 
	 * 
	 * logger.info("Ending of clickOnFileUpload method"); }
	 */

	public void clickOnCalnderIcon() {

		logger.info("Starting of clickOnCalnderIcon");
		this.iconCalender.click();
		WebElement element = driver.findElement(By.xpath("//div[@class='oxd-date-input']/child::input"));

		element.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);

		element.sendKeys(getPastDate() + Keys.ENTER);

		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		logger.info("Ending of clickOnConsentDataCheckBox");

	}

	public void clickOnConsentDataCheckBox() {

		logger.info("Starting of clickOnConsentDataCheckBox method");
		this.scrollDown(300);
		this.chkBoxConsentData.click();
		logger.info("Ending of clickOnConsentDataCheckBox method");
	}

	public void clickOnSavebtn() {
		logger.info("Starting of clickOnSavebtn");
		this.clickOnWebElement(btnSave);

		logger.info("Ending of clickOnSavebtn");

	}
}
