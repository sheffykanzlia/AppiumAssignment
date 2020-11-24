package com.selendroid.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.appiumframework.CommonUtils;
import com.appiumframework.DriverManager;

import Miscellaneous.Enum.WaitInterval;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;;

public class HomeScreen {
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;

	public HomeScreen() {
		driver = DriverManager.driver;
	}

	By Title_homepage = By.id("io.selendroid.testapp:id/my_text_field");

	By HelloDefault_TextLineBelowTitle_Home_Screen = By
			.xpath("//android.widget.TextView[@text='Hello Default Locale, Selendroid-test-app!']");

	By Localization_TextLine_Home_Screen = By
			.xpath("//android.widget.TextView[@text='Localization (L10n) locator test']");

	By ENButton_Home_Screen = By.id("io.selendroid.testapp:id/buttonTest");

	By ChromeLogoButton_Home_Screen = By.id("io.selendroid.testapp:id/buttonStartWebview");

	By FileLogoButton_Home_Screen = By.id("io.selendroid.testapp:id/startUserRegistration");

	By MyTextField_Home_Screen = By.id("io.selendroid.testapp:id/my_text_field");

	By ShowProgressBar_Button_Home_Screen = By.id("io.selendroid.testapp:id/waitingButtonTest");

	By IacceptAds_CheckBox_Home_Screen = By.id("io.selendroid.testapp:id/input_adds_check_box");

	By DisplayTextView_Button_Home_Screen = By.id("io.selendroid.testapp:id/visibleButtonTest");

	By DisplayToast_Button_Home_Screen = By.id("io.selendroid.testapp:id/showToastButton");

	By DisplayPopUpWindow_Button_Home_Screen = By.id("io.selendroid.testapp:id/showPopupWindowButton");

	By ThrowException_Button_Home_Screen = By.id("io.selendroid.testapp:id/exceptionTestButton");

	By ThrowException_TextBox_Home_Screen = By.id("io.selendroid.testapp:id/exceptionTestField");

	By ForeignCharacters_Text_Home_Screen = By.id("io.selendroid.testapp:id/encodingTextview");

	By DisplayLayout_Button_Home_Screen = By.id("io.selendroid.testapp:id/topLevelElementTest");

	By No_Button_ENPopUp = By.xpath("//android.widget.Button[@text='No, no']");

	By ProgressBar_button_homePage = By.id("io.selendroid.testapp:id/waitingButtonTest");

	By ProgressBar_homePage = By.className("android.widget.FrameLayout");

	By toastmessage_button_homePage = By.id("io.selendroid.testapp:id/showToastButton");

	By toastmessage = By.xpath("//android.widget.Toast[1]");

	By DisplayPopUp_button_homePage = By.id("io.selendroid.testapp:id/showPopupWindowButton");

	By unhandledException_Textbox_homePage = By.id("io.selendroid.testapp:id/exceptionTestField");

	By Dismiss_Button_PopupDialog = By.id("io.selendroid.testapp:id/popup_dismiss_button");

	@AndroidFindBy(accessibility = "showPopupWindowButtonCD")
	public WebElement popupButtonDismiss;

	By unhandledException_button_homePage = By.id("io.selendroid.testapp:id/exceptionTestButton");

