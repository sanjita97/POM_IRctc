package pom.facebook.pages;

import wrappers.GenericWrappers;

public class Signuppage extends GenericWrappers {
	

	public Signuppage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("Signuppage.FirstName.Xpath"), data);
		return this;
	}
	
	public Signuppage enterSurName(String data) {
		
		enterByXpath(prop.getProperty("Signuppage.SurName.Xpath"), data);
		return this;
	}
	
	public Signuppage enterEmailAddress(String data) {
		
		enterByXpath(prop.getProperty("Signuppage.EmailAddress.Xpath"), data);
		return this;
	}
	
	public Signuppage enterConfirmEmailAddress(String data) {
		
		enterByXpath(prop.getProperty("Signuppage.ConfirmEmailAddress.Xpath"), data);
	    return this;	
	}
	
	public Signuppage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("Signuppage.Password.Xpath"), data);
		return this;
	}
	
	public Signuppage selectDay(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("Signuppage.Day.Xpath"), data);
		return this;
		
	}
	
   public Signuppage selectMonth(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("Signuppage.Month.Xpath"), data);
		return this;
		
	}
   
   public Signuppage selectYear(String data) {
	
	selectVisibileTextByXpath(prop.getProperty("Signuppage.Year.Xpath"), data);
	return this;
	
    }

	public Signuppage clickOnGender(String data) {
		clickByXpath(prop.getProperty("Signuppage.Gender.Xpath").replaceAll("data", data));
		return this;
		
	}
	
}
