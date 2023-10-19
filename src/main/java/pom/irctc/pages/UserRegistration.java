package pom.irctc.pages;

import pom.alerts.pages.Alertspage;
import wrappers.GenericWrappers;

public class UserRegistration extends GenericWrappers{

		
	public UserRegistration enterUserid(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.Userid.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterPassword(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.Password.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.ConfirmPassword.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration selectSecurityQuestion(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistration.SecurityQuestion.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterSecurityAnswer(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.SecurityAnswer.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration clickDateOfBirth() {
		clickByXpath(prop.getProperty("UserRegistration.DateOfBirthClick.Xpath"));

		return this;
		
	}
	
	public UserRegistration selectMonth(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistration.Month.Xpath"), data);
		return this;
		
	}
	
     public UserRegistration selectYear(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistration.Year.Xpath"), data);
		return this;
		
	}
     public UserRegistration clickOnDay(String data) {
 		
    	 clickByXpath(prop.getProperty("UserRegistration.Day.Xpath").replaceAll("data", data));
 		
 		return this;
 		
 	}
	
	public UserRegistration chooseGender(String data) {
		
		clickByXpath(prop.getProperty("UserRegistration.Gender.Xpath").replaceAll("data", data));
		return this;
		
	}
	
	public UserRegistration chooseMaritalStatus(String data) {
		
		clickByXpath(prop.getProperty("UserRegistration.MaritalStatus.Xpath").replaceAll("data", data));
		return this;
		
	}
	
	public UserRegistration enterEmail(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.Email.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration selectOccupation(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistration.Occupation.Xpath"), data);
		return this;
	}
	
	public UserRegistration enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.FirstName.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterMiddleName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.MiddleName.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterLastName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.LastName.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration selectNationality(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistration.Nationality.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterFlatNo(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.FlatNo.Xpath"), data);
		return this;		
		
	}
	
	public UserRegistration enterStreetName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.StreetName.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterAreaOrLocatity(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.AreaOrLocatity.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration selectCountry(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("UserRegistration.Country.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterMobileNo(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.MobileNo.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterPinCode(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.PinCode.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterCity(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.City.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration webPageScrollDown() {
		
		WebPageDown();
		return this;
		
	}
	
	public UserRegistration enterState(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.State.Xpath"), data);
		return this;
	}
	
	public UserRegistration enterPostOffice(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.PostOffice.Xpath"), data);
		waitProperty(3000);

		return this;
	}
	
	public UserRegistration clickOnResidencetoofficeAddressNo() {
		
		clickByXpath(prop.getProperty("UserRegistration.ResidencetoofficeAddressNo.Xpath"));

		//clickByXpath("//div[@style='text-align: left;']/b/label[3]");
		return this;
		
	}
	
	public UserRegistration enterFlatNoOffice(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.FlatNoOffice.Xpath"), data);
		return this;
	}
	
	public UserRegistration enterStreetOfficeNo(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.StreetOfficeNo.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterAreaOfficeNo(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.AreaOfficeNo.Xpath"), data);
		return this;
	}
	
	public UserRegistration enterCountryOffice(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.CountryOffice.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterMobileOfficeNo(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.MobileOfficeNo.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterPinCodeOfficeNo(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.PinCodeOfficeNo.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterCityOffice(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.CityOffice.Xpath"), data);
		return this;
		
	}
	
	public UserRegistration enterStateOffice(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.StateOffice.Xpath"), data);
		return this;
	}
	
	public UserRegistration enterPostOfficeNo(String data) {
		
		enterByXpath(prop.getProperty("UserRegistration.PostOfficeNo.Xpath"), data);
		return this;
		
	}
	

	
	
}
