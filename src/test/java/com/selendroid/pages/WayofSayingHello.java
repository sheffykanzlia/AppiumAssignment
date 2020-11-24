package com.selendroid.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.appiumframework.DriverManager;
import Miscellaneous.Enum.WaitInterval;
import io.appium.java_client.android.AndroidDriver;;

public class WayofSayingHello {
	AndroidDriver driver;
	
	public WayofSayingHello() {
		driver = DriverManager.driver;
	}
	
	By HelloText_HelloScreen=By.xpath("//android.view.View[@text='This is my way of saying hello']");
	
	By Name_TextView_helloScreen=By.xpath("//android.widget.TextView[@index='3']");
	
	By Car_TextView_helloScreen=By.xpath("//android.widget.TextView[@index='5']");
	
	By link_here_helloScreen=By.xpath("//android.widget.TextView[@text='here']");
	

	
	public void verify_hellotext_helloScreen(){
	new WebDriverWait(driver, WaitInterval.OneMinute.getSeconds()).until(ExpectedConditions.visibilityOf(driver.findElement(HelloText_HelloScreen)));
	Assert.assertTrue(driver.findElement(HelloText_HelloScreen).isDisplayed());
	System.out.println("Method Executed - verify_hellotext_helloScreen");
	}
	
	public void verify_Name_helloScreen(String ExpectedNameText){
		WebElement Name=driver.findElement(Name_TextView_helloScreen);
		String ActualNameText=Name.getText();
		Assert.assertEquals(ActualNameText, ExpectedNameText);
		System.out.println("Method Executed - verify_Name_helloScreen");
		}
	
	public void verify_CarName_helloScreen(String ExpectedCarName){
		WebElement Name=driver.findElement(Car_TextView_helloScreen);
		String ActualCarNameText=Name.getText();
		Assert.assertEquals(ActualCarNameText, ExpectedCarName);
		System.out.println("Method Executed - verify_CarName_helloScreen");
		}
	
	public void click_link_helloScreen(){
		driver.findElement(link_here_helloScreen).click();
		System.out.println("Method Executed - click_link_helloScreen");
		}
	
	
	
	
	

}
