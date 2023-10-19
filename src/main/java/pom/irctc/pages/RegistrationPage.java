package pom.irctc.pages;

import freemarker.core.ReturnInstruction.Return;
import pom.alerts.pages.Alertspage;
import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage entertheUserName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.UserName.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage enterthePassword(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Password.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage enterConfirmPassword(String data) {
  
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.Xpath"), data);
		return this;
	
	}
	
	public RegistrationPage selectPreferredLanguage(String data) {
		  
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguageclick.Xpath"));
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguage.Xpath").replaceAll("data", data));
		return this;
	
	}
	
	
	public RegistrationPage selectSecurityQuestion(String data) {

		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestionclick.Xpath"));

		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.Xpath").replaceAll("data", data));
		return this;
		
	}
	
	public RegistrationPage enterSecurityAnswer(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage clickonContinue() {

		clickByXpath(prop.getProperty("RegistrationPage.Continue.Xpath"));
		return this;
		
	}
	
	public RegistrationPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage enterMiddleName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.Xpath"), data);
		return this;
		
	}

	public RegistrationPage enterlastName(String data) {
	
		enterByXpath(prop.getProperty("RegistrationPage.lastName.Xpath"), data);
	    return this;
	
    }

	public RegistrationPage selectOccupation(String data) {
		
		clickByXpath(prop.getProperty("RegistrationPage.Occupationclick.Xpath"));
		clickByXpath(prop.getProperty("RegistrationPage.Occupation.Xpath").replaceAll("data", data));
		return this;		
	}

	public RegistrationPage selectMartialStatus(String data) {
		
		clickByXpath(prop.getProperty("RegistrationPage.MartialStatus.Xpath").replaceAll("data", data));
		return this;
		
	}

	public RegistrationPage chooseGender(String data) {
	
		clickByXpath(prop.getProperty("RegistrationPage.Gender.Xpath").replaceAll("data", data));
		return this;
	}

	public RegistrationPage enterMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.MobileNumber.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage clickXpathofDateofBirth() {
		clickByXpath(prop.getProperty("RegistrationPage.DateofBirthClick.Xpath"));
        return this;
	}
	public RegistrationPage selectMonth(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Month.Xpath"), data);
		return this;
	}
	
    public RegistrationPage selectYear(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Year.Xpath"), data);
		return this;
	}
   public RegistrationPage clickonDay(String data) {
		
		clickByXpath(prop.getProperty("RegistrationPage.Day.Xpath").replaceAll("data", data));
		return this;
	}


	public RegistrationPage selectCountry(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Country.Xpath"),data);
		return this;
			
	}

	public RegistrationPage enterEmailId(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.EmailId.Xpath"), data);
		return this;
		
	}
	public RegistrationPage selectNationality(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Nationality.Xpath"), data);
		return this;
		
	}

	public RegistrationPage enterBlockNo(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.BlockNo.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage enterStreetname(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Streetname.Xpath"), data);
		return this;
		
	}

	public RegistrationPage enterAreaName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.AreaName.Xpath"), data);
		return this;
		
	}

	public RegistrationPage enterPincode(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Pincode.Xpath"), data);
		return this;
		
	}

	public RegistrationPage enterStatename(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Statename.Xpath"), data);
		return this;
	}

	public RegistrationPage selectCity(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.City.Xpath"), data);
		return this;
	}

	public RegistrationPage selectPostOffice(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.PostOffice.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage enterPhoneNo(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.PhoneNo.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage clickOnResidenceOfficeAddressasNo() {
		
        clickByXpath(prop.getProperty("RegistrationPage.ResidenceOfficeAddressasNo.Xpath"));
        return this;
	}

	public RegistrationPage enterFlatNo(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.FlatNo.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage enterLanename(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Lanename.Xpath"), data);
		return this;
		
	}

	public RegistrationPage enterLocalityName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.LocalityName.Xpath"), data);
		return this;
		
	}
	
	public RegistrationPage selectOfficeCountry(String data) {
		
		clickByXpath(prop.getProperty("RegistrationPage.OfficeCountryClick.Xpath"));
		clickByXpath(prop.getProperty("RegistrationPage.OfficeCountry.Xpath").replaceAll("data", data));
		return this;
		
	}

	public RegistrationPage enterOfficePincode(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficePincode.Xpath"), data);
		return this;
		
	}

	public RegistrationPage enterOfficeStatename(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeStatename.Xpath"), data);
		return this;
	}

	public RegistrationPage enterOfficeCity(String data) {
		
	//	selectVisibileTextByXpath("//select[@formcontrolname='offCity']", data);
		enterByXpath(prop.getProperty("RegistrationPage.OfficeCity.Xpath"), data);
		return this;
	}

	public RegistrationPage enterOfficePostOffice(String data) {
		
		//selectVisibileTextByXpath("//select[@formcontrolname='offPostOff']", data);
		enterByXpath(prop.getProperty("RegistrationPage.OfficePostOffice.Xpath"), data);

		return this;
		
	}
	
	public RegistrationPage enterOfficePhoneNo(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficePhoneNo.Xpath"), data);
		return this;
		
	}

	public RegistrationPage clickonTermsandCondition() {
		
		clickByXpath(prop.getProperty("RegistrationPage.TermsandCondition.Xpath"));
		return this;
		
	}



}
