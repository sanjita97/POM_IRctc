package pom.irctc.pages;

import pom.alerts.pages.Alertspage;
import wrappers.GenericWrappers;

public class Charterpage extends GenericWrappers {

	
	public Charterpage clickOnEnquiryForm() {
		
		clickByXpath(prop.getProperty("Charterpage.EnquiryForm.Xpath"));
		return this;
		
	}
	
	public Charterpage enterNameofApplicant(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.NameofApplicant.Xpath"), data);
		return this;
		
	}
	public Charterpage enterNameofOrganisation(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.NameofOrganisation.Xpath"), data);
		return this;
	}
	public Charterpage enterAddress(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.Address.Xpath"), data);
		return this;
		
	}
	public Charterpage enterMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.MobileNumber.Xpath"), data);
		return this;
		
	}
	public Charterpage enterEmailId(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.EmailId.Xpath"), data);
		return this;
		
	}
	public Charterpage selectRequestFor(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("Charterpage.RequestFor.Xpath"), data);
		return this;
		
	}
	public Charterpage enterOriginatingStation(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.OriginatingStation.Xpath"), data);
		return this;
	}
	public Charterpage enterDestinationStation(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.DestinationStation.Xpath"), data);
		return this;
		
	}
    public Charterpage clickCheckInDate() {
    	
		clickByXpath(prop.getProperty("Charterpage.CheckInDateClick.Xpath"));
		return this;

		
	}
	
    public Charterpage clickOnDateOfDeparture(String data) {
		
		clickByXpath(prop.getProperty("Charterpage.DateOfDeparture.Xpath").replaceAll("data", data));

		return this;
		
	}

    public Charterpage clickCheckOutDate() {
    	
		clickByXpath(prop.getProperty("Charterpage.CheckIOutDateClick.Xpath"));
		return this;
	
	}
	public Charterpage clickOnDateOfArrival(String data) {
		
		clickByXpath(prop.getProperty("Charterpage.DateOfArrival.Xpath").replaceAll("data", data));
		return this;
		}
	
	public Charterpage enterDurationOfTour(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.DurationOfTour.Xpath"), data);
		return this;
		
	}
	public Charterpage enterNumberAndTypeOfCoaches(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.NumberAndTypeOfCoaches.Xpath"), data);
		return this;
		
	}
	public Charterpage enterNoOfPassengers(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.NoOfPassengers.Xpath"), data);
		return this;
		
	}
	public Charterpage enterPurposeOfCharter(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.PurposeOfCharter.Xpath"), data);
		return this;
		
	}
	public Charterpage enterAdditionalServicesRequired(String data) {
		
		enterByXpath(prop.getProperty("Charterpage.AdditionalServicesRequired.Xpath"), data);
		return this;
		
	}
	public Charterpage clickonSubmitButton() {
		
		clickByXpath(prop.getProperty("Charterpage.SubmitButton.Xpath"));
		return this;
		
	}
	public Charterpage verifyGivenMobileNo(String data) {
		
		verifyTextContainsByXpath(prop.getProperty("Charterpage.VerifyGivenMobileNo.Xpath"), data);
		return this;
		
	}

	public Charterpage clickonDismissMenuIcon() {
		
		clickByXpath(prop.getProperty("Charterpage.DismissMenuIcon.Xpath"));
		return this;
	}
	

	
}
