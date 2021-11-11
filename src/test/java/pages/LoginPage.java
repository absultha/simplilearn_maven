package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.Baseclass;


public class LoginPage {
	WebDriver driver=Baseclass.driver;
	ExtentTest test= Baseclass.test;
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	@FindBy(name="user_login")
	WebElement UserName;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(className="rememberMe")
	WebElement RememberMe;
	@FindBy(name="btn_login")
	WebElement LoginButton;
	@FindBy(id="msg_box")
	WebElement Error;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void Login(String UName,String pwd) {
		
		  WebDriverWait wait=new  WebDriverWait(driver,30);
	      wait.until(ExpectedConditions.visibilityOf(LoginLink));
		  LoginLink.click();
		  test.log(LogStatus.PASS,"Click on Login Link","Sucssesfully Clicked the link");
          UserName.sendKeys(UName);
          test.log(LogStatus.PASS,"Enter Username"+UName,"Sucssesfully Entered the Name");
          Password.sendKeys(pwd);
          test.log(LogStatus.PASS,"Enter Password"+pwd,"Sucssesfully Clicked the Password");
          RememberMe.click();
	      LoginButton.click();
	      test.log(LogStatus.PASS,"Click Login Button","Sucssesfully Clicked the button");
		}
public void ErrorCheck() {
	
    String ActualMsg =Error.getText();
    String ExpMsg ="The email or password you have entered is invalid.";
    //Assert.assertEquals(ActualMsg,ExpMsg);
    SoftAssert soft=new SoftAssert();
    soft.assertEquals(ActualMsg,ExpMsg);
    soft.assertAll();
}
}
