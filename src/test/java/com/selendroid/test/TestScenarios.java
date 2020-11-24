package com.selendroid.test;

import org.testng.annotations.Test;

import com.appiumframework.Base;
import com.appiumframework.PropertyManager;
import com.selendroid.pages.ChromePage;
import com.selendroid.pages.HomeScreen;
import com.selendroid.pages.RegistrationPage;
import com.selendroid.pages.VerifyRegistrationDetailsPage;
import com.selendroid.pages.WayofSayingHello;

public class TestScenarios extends Base {

	PropertyManager testDataHelper = new PropertyManager();

	@Test(description = "Verify elements on home screen", priority = 6, enabled = true)
	public void verifyHomeScreen_Scenario1() {

		// Verify all the elements on home Page
		HomeScreen homescreenverification = new HomeScreen();
		homescreenverification.verify_HomeScreen_title();
		homescreenverification.verify_HelloDefault_TextLineBelowTitle();
		homescreenverification.verify_Localization_TextLine();
		homescreenverification.verify_ENButton();
		homescreenverification.verify_ChromeButton();
		homescreenverification.verify_FileLogoButton();
		homescreenverification.verify_TextFieldBox();
		homescreenverification.verify_ProgressBarButton();
		homescreenverification.verify_AcceptAdsCheckbox();
		homescreenverification.verify_DisplayTextViewButton();
		homescreenverification.verify_DisplayToastButton();
		homescreenverification.verify_DisplayPopUpWindowButton();
		homescreenverification.verify_UnhandledExceptionButton();
		homescreenverification.verify_UnhandledExceptionTextBox();
		homescreenverification.verify_ForeignCharacters();
		homescreenverification.verify_DisplayLayoutButton();

	}

	@Test(description = "Tap on EN button", priority = 7, enabled = true)
	public void tapENbutton_Scenario2() {
		HomeScreen tapENbutton = new HomeScreen();
		tapENbutton.clickENButton(); // Click on EN button
		tapENbutton.clickNoButton_ENPopUp(); 
		tapENbutton.verify_HomeScreen_title(); 
	}

	@Test(description = "Tap on Chrome Logo button", priority = 1, enabled = true)
	public void tapChromeLogobutton_Scenario3() throws InterruptedException {
		HomeScreen tapchromebutton = new HomeScreen();
		tapchromebutton.clickChromeLogoButton(); // Click on Chrome logo button

		ChromePage chromepage = new ChromePage();
		chromepage.verify_ChromePage_title(); // Verify the title
		chromepage.verify_Hello_Text(); // Verify the Hello Text on chrome page
		chromepage.enterName_TextField(testDataHelper.getValue("Chrome_NameField")); 
		chromepage.selectPreferredCarOption(testDataHelper.getValue("PreferenceCaroption")); 
		chromepage.verify_selectedCarOption(testDataHelper.getValue("PreferenceCaroption"));
		chromepage.clickSendNameButton(); // Click on send me your Name

		WayofSayingHello hellopage = new WayofSayingHello();
		hellopage.verify_hellotext_helloScreen(); 
		hellopage.verify_Name_helloScreen(testDataHelper.getValue("HelloScreen_NameField")); 
		hellopage.verify_CarName_helloScreen(testDataHelper.getValue("HelloScreen_Caroption"));
		hellopage.click_link_helloScreen(); 

		chromepage.verify_selectedCarOption(testDataHelper.getValue("defaultCarOption")); 
	}

