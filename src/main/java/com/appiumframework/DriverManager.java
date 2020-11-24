package com.appiumframework;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverManager {

	public static AndroidDriver<AndroidElement> driver = null;

	private static DriverManager instance;

	private DriverManager() {

	}

	public static DriverManager getInstance() {
		if (instance == null) {
			instance = new DriverManager();
		}
		return instance;
	}


	public static void getDriver(String platform) throws IOException {
		PropertyManager testDataHelper = new PropertyManager();
		DesiredCapabilities caps= new DesiredCapabilities();
		if(platform.equalsIgnoreCase("Emulator")){
			caps.setCapability(CapabilityType.PLATFORM_NAME, testDataHelper.getValue("Emulator_PlatformName"));
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, testDataHelper.getValue("Emulator_Platform_version"));
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, testDataHelper.getValue("Emulator_Device_Name"));
			caps.setCapability(MobileCapabilityType.UDID, testDataHelper.getValue("Emulator_UDID"));
			
		}
		else{
			if(platform.equalsIgnoreCase("RealDevice"))
			{
				caps.setCapability(CapabilityType.PLATFORM_NAME, testDataHelper.getValue("RealDevice_PlatformName"));
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, testDataHelper.getValue("RealDevice_Platform_version"));
				caps.setCapability(MobileCapabilityType.DEVICE_NAME,testDataHelper.getValue("RealDevice_Device_Name"));
				caps.setCapability(MobileCapabilityType.UDID, testDataHelper.getValue("RealDevice_UDID"));	
			}
		}
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,testDataHelper.getValue("Command_TimeOut"));
		caps.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+testDataHelper.getValue("appLocation")); // This is for native application
		caps.setCapability("unicodeKeyboard", true);
		caps.setCapability("resetKeyboard", true);
		caps.setCapability("autoAcceptAlerts", true);
		caps.setCapability("autoDismissAlerts", true);
		caps.setCapability("autoGrantPermissions", true);

		caps.setCapability("appPackage", testDataHelper.getValue("appPackage"));
		caps.setCapability("appActivity", testDataHelper.getValue("appActivity"));

		URL url = new URL(testDataHelper.getValue("LocalHostURL"));

		driver = new AndroidDriver<AndroidElement>(url,caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}

}