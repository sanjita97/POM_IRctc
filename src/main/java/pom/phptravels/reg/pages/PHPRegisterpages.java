package pom.phptravels.reg.pages;

import com.mongodb.connection.Stream;

import pom.alerts.pages.Alertspage;
import wrappers.GenericWrappers;

public class PHPRegisterpages extends GenericWrappers{
	
	public PHPRegisterpages enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.FirstName.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterLastName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.LastName.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterEmailID(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.EmailID.Xpath"), data);
	    return this;
	}
	
	public PHPRegisterpages enterPhoneNumber(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.PhoneNumber.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterCompanyName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.CompanyName.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterStreetAddress1(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.StreetAddress.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterAddress2(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.enterAddress.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterCityName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.CityName.Xpath"), data);
	    return this;
	}
	
	public PHPRegisterpages enterStateName(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.StateName.Xpath"), data);
		return this;		
	}
	
	public PHPRegisterpages enterPostCode(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.PostCode.Xpath"), data);
        return this;	
	}
	
	public PHPRegisterpages selectCountry(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("PHPRegisterpages.Country.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterMobileNo(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.MobileNo.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterPassword(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.Password.Xpath"), data);
		return this;
	}
	
	public PHPRegisterpages enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("PHPRegisterpages.ConfirmPassword.Xpath"), data);
		return this;
	}
	


}
