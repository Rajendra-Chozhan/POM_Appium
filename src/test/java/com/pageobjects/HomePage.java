package com.pageobjects;


import java.time.Duration;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClass;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BaseClass{
		
	//constructor
	public HomePage(){
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(5)), this);
	}

	public void isVerifyAppTitle() {		
		
	
	}
	
	
	public void clickAccountionSection() {
	
		Account_Section.click();
	}
	
public void clickSignIn() {
		
	Sign_In.click();
	}
	
public void Select_PhoneNumber() {
	
	PhoneNumber.click();
	}
	
public void Click_ContinueButton() {
	
	ContinueButton.click();
	}
	

public void Click_Allow() {
	
	AllowButton.click();
	}
//	public void enterUsername(String username) {
//		
//		txt_emailField.sendKeys(username);
//	}
public void Click_HomeButton() {
	
	HomeButton.click();
	}
	

 @AndroidFindBy(id="com.applications.max:id/maxLogo")
private WebElement AppTitle;

 @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Account\"]")
private WebElement Account_Section;

 @AndroidFindBy(id="com.applications.max:id/sign_in_sign_up")
private WebElement Sign_In;

 @AndroidFindBy(xpath="//android.widget.TextView[@text=\"088383 92831\"]")
private WebElement PhoneNumber;

 @AndroidFindBy(id="com.applications.max:id/btnContinue")
private WebElement ContinueButton;

 @AndroidFindBy(xpath="//android.widget.Button[@text=\"Allow\"]")
private WebElement AllowButton;


 @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Home\"]")
private WebElement HomeButton;
}
