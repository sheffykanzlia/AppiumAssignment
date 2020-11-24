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

public class ChromePage {
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;

	public ChromePage() {
		driver = DriverManager.driver;
	}

	By Title_ChromeScreen=By.id("android:id/title");

	By Hello_Text_ChromeScreen=By.xpath("//android.widget.TextView[@text='Hello, can you please tell me your name?']");

	//By Name_TextField_ChromeScreen=By.xpath("//android.widget.EditText[@text='Enter your name here!']");

	By Name_TextField_ChromeScreen=By.xpath("//android.widget.EditText[@index='2']");

	By Car_DropDown_ChromeScreen=By.xpath("//android.widget.Spinner[@index='2']");

	By Car_Options=By.id("android:id/text1");

	By Sendname_button_ChromeScreen=By.xpath("//android.widget.Button[@text='Send me your name!']");


	public void verify_ChromePage_title(){
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds()).until(ExpectedConditions.presenceOfElementLocated(Title_ChromeScreen));
		Assert.assertTrue(driver.findElement(Title_ChromeScreen).isDisplayed());
		System.out.println("Method Executed - verify_ChromePage_title");
	}

	public void verify_Hello_Text(){
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds()).until(ExpectedConditions.presenceOfElementLocated(Hello_Text_ChromeScreen));
		Assert.assertTrue(driver.findElement(Hello_Text_ChromeScreen).isDisplayed());
		System.out.println("Method Executed - verify_Hello_Text");
	}

	public void enterName_TextField(String Name) throws InterruptedException {
		driver.findElement(Name_TextField_ChromeScreen).clear();
		driver.findElement(Name_TextField_ChromeScreen).sendKeys(Name);
		System.out.println("Method Executed - EnterName_TextField");
	}

	public void selectPreferredCarOption(String CarOption){
		driver.findElement(Car_DropDown_ChromeScreen).click();
		List<WebElement> Caroptions = driver.findElements(Car_Options);
		System.out.println("Total number of options available in List " + Caroptions.size());
		for (WebElement e : Caroptions) {
			CommonUtils.waitForPresence(driver, 15, e);
			String value = e.getText();
			if (value.equalsIgnoreCase(CarOption)) {
				e.click();
				break;
			}
		}
		System.out.println("Method Executed - selectPreferredCarOption");

	}

	public void verify_selectedCarOption(String ExpectedCarName){
		String ActualCaroption = driver.findElement(Car_DropDown_ChromeScreen).getText();
		Assert.assertEquals(ActualCaroption, ExpectedCarName);
		System.out.println("Method Executed - verify_selectedCarOption");
	}

	public void clickSendNameButton(){
		new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds()).until(ExpectedConditions.visibilityOf(driver.findElement(Sendname_button_ChromeScreen)));
		driver.findElement(Sendname_button_ChromeScreen).click();		

		System.out.println("Method Executed - clickSendNameButton");
	}

}
