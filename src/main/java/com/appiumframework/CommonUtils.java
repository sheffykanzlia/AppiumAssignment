package com.appiumframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CommonUtils {
	public static boolean waitForPresence(AndroidDriver driver, int timeLimitInSeconds, WebElement targetResourceId) {

		try {
			MobileElement mobileElement = (MobileElement) targetResourceId;
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			return mobileElement.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
