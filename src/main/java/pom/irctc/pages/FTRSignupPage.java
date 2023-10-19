package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRSignupPage extends GenericWrappers{

	public FTRSignupPage switchToNextWindow() {
		
		switchToLastWindow();
		return this;
		
	}
public UserRegistration clickOnNewUserSignUp() {
		
		clickByXpath(prop.getProperty("FTRSignupPage.NewUserSignUp.Xpath"));
		return new UserRegistration();

	}



}
