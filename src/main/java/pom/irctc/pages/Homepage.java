package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers{
	
	public RegistrationPage clickonRegister() {
		
		clickByXpath(prop.getProperty("Homepage.Register.Xpath"));
		return new RegistrationPage();
		
	}
	
	public Homepage mouseoveronHoliday() {
		
		mouseoverbyxpath(prop.getProperty("Homepage.Holiday.Xpath"));	
		return this;		
		
	}

	public Homepage mouseoveronSlays() {
		
		mouseoverbyxpath(prop.getProperty("Homepage.Slays.Xpath"));
		return this;
		
	}
	
	public Accomodationpage clickonLounge() {
		
		clickByXpath(prop.getProperty("Homepage.Lounge.Xpath"));
		return new Accomodationpage();
	}
	
	
	
	
	
	
	
	
	
}
