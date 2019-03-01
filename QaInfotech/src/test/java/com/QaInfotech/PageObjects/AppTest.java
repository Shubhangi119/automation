package com.QaInfotech.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest{

	public static WebDriver driver;
	public static String driverpath="ChromeDriver/chromedriver";
	
	
	
	static public void setup() {
		System.setProperty("webdriver.chrome.driver",driverpath);
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	static public void quitBrowser() {
		driver.quit();
	}
	

}