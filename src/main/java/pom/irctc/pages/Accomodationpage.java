package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Accomodationpage extends GenericWrappers{
	
	
	public Accomodationpage switchToNextWindow() {
		
		switchToLastWindow();
		return this;
		
	}
	public Accomodationpage clickonMenuIcon() {
		
		clickByXpath(prop.getProperty("Accomodationpage.MenuIcon.Xpath"));
		return this;
		
	}
	
	public FTRSignupPage clickonBookYourCoachorTrain() {
		
		clickByXpath(prop.getProperty("Accomodationpage.BookYourCoachorTrain.Xpath"));
		return new FTRSignupPage();
		
	}
	
	public Charterpage clickOnCharter() {
		
		clickByXpath(prop.getProperty("Accomodationpage.Charter.Xpath"));
		return new Charterpage();
		
	}

	public HotelPage clickOnIrctcHoletsIcon() {
		
		clickByXpath(prop.getProperty("Accomodationpage.IrctcHoletsIcon.Xpath"));
		return new HotelPage();
		
	}
	
	
	
	
	
	
	
	

}
