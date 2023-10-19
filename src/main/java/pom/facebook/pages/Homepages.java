package pom.facebook.pages;

import wrappers.GenericWrappers;

public class Homepages extends GenericWrappers {

	public Signuppage clickOnCreateNewAccount() {
		
		clickByXpath(prop.getProperty("Homepages.CreateNewAccount.Xpath"));
		return new Signuppage();
	}
	
}
