package com.book.tests;

import org.testng.annotations.Test;

import com.book.pages.BasePage;
import com.book.pages.RegisterPage;

public class RegisterTest extends BasePage {
	
	RegisterPage registerpage;
	
	@Test
	public void UserLoginTest() {
		test = extent.createTest("Register Test").info("Register Test Execution Started");
		registerpage = new RegisterPage(driver, test);
		registerpage.clickonloginLink();
		registerpage.clickonRegister();
		registerpage.enterfirstName();
		registerpage.enterlastName();
		registerpage.enteruserName();
		registerpage.enterPassword();
		registerpage.enterconfirmPassword();
		registerpage.selectGender();
		registerpage.clickonregisterButton();
		
		test.info("Register Test Execution Completed Successfully");
	}
}
