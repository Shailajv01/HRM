package com.test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.ApplicationStagePage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class ApplicationStageTest extends BaseTest {

	private static final Logger logger = Logger.getLogger(ApplicationStageTest.class.getName());

	@BeforeClass
	@Parameters({ "siteURL", "browser" })
	public void initClass(String siteURL, String browser) throws Exception {
		logger.info("Starting of initClass method in ApplicationStageTest");

		this.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);

		this.goToSite(siteURL, driver);

		this.applicationStagePage = new ApplicationStagePage(this.driver);

		logger.info("Ending of initClass method in ApplicationStageTest");

	}

	@Test(priority = 1, description = " Test Case #1 , Verify EditBtn")
	@Description("Test Case #1, Verify EditBtn")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,  Verify EditBtn")
	public void VerifyEditBtn() throws InterruptedException {
		logger.info("Starting of VerifyEditBtn method");

		String getApplicationStageText = this.applicationStagePage.getApplicationStageText();
		Assert.assertEquals(getApplicationStageText, expectedAssertionsProp.getProperty("application.stage.text"));

		applicationStagePage.clickOnEditCheckbox();

		applicationStagePage.clickOnReplaceCurrentRadioBtn();

		String getUploadResumeText = this.applicationStagePage.getUploadResumeText();
		Assert.assertEquals(getUploadResumeText, expectedAssertionsProp.getProperty("upload.resume.text"));

		logger.info("Ending of VerifyEditBtn method");
	}
	
	@AfterClass
	public void quiteDriver() throws InterruptedException {
		logger.info("Starting of quiteDriver method");

		Thread.sleep(3000);
		driver.quit();

		logger.info("Ending of quiteDriver method");

	}


}
