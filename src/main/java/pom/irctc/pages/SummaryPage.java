package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SummaryPage extends GenericWrappers {

	
   public SummaryPage clickOnIAgree() {
		
		clickByXpath(prop.getProperty("SummaryPage.IAgree.Xpath"));
		return this;		
	}
	
	public OTPPage clickonMakePayment() {
		
		clickByXpath(prop.getProperty("SummaryPage.MakePayment.Xpath"));
		return new OTPPage();		
	}
	

	
	
	
	
}
