package com.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.basepackage.BaseClass;
import com.pageobjects.HomePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;





public class Test_001_LoginFunctionality  extends BaseClass{

	

	

	@Test
	public void user_successfully_launches_app() throws IOException, InterruptedException {
	 


		Thread.sleep(4000);
	    System.out.println("Application is launched successfully");
	    Thread.sleep(4000);
	    HomePage hp;
	    hp = new HomePage();
	    hp.isVerifyAppTitle();
		System.out.println("App Title is verified");
		Thread.sleep(4000);
		hp.clickAccountionSection();
		System.out.println("Clicked Account Button");
		Thread.sleep(4000);
		hp.clickSignIn();
		System.out.println("Sign in Clicked");
		hp.Select_PhoneNumber();
		Thread.sleep(4000);
		System.out.println("Login done"); 
		hp.Click_ContinueButton();
		Thread.sleep(4000);
		System.out.println("Login done");   
		hp.Click_Allow();
		Thread.sleep(4000);
		System.out.println("Allow Popup clicked done");
		hp.Click_HomeButton(); 
		Thread.sleep(4000);
		System.out.println("Home Page Displayed");  
	}


	

	


	



	

	




	
}
