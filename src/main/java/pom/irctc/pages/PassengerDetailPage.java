package pom.irctc.pages;

import pom.alerts.pages.Alertspage;
import wrappers.GenericWrappers;

public class PassengerDetailPage extends GenericWrappers {
	
	 public PassengerDetailPage verifyHotelName(String data) {

			verifyTextContainsByXpath(prop.getProperty("PassengerDetailPage.HotelName.Xpath"), data);
			return this;
			
		}
		public PassengerDetailPage verifyPrice(String data) {

			verifyTextContainsByXpath(prop.getProperty("PassengerDetailPage.Price.Xpath"), data);
			return this;
			
		}

	public PassengerDetailPage selectTitle(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailPage.Title.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("PassengerDetailPage.FirstName.Xpath"), data);
		return this;		
	}
	
	public PassengerDetailPage enterLastname(String data) {
		
		enterByXpath(prop.getProperty("PassengerDetailPage.LastName.Xpath"), data);
		return this;		
	}
	
	public PassengerDetailPage selectCountry(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailPage.Country.Xpath"), data);
		return this;		
	}

	public PassengerDetailPage selectState(String data) {

		selectVisibileTextByXpath(prop.getProperty("PassengerDetailPage.State.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage selectGSTYesOrNo(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailPage.GSTYesOrNo.Xpath"), data);
		return this;		
	}
	
			
	public SummaryPage clickonGo() {
		
		clickByXpath(prop.getProperty("PassengerDetailPage.Go.Xpath"));
		return new SummaryPage();		
	}
	
    public PassengerDetailPage clickonContinue() {
		
		clickByXpath(prop.getProperty("PassengerDetailPage.Continue.Xpath"));
		return this;		
	}
	
	public PassengerDetailPage enterGstNo(String data) {
	
		enterByXpath(prop.getProperty("PassengerDetailPage.GstNumber.Xpath"), data);
		return this;
	}
		
	public PassengerDetailPage enterCompanyName(String data) {
		
		enterByXpath(prop.getProperty("PassengerDetailPage.CompanyName.Xpath"), data);
		return this;
	}

   public PassengerDetailPage enterCompanyAddress(String data) {
		
		enterByXpath(prop.getProperty("PassengerDetailPage.CompanyAddress.Xpath"), data);
		return this;
	}

   public PassengerDetailPage verifyERROPleaseEnterValidGSTNumber(String data) {
	
	   verifyTextContainsByXpath(prop.getProperty("PassengerDetailPage.ErrorGSTNumber.Xpath"), data);
	   return this;
	   
    }
	
  	
	
	
	
	
	
	
	
	}