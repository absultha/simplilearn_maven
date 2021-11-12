package test;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.LoginPage;
public class LoginTest extends Baseclass{
	

@Parameters({"UserName","Password"})
        @Test
	     public void NegativeLogin(String UserNameVal,String PasswordVal) {
	     
	test=report.startTest("Negative Login Test");
	LoginPage login= new LoginPage();
	
         login.Login(UserNameVal,PasswordVal);
		login.ErrorCheck();
		report.endTest(test);
		Assert.assertTrue(false);
      
       
       }

@Parameters({"UserName","CorrectPassword"})
@Test
 public void PositiveLogin(String UserNameVal,String PasswordVal)
     {
test=report.startTest("positive Login Test");

	LoginPage login=new LoginPage();
     login.Login(UserNameVal,PasswordVal);
     report.endTest(test);

     }


}



