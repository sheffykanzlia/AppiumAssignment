package com.selendroid.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.appiumframework.CommonUtils;
import com.appiumframework.DriverManager;

import Miscellaneous.Enum.WaitInterval;
import io.appium.java_client.android.AndroidDriver;;

public class RegistrationPage {
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;

	public RegistrationPage() {
		driver = DriverManager.driver;
	}

	By title_registrationPage = By.id("android:id/title");

	By welcome_text_registrationscreen = By.xpath("//android.widget.TextView[@text='Welcome to register a new User']");

	By username_text_registrationscreen = By.id("io.selendroid.testapp:id/label_username");

	By username_inputfield_registrationpage = By.id("io.selendroid.testapp:id/inputUsername");

	By email_text_registrationpage = By.xpath("//android.widget.TextView[@text='E-Mail']");

	By email_inputfield_registrationpage = By.id("io.selendroid.testapp:id/inputEmail");

	By password_text_registrationpage = By.xpath("//android.widget.TextView[@text='Password']");

	By password_inputfield_registrationpage = By.id("io.selendroid.testapp:id/inputPassword");

	By name_text_registrationpage = By.xpath("//android.widget.TextView[@text='Name']");

	By name_inputfield_registrationpage = By.id("io.selendroid.testapp:id/inputName");

	By programminglanguage_text_registrationpage = By.xpath("//android.widget.TextView[@text='Programming Languge']");

	By programmingLanguage_dropdown_registrationpage = By.id("android:id/text1");

	By accept_checkbox_registrationpage = By.id("io.selendroid.testapp:id/input_adds");

	By registerUser_button_registrationpage = By.id("io.selendroid.testapp:id/btnRegisterUser");

	public void verify_title_RegistrationScreen() {
		int maxtime = 0;
		while (!CommonUtils.waitForPresence(driver, 15, driver.findElement(title_registrationPage)) && maxtime <= 60) {
			maxtime = maxtime + 15;
		}
		Assert.assertTrue(driver.findElement(title_registrationPage).isDisplayed());
		System.out.println("Method Executed - verify_title_RegistrationScreen");
	}

	public void verify_WelcomeText_RegistrationScreen() {
		int maxtime = 0;
		while (!CommonUtils.waitForPresence(driver, 15, driver.findElement(welcome_text_registrationscreen))
				&& maxtime <= 60) {
			maxtime = maxtime + 15;
		}
		Assert.assertTrue(driver.findElement(welcome_text_registrationscreen).isDisplayed());
		System.out.println("Method Executed - verify_WelcomeText_RegistrationScreen");
	}

	public void verify_UserNameText_RegistrationScreen() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(username_text_registrationscreen)));
		Assert.assertTrue(driver.findElement(username_text_registrationscreen).isDisplayed());
		System.out.println("Method Executed - verify_UserNameText_RegistrationScreen");
	}

	public void verify_UserNameField_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(username_inputfield_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_UserNameField_RegistrationScreen");
	}

	public void verify_EmailText_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(email_text_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_EmailText_RegistrationScreen");
	}

	public void verify_EmailField_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(email_inputfield_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_EmailField_RegistrationScreen");
	}

	public void verify_PasswordText_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(password_text_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_PasswordText_RegistrationScreen");
	}

	public void verify_PasswordField_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(password_inputfield_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_PasswordField_RegistrationScreen");
	}

	public void verify_NameText_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(name_text_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_NameText_RegistrationScreen");
	}

	public void verify_NameField_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(name_inputfield_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_NameField_RegistrationScreen");
	}

	public void verify_ProgramminglanguageText_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(programminglanguage_text_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_ProgramminglanguageText_RegistrationScreen");
	}

	public void verify_ProgramminglanguageField_RegistrationScreen() {
		Assert.assertTrue(driver.findElement(programmingLanguage_dropdown_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_ProgramminglanguageField_RegistrationScreen");
	}

	public void verify_IAcceptCheckbox_RegistrationScreen() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(accept_checkbox_registrationpage)));
		Assert.assertTrue(driver.findElement(accept_checkbox_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_IAcceptCheckbox_RegistrationScreen");
	}

	public void verify_RegisterButton_RegistrationScreen() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(registerUser_button_registrationpage)));
		Assert.assertTrue(driver.findElement(registerUser_button_registrationpage).isDisplayed());
		System.out.println("Method Executed - verify_RegisterButton_RegistrationScreen");
	}

	public void verify_NameFieldValue_RegistrationScreen(String ExpectedNameText) {
		String ActualNameText = driver.findElement(name_inputfield_registrationpage).getText();
		Assert.assertEquals(ActualNameText, ExpectedNameText);
		System.out.println("Method Executed - verify_NameFieldValue_RegistrationScreen");
	}

	public void select_ProgrammingLanguageFieldValue_RegistrationScreen(String ExpectedProgramingLanguageOption) {
		driver.findElement(programmingLanguage_dropdown_registrationpage).click();
		int maxtime = 0;
		while (!CommonUtils.waitForPresence(driver, 15,
				driver.findElement(programmingLanguage_dropdown_registrationpage)) && maxtime <= 60) {
			maxtime = maxtime + 15;
		}
		List<WebElement> Languageoptions = driver.findElements(programmingLanguage_dropdown_registrationpage);
		System.out.println("Total number of options available in List " + Languageoptions.size());
		for (WebElement e : Languageoptions) {
			CommonUtils.waitForPresence(driver, 15, e);
			String value = e.getText();
			if (value.equalsIgnoreCase(ExpectedProgramingLanguageOption)) {
				e.click();
				break;
			}
		}

		System.out.println("Method Executed - select_ProgrammingLanguageFieldValue_RegistrationScreen");
	}

	public void verify_ProgrammingLanguageFieldValue_RegistrationScreen(String ExpectedProgramingLanguageOption) {
		String ActualLanguageoption = driver.findElement(programmingLanguage_dropdown_registrationpage).getText();
		Assert.assertEquals(ActualLanguageoption, ExpectedProgramingLanguageOption);
		System.out.println("Method Executed - verify_ProgrammingLanguageFieldValue_RegistrationScreen");
	}

	public void enter_UserName_RegistrationScreen(String UserName) {
		driver.findElement(username_inputfield_registrationpage).clear();
		driver.findElement(username_inputfield_registrationpage).sendKeys(UserName);
		System.out.println("Method Executed - Enter_UserName_RegistrationScreen");
	}

	public void enter_Email_RegistrationScreen(String Email) {
		driver.findElement(email_inputfield_registrationpage).clear();
		driver.findElement(email_inputfield_registrationpage).sendKeys(Email);
		System.out.println("Method Executed - Enter_Email_RegistrationScreen");
	}

	public void enter_Password_RegistrationScreen(String Password) {
		driver.findElement(password_inputfield_registrationpage).clear();
		driver.findElement(password_inputfield_registrationpage).sendKeys(Password);
		System.out.println("Method Executed - Enter_Password_RegistrationScreen");
	}

	public void enter_Name_RegistrationScreen(String Name) {
		driver.findElement(name_inputfield_registrationpage).clear();
		driver.findElement(name_inputfield_registrationpage).sendKeys(Name);
		System.out.println("Method Executed - Enter_Name_RegistrationScreen");
	}

	public void click_IAccept_RegistrationScreen() {
		driver.findElement(accept_checkbox_registrationpage).click();
		System.out.println("Method Executed - click_IAccept_RegistrationScreen");
	}

	public void click_RegisterButton_RegistrationScreen() {
		driver.findElement(registerUser_button_registrationpage).click();
		System.out.println("Method Executed - click_RegisterButton_RegistrationScreen");
	}

}
