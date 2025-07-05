package testLayer;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterUser;

public class mainTest {

	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();
		login.loginFunctionality("Sweety", "Aher");
		
		HomePage home = new HomePage();
		home.homePageLoginFunctionality();
		
		RegisterUser register = new RegisterUser();
		register.clickOnRegisterPage();
	}

}
