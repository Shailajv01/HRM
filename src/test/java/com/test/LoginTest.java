package com.test;

import java.text.ParseException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.AddCandidatePage;
import com.pages.ApplicationStagePage;
import com.pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LoginTest extends BaseTest {

	private static final Logger logger = Logger.getLogger(LoginTest.class.getName());

	@BeforeClass
	@Parameters({ "siteURL", "browser" })
	
	public void initClass(String siteURL, String browser) throws Exception {
		logger.info("Starting of initClass method in LoginTest");

		this.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);

		this.goToSite(siteURL, driver);

		this.loginpage = new LoginPage(this.driver);
		this.addCandidatePage = new AddCandidatePage(this.driver);
		this.applicationStagePage = new ApplicationStagePage(this.driver);

		logger.info("Ending of initClass method in LoginTest");

	}

	
	@Test(priority = 1, description = " Test Case #1 , Verify Login")
	@Description("Test Case #1, Verify Login")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,  Verify Login")
	public void VerifyLogin() throws InterruptedException {
		logger.info("Starting of VerifyLogin method");

		// String getLoginText = this.loginpage.getLoginText();
		// Assert.assertEquals(getLoginText,
		// expectedAssertionsProp.getProperty("login.text"));

		loginpage.setUsername(testDataprop.getProperty("name.text"));

		loginpage.setPassword(testDataprop.getProperty("password.text"));

		loginpage.clickOnLoginButton();

		logger.info("Ending of VerifyLogin method");
	}

	@Test(priority = 2, description = " Test Case #2 , Verify AddButton")
	@Description("Test Case #2, Verify AddButton")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2,  Verify AddButton")
	public void VerifyAddButton() throws InterruptedException, ParseException {
		logger.info("Starting of VerifyAddButton method");

		addCandidatePage.clickOnRecruitmentmnu();
		addCandidatePage.clickOnAddBtn();

		// String getAddCandidatesText = this.addCandidatePage.getAddCandidatesText();
		// Assert.assertEquals(getAddCandidatesText,
		// expectedAssertionsProp.getProperty("add.candidate.text"));

		addCandidatePage.setFirstName(testDataprop.getProperty("first.name.text"));
		addCandidatePage.setMiddleName(testDataprop.getProperty("middle.name.text"));
		addCandidatePage.setLastName(testDataprop.getProperty("last.name.text"));
		addCandidatePage.clickOnVanacyDd();
		addCandidatePage.setEmail(testDataprop.getProperty("email.text"));
		addCandidatePage.setContact(testDataprop.getProperty("contact.text"));
		addCandidatePage.uploaddoc();
		// addCandidatePage.clickOnCalnderIcon();

		addCandidatePage.clickOnConsentDataCheckBox();
		addCandidatePage.clickOnSavebtn();

		logger.info("Ending of VerifyAddButton method");
	}

	@Test(priority = 3, description = " Test Case #3 , Verify EditBtn")
	@Description("Test Case #3, Verify EditBtn")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #3,  Verify EditBtn")
	public void VerifyEditBtn() throws InterruptedException {
		logger.info("Starting of VerifyEditBtn method");

		String getApplicationStageText = this.applicationStagePage.getApplicationStageText();
		Assert.assertEquals(getApplicationStageText, expectedAssertionsProp.getProperty("application.stage.text"));

		applicationStagePage.clickOnEditCheckbox();

		applicationStagePage.clickOnReplaceCurrentRadioBtn();

		String getUploadResumeText = this.applicationStagePage.getUploadResumeText();
		Assert.assertEquals(getUploadResumeText, expectedAssertionsProp.getProperty("upload.resume.text"));

		applicationStagePage.clickOnKeepCurrentRadioBtn();

		applicationStagePage.radioKeepCurrentRadioBtnIsDisabled();

		applicationStagePage.clickOnASSaveBtn();

		applicationStagePage.clickOnShortlistBtn();

		logger.info("Ending of VerifyEditBtn method");
	}

	
	/*@DataProvider(parallel=true)
	public Object [][] loginData(){
		Object [][] data= new Object[2][2];
		data[0][0]= "Admin";
		data[0][1]="admin123";
		data[1][0]="admin";
		data[1][1]="admin123";
				
		return data;
		
				
				
				
	}*/
	@AfterClass
	public void quiteDriver() throws InterruptedException {
		logger.info("Starting of quiteDriver method");

		Thread.sleep(3000);
		driver.quit();

		logger.info("Ending of quiteDriver method");

	}

}
