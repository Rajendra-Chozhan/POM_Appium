package pageFactory;

import org.openqa.selenium.WebElement;

import com.basepackage.BaseClass;


import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageFactory extends BaseClass{
	


@AndroidFindBy(id="com.applications.max:id/maxLogo")
public WebElement AppTitle;

@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Account\"]")
public WebElement Account_Section;

@AndroidFindBy(id="com.applications.max:id/sign_in_sign_up")
public WebElement Sign_In;

@AndroidFindBy(xpath="//android.widget.TextView[@text=\"088383 92831\"]")
public WebElement PhoneNumber;

@AndroidFindBy(id="com.applications.max:id/btnContinue")
public WebElement ContinueButton;

@AndroidFindBy(xpath="//android.widget.Button[@text=\"Allow\"]")
public WebElement AllowButton;


@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Home\"]")
public WebElement HomeButton;
	
	
	
}
