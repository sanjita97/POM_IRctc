package pom.indianfrro.user.reg.pages;

import wrappers.GenericWrappers;

public class MenuUserRegistrationPages extends GenericWrappers{
	
	public AccomodationRegPages clickOnSingUpReg() {
		
		clickByXpath(prop.getProperty("MenuUserRegistrationPages.SingUpReg.Xpath"));
		return new AccomodationRegPages();
		
	}
	

}
