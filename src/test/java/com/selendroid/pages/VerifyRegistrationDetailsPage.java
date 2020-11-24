package com.selendroid.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.appiumframework.CommonUtils;
import com.appiumframework.DriverManager;

import Miscellaneous.Enum.WaitInterval;
import io.appium.java_client.android.AndroidDriver;;

public class VerifyRegistrationDetailsPage {
	AndroidDriver driver;

	public VerifyRegistrationDetailsPage() {
		driver = DriverManager.driver;
	}

	By title_verificationPage = By.id("android:id/title");

	By verifyuser_text_verificationPage = By.xpath("//android.widget.TextView[@text=Verify user]");

	By name_label_verificationPage = By.xpath("//android.widget.TextView[@text='Name']");

	By name_Value_verificationPage = By.id("io.selendroid.testapp:id/label_name_data");

	By username_label_verificationPage = By.id("io.selendroid.testapp:id/label_username");

	By userName_Value_verificationPage = By.id("io.selendroid.testapp:id/label_username_data");

	By Password_label_verificationPage = By.id("io.selendroid.testapp:id/label_password");

	By Password_Value_verificationPage = By.id("io.selendroid.testapp:id/label_password_data");

	By email_label_verificationPage = By.id("io.selendroid.testapp:id/label_email");

	By email_Value_verificationPage = By.id("io.selendroid.testapp:id/label_email_data");

	By ProgrammingLanguage_label_verificationPage = By.id("io.selendroid.testapp:id/label_preferedProgrammingLanguage");

	By ProgrammingLanguage_Value_verificationPage = By
			.id("io.selendroid.testapp:id/label_preferedProgrammingLanguage_data");

	By IAcceptAds_label_verificationPage = By.id("io.selendroid.testapp:id/label_acceptAdds");

	By IAcceptAds_Value_verificationPage = By.id("io.selendroid.testapp:id/label_acceptAdds_data");

	By RegisterUser_button_verificationPage = By.id("io.selendroid.testapp:id/buttonRegisterUser");

	public void verify_title_VerificationScreen() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(title_verificationPage)));
		Assert.assertTrue(driver.findElement(title_verificationPage).isDisplayed());
		System.out.println("Method Executed - verify_title_VerificationScreen");
	}

	public void verifyuserText_VerificationScreen() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(verifyuser_text_verificationPage)));
		Assert.assertTrue(driver.findElement(verifyuser_text_verificationPage).isDisplayed());
		System.out.println("Method Executed - verifyuserText_VerificationScreen");
	}

	public void verify_NameLabel_VerificationScreen() throws InterruptedException {
		int maxtime=0;
		while (!CommonUtils.waitForPresence(driver, 15, driver.findElement(name_label_verificationPage)) && maxtime<=60) {
			maxtime=maxtime+15;
		}
		Thread.sleep(10000);
		// new WebDriverWait(driver,
		// WaitInterval.OneMinute.getSeconds()).until(ExpectedConditions.visibilityOf(driver.findElement(name_label_verificationPage)));
		Assert.assertTrue(driver.findElement(name_label_verificationPage).isDisplayed());
		System.out.println("Method Executed - verify_NameLabel_VerificationScreen");
	}

	public void verify_NameValue_VerificationScreen(String ExpectedNameValue) {
		String ActualNameValue = driver.findElement(name_Value_verificationPage).getText();
		Assert.assertEquals(ActualNameValue, ExpectedNameValue);
		System.out.println("Method Executed - verify_NameValue_VerificationScreen");
	}

	public void verify_userNameLabel_VerificationScreen() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(username_label_verificationPage)));
		Assert.assertTrue(driver.findElement(username_label_verificationPage).isDisplayed());
		System.out.println("Method Executed - verify_userNameLabel_VerificationScreen");
	}

	public void verify_usernameValue_VerificationScreen(String ExpectedUserNameValue) {
		String ActualUserNameValue = driver.findElement(userName_Value_verificationPage).getText();
		Assert.assertEquals(ActualUserNameValue, ExpectedUserNameValue);
		System.out.println("Method Executed - verify_usernameValue_VerificationScreen");
	}

	public void verify_PasswordLabel_VerificationScreen() {
		Assert.assertTrue(driver.findElement(Password_label_verificationPage).isDisplayed());
		System.out.println("Method Executed - verify_PasswordLabel_VerificationScreen");
	}

	public void verify_PasswordValue_VerificationScreen(String ExpectedPasswordValue) {
		String ActualPasswordValue = driver.findElement(Password_Value_verificationPage).getText();
		Assert.assertEquals(ActualPasswordValue, ExpectedPasswordValue);
		System.out.println("Method Executed - verify_PasswordValue_VerificationScreen");
	}

	public void verify_EmailLabel_VerificationScreen() {
		Assert.assertTrue(driver.findElement(email_label_verificationPage).isDisplayed());
		System.out.println("Method Executed - verify_EmailLabel_VerificationScreen");
	}

	public void verify_EmailValue_VerificationScreen(String ExpectedEmailValue) {
		String ActualEmailValue = driver.findElement(email_Value_verificationPage).getText();
		Assert.assertEquals(ActualEmailValue, ExpectedEmailValue);
		System.out.println("Method Executed - verify_EmailValue_VerificationScreen");
	}

	public void verify_ProgrammingLanguageLabel_VerificationScreen() {
		Assert.assertTrue(driver.findElement(ProgrammingLanguage_label_verificationPage).isDisplayed());
		System.out.println("Method Executed - verify_ProgrammingLanguageLabel_VerificationScreen");
	}

	public void verify_ProgrammingLanguageValue_VerificationScreen(String ExpectedProgrammingLanguageValue) {
		String ActualProgrammingLanguageValue = driver.findElement(ProgrammingLanguage_Value_verificationPage)
				.getText();
		Assert.assertEquals(ActualProgrammingLanguageValue, ExpectedProgrammingLanguageValue);
		System.out.println("Method Executed - verify_ProgrammingLanguageValue_VerificationScreen");
	}

	public void verify_AcceptAdsLabel_VerificationScreen() {
		Assert.assertTrue(driver.findElement(IAcceptAds_label_verificationPage).isDisplayed());
		System.out.println("Method Executed - verify_AcceptAdsLabel_VerificationScreen");
	}

	public void verify_AcceptAdsValue_VerificationScreen(String expectedValue) {
		String ActualValue = driver.findElement(IAcceptAds_Value_verificationPage).getText();
		Assert.assertEquals(ActualValue, expectedValue);
		System.out.println("Method Executed - verify_AcceptAdsValue_VerificationScreen");
	}

	public void click_RegisterUserbutton_VerificationScreen() {
		driver.findElement(RegisterUser_button_verificationPage).click();
		System.out.println("Method Executed - click_RegisterUserbutton_VerificationScreen");
	}

}
