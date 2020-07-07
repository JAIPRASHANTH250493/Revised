package TestCases;

import org.testng.annotations.Test;

import TestBase.Parent_class;
import WebElements.Login_page;

public class Login_TestCase extends  Parent_class{
	
	Login_page login;
	
	@Test(priority = 1)
	public void enteringUsername() {
		login=new Login_page();
		initialization();
		login.usernameMehtod("Jaiprashanth");
		
	}
	
	@Test(priority = 2)
	public void enteringPassword() {
		
		login.passwordMethods("J@i250493");
		login.Signin();
		
	}

}