	@Test(description = "Tap on File Logo button", priority = 2, enabled = true)
	public void tapFileLogobutton_Scenario4() throws InterruptedException {
		HomeScreen tapFilebutton = new HomeScreen();
		tapFilebutton.clickFileLogoButton();

		RegistrationPage register = new RegistrationPage();
		register.verify_title_RegistrationScreen();
		register.verify_WelcomeText_RegistrationScreen();
		register.verify_UserNameText_RegistrationScreen();
		register.verify_UserNameField_RegistrationScreen();
		register.verify_EmailText_RegistrationScreen();
		register.verify_EmailField_RegistrationScreen();
		register.verify_PasswordText_RegistrationScreen();
		register.verify_PasswordField_RegistrationScreen();
		register.verify_NameText_RegistrationScreen();
		register.verify_NameField_RegistrationScreen();
		register.verify_ProgramminglanguageText_RegistrationScreen();
		register.verify_ProgramminglanguageField_RegistrationScreen();
		register.verify_IAcceptCheckbox_RegistrationScreen();
		register.verify_RegisterButton_RegistrationScreen();

		register.verify_NameFieldValue_RegistrationScreen(testDataHelper.getValue("RegistrationExpectedName"));
		register.verify_ProgrammingLanguageFieldValue_RegistrationScreen(testDataHelper.getValue("DefaultProgrammingLanguage"));

		register.enter_UserName_RegistrationScreen(testDataHelper.getValue("RegistrationUserName"));
		register.enter_Email_RegistrationScreen(testDataHelper.getValue("RegistrationEmail"));
		register.enter_Password_RegistrationScreen(testDataHelper.getValue("RegistrationPassowrd"));
		register.enter_Name_RegistrationScreen(testDataHelper.getValue("RegistrationName"));
		register.select_ProgrammingLanguageFieldValue_RegistrationScreen(testDataHelper.getValue("NewProgrammingLanguage"));
		register.click_IAccept_RegistrationScreen();
		register.click_RegisterButton_RegistrationScreen();

		VerifyRegistrationDetailsPage verify = new VerifyRegistrationDetailsPage();
		verify.verify_NameLabel_VerificationScreen();
		verify.verify_NameValue_VerificationScreen(testDataHelper.getValue("RegistrationName"));
		verify.verify_userNameLabel_VerificationScreen();
		verify.verify_usernameValue_VerificationScreen(testDataHelper.getValue("RegistrationUserName"));
		verify.verify_PasswordLabel_VerificationScreen();
		verify.verify_PasswordValue_VerificationScreen(testDataHelper.getValue("RegistrationPassowrd"));
		verify.verify_EmailLabel_VerificationScreen();
		verify.verify_EmailValue_VerificationScreen(testDataHelper.getValue("RegistrationEmail"));
		verify.verify_ProgrammingLanguageLabel_VerificationScreen();
		verify.verify_ProgrammingLanguageValue_VerificationScreen(testDataHelper.getValue("NewProgrammingLanguage"));
		verify.verify_AcceptAdsLabel_VerificationScreen();
		verify.verify_AcceptAdsValue_VerificationScreen(testDataHelper.getValue("IAcceptValue"));
		verify.click_RegisterUserbutton_VerificationScreen();
	}

	@Test(description = "Tap on Progress Bar button", priority = 3, enabled = true)
	public void tapProgressBarbutton_Scenario5() throws InterruptedException {
		HomeScreen tapProgressBarbutton = new HomeScreen();
		tapProgressBarbutton.clickProgressBarButton();
		tapProgressBarbutton.waitForInvisibility_ProgressBarButton();

		RegistrationPage register = new RegistrationPage();
		register.verify_title_RegistrationScreen();
		register.verify_WelcomeText_RegistrationScreen();
		register.verify_UserNameText_RegistrationScreen();
		register.verify_UserNameField_RegistrationScreen();
		register.verify_EmailText_RegistrationScreen();
		register.verify_EmailField_RegistrationScreen();
		register.verify_PasswordText_RegistrationScreen();
		register.verify_PasswordField_RegistrationScreen();
		register.verify_NameText_RegistrationScreen();
		register.verify_NameField_RegistrationScreen();
	}

	@Test(description = "Tap on Display Toaster button", priority = 4, enabled = true)
	public void tapDisplayToasterbutton_Scenario6() throws InterruptedException {
		HomeScreen tapToasterbutton = new HomeScreen();
		tapToasterbutton.clickDisplayToastButton(testDataHelper.getValue("ToasterMessageText"));
	}

	@Test(description = "Tap on Display Pop Up button", priority = 5, enabled = true)
	public void tapDisplayPopUpbutton_Scenario7() {
		HomeScreen tapPopUpbutton = new HomeScreen();
		tapPopUpbutton.clickDisplayPopUpButton();

	}

	@Test(description = "Tap on Unhandled Exception button", priority = 8, enabled = true)
	public void tapUnhandledExceptionbutton_Scenario8_failTestCase() {
		HomeScreen tapUnhandledExceptionbutton = new HomeScreen();
		tapUnhandledExceptionbutton.clickUnhandledExceptionButton();
		tapUnhandledExceptionbutton.verify_HomeScreen_title();

	}

	@Test(description = "Enter text in Unhandled Exception button", priority = 9, enabled = true)
	public void entertext_UnhandledException_Scenario9_failTestCase() {
		HomeScreen UnhandledExceptiontext = new HomeScreen();
		UnhandledExceptiontext.entertext_unhandledException("Test");

	}
	

}
