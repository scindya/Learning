package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.Loginpage;

public class LoginTest extends ProjectSpecificMethods{
	
	
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uname, String pword) {
		
		new Loginpage(driver).enterUsername(uname).enterpassword(pword).clickLoginbutton();
	}

}