	public void verify_HomeScreen_title() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds()).until(ExpectedConditions.visibilityOf(driver.findElement(Title_homepage)));
		Assert.assertTrue(driver.findElement(Title_homepage).isDisplayed());
		System.out.println("Method Executed - verify_HomeScreen_title");

	}

	public void verify_HelloDefault_TextLineBelowTitle() {
		Assert.assertTrue(driver.findElement(HelloDefault_TextLineBelowTitle_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_HelloDefault_TextLineBelowTitle");
	}

	public void verify_Localization_TextLine() {
		Assert.assertTrue(driver.findElement(Localization_TextLine_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_Localization_TextLine");
	}

	public void verify_ENButton() {
		Assert.assertTrue(driver.findElement(ENButton_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_ENButton");
	}

	public void verify_ChromeButton() {
		Assert.assertTrue(driver.findElement(ChromeLogoButton_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_ChromeButton");
	}

	public void verify_FileLogoButton() {
		Assert.assertTrue(driver.findElement(FileLogoButton_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_FileLogoButton");
	}

	public void verify_TextFieldBox() {
		Assert.assertTrue(driver.findElement(MyTextField_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_TextFieldBox");
	}

	public void verify_ProgressBarButton() {
		Assert.assertTrue(driver.findElement(ShowProgressBar_Button_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_ProgressBarButton");
	}

	public void verify_AcceptAdsCheckbox() {
		Assert.assertTrue(driver.findElement(IacceptAds_CheckBox_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_AcceptAdsCheckbox");
	}

	public void verify_DisplayTextViewButton() {
		Assert.assertTrue(driver.findElement(DisplayTextView_Button_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_DisplayTextViewButton");
	}

	public void verify_DisplayToastButton() {
		Assert.assertTrue(driver.findElement(DisplayToast_Button_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_DisplayToastButton");
	}

	public void verify_DisplayPopUpWindowButton() {
		Assert.assertTrue(driver.findElement(DisplayPopUpWindow_Button_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_DisplayPopUpWindowButton");
	}

	public void verify_UnhandledExceptionButton() {
		Assert.assertTrue(driver.findElement(ThrowException_Button_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_UnhandledExceptionButton");
	}

	public void verify_UnhandledExceptionTextBox() {
		Assert.assertTrue(driver.findElement(ThrowException_TextBox_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_UnhandledExceptionTextBox");
	}

	public void verify_ForeignCharacters() {
		Assert.assertTrue(driver.findElement(ForeignCharacters_Text_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_ForeignCharacters");
	}

	public void verify_DisplayLayoutButton() {
		Assert.assertTrue(driver.findElement(DisplayLayout_Button_Home_Screen).isDisplayed());
		System.out.println("Method Executed - verify_DisplayLayoutButton");
	}

	public void clickENButton() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(ENButton_Home_Screen)));
		driver.findElement(ENButton_Home_Screen).click();
		System.out.println("Method Executed - ClickENButton");
	}

	public void clickNoButton_ENPopUp() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(No_Button_ENPopUp)));
		driver.findElement(No_Button_ENPopUp).click();
		System.out.println("Method Executed - ClickNoButton_ENPopUp");
	}

	public void clickChromeLogoButton() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(ChromeLogoButton_Home_Screen)));
		driver.findElement(ChromeLogoButton_Home_Screen).click();
		System.out.println("Method Executed - ClickChromeLogoButton");
	}

	public void clickFileLogoButton() {
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds())
				.until(ExpectedConditions.visibilityOf(driver.findElement(FileLogoButton_Home_Screen)));
		driver.findElement(FileLogoButton_Home_Screen).click();
		System.out.println("Method Executed - ClickFileLogoButton");
	}

	public void clickProgressBarButton() {
		new WebDriverWait(driver, WaitInterval.FiftenSecond.getSeconds())
				.until(ExpectedConditions.presenceOfElementLocated(ProgressBar_button_homePage));
		driver.findElement(ProgressBar_button_homePage).click();
		System.out.println("Method Executed - ClickProgressBarButton");
	}

	public void waitForInvisibility_ProgressBarButton() {
		int maxtime=0;
		while (!CommonUtils.waitForPresence(driver, 15, driver.findElement(ProgressBar_homePage)) && maxtime<=60) {
			maxtime=maxtime+15;
		}
		System.out.println("Method Executed - waitForInvisibility_ProgressBarButton");
	}

	public void clickDisplayToastButton(String ExpectedToasterMessage) {
		driver.findElement(toastmessage_button_homePage).click();
		
		String ActualToasterMessage = driver.findElement(toastmessage).getAttribute("name");
		System.out.println(ActualToasterMessage);
		Assert.assertEquals(ActualToasterMessage, ExpectedToasterMessage);
		System.out.println("Method Executed - clickDisplayToastButton");
	}

	public void clickDisplayPopUpButton() {
		driver.findElement(DisplayPopUp_button_homePage).click();
		System.out.println("Method Executed - clickDisplayPopUpButton");

	}

	public void clickUnhandledExceptionButton() {
		driver.findElement(unhandledException_button_homePage).click();
		System.out.println("Method Executed - clickUnhandledExceptionButton");
	}

	public void entertext_unhandledException(String Name) {
		driver.findElement(unhandledException_Textbox_homePage).sendKeys(Name);
		System.out.println("Method Executed - unhandledExceptionTextBox");
	}
	

}
