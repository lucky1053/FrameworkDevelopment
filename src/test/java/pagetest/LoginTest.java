package pagetest;

import org.testng.annotations.Test;

import pageflow.LoginFlow;
import pages.LoginPage;

public class LoginTest {
	
	@Test
	public void validateInvalidCredentials(){
		
		launchURL();
		LoginFlow.performLogin();
		login.validateError();
		
		
	}

}
