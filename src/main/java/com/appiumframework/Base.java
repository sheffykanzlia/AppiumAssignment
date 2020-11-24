package com.appiumframework;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.service.local.AppiumDriverLocalService;



public class Base {
	PropertyManager testDataHelper = new PropertyManager();
	public static AppiumDriverLocalService service;
	

	public AppiumDriverLocalService startServer(){
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		return service;
	}
	
	
	@BeforeMethod
	public void beforeTest() {
		try {
			DriverManager.getInstance().getDriver(testDataHelper.getValue("RunningPlatformValue"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void afterMethod(){
		DriverManager.driver.quit();
	}

	

}
