package com.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	public static AppiumDriver driver;
	public static String launchApp;
	public static Properties prop;
	
	
	  


	public void loadConfigFile() throws IOException {
		
		 prop = new Properties();

		 FileInputStream ip = new FileInputStream(("E:\\Configuration\\Config.properties"));

		 prop.load(ip);
		
	}
	
	
	public void appiumServer() {
	
	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(60)).build();		
	service.start();	}
	
	
	public void launchApp() throws IOException, InterruptedException {
	loadConfigFile();
		if(prop.getProperty("LaunchApp").equals("android")){
			
			androidAppCapabilities();
		}else if(prop.getProperty("LaunchApp").equals("ios")) {
			
			iOSAppCapabilities();
		}
		
	}
	
	
	public void androidAppCapabilities() throws MalformedURLException, InterruptedException {
		appiumServer();
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setUdid("fbeeb7ea")
				.setPlatformVersion("11")
				.setDeviceName("vivo 1951")
			    .setApp("E:\\Appium Notes\\APKs\\max.apk")
			    .setNoReset(false);
	//	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 Thread.sleep(3000);
		 }
	
	public void iOSAppCapabilities() throws MalformedURLException {
		//appiumServer();
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("vivo 1951");
		options.setApp(prop.getProperty("appUrl"));
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
	}
	
	
	
	public void webDriverWait(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	@BeforeTest
	public void startupprocess() throws IOException, InterruptedException {
		
	launchApp();
		System.out.println("sdafds");
		
	}
	
	@AfterTest

	public void tearDown() {
		 if(driver != null){
			 driver.quit();
		 }}
	}