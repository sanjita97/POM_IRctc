package pom.sscreg.pages;

import pom.alerts.pages.Alertspage;
import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers{
	
	public Homepage clickonAdharYesButton() {
		
		clickByXpath(prop.getProperty("Homepage.AdharYesButton.Xpath"));
		return this;
	}

	public Homepage enterAdharNo(String data) {
		
		enterByXpath(prop.getProperty("Homepage.AdharNo.Xpath"), data);
        return this;
	}
	
	public Homepage enterConfirmAdharNo(String data) {
		
		enterByXpath(prop.getProperty("Homepage.ConfirmAdharNo.Xpath"), data);
		return this;
	}
	
	public Homepage selectTypeOfID(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("Homepage.TypeOfID.Xpath"), data);
		return this;
	}
	
	public Homepage enterIDNumber(String data) {
		
		enterByXpath("//input[@id='IDnumber']", data);
		return this;
	}
	
	public Homepage enterName(String data) {
		
		enterByXpath(prop.getProperty("Homepage.Name.Xpath"), data);
		return this;		
	}
	
	public Homepage enterVerifyName(String data) {
		
		enterByXpath(prop.getProperty("Homepage.VerifyName.Xpath"), data);
		return this;
		
	}
	
	public Homepage clickNameChangeButtonYes() {
		
		clickByXpath("//input[@name='HaveEverChangedName']");
		return this;
	}
	
	public Homepage enterChangeName(String data) {
		
		enterByXpath("//input[@name='NewName']", data);
		return this;
	}
	
	public Homepage enterFatherName(String data) {
		
		enterByXpath(prop.getProperty("Homepage.FatherName.Xpath"), data);
		return this;
	}
	
	public Homepage enterVerifyFatherName(String data) {

		enterByXpath(prop.getProperty("Homepage.VerifyFatherName.Xpath"), data);
	    return this;
	}
	
	public Homepage enterMotherName(String data) {
		
		enterByXpath(prop.getProperty("Homepage.MotherName.Xpath"), data);
		return this;
	}
	
	public Homepage enterVerifyMotherName(String data) {
		
		enterByXpath(prop.getProperty("Homepage.VerifyMotherName.Xpath"), data);
		return this;
	}
	
	public Homepage enterDateOfBirth(String data) {
		
		enterByXpath(prop.getProperty("Homepage.DateOfBirth.Xpath"), data);
		return this;
	}
	
    public Homepage enterVerifyDateOfBirth(String data) {
		
		enterByXpath(prop.getProperty("Homepage.VerifyDateOfBirth.Xpath"), data);
		return this;
	}
	
	public Homepage selectEducationBoard(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("Homepage.EducationBoard.Xpath"), data);
		return this;
	}
	
	public Homepage selectVerifyEducationBoard(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("Homepage.VerifyEducationBoard.Xpath"), data);
		return this;		
	}
	
	public Homepage enterRoLlNo(String data) {
		
		enterByXpath(prop.getProperty("Homepage.RoLlNo.Xpath"), data);
		return this;
	}
	
	public Homepage enterVerifyRollNo(String data) {
		
		enterByXpath(prop.getProperty("Homepage.VerifyRollNo.Xpath"), data);
		return this;		
	}
	
	public Homepage selectYearOfPassing(String data) {
		
		enterByXpath(prop.getProperty("Homepage.YearOfPassing.Xpath"), data);
		return this;
	}
	
	public Homepage selectVerifyYearOfPassing(String data) {
		
		enterByXpath(prop.getProperty("Homepage.VerifyYearOfPassing.Xpath"), data);
		return this;
	}
	
	public Homepage clickonGender(String data) {
		
		clickByXpath(prop.getProperty("Homepage.Gender.Xpath").replaceAll("data", data));
		return this;
		
	}
	public Homepage clickonVerifyGender(String data) {
		
		clickByXpath(prop.getProperty("Homepage.VerifyGender.Xpath").replaceAll("data", data));
		return this;
	}
	
	public Homepage selectEducationalQualification(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("Homepage.EducationalQualification.Xpath"), data);
		return this;
	}
	
	public Homepage enterMobileNo(String data) {
		
		enterByXpath(prop.getProperty("Homepage.MobileNo.Xpath"), data);
		return this;
	}
	
    public Homepage enterVerifyMobileNo(String data) {
		
		enterByXpath(prop.getProperty("Homepage.VerifyMobileNo.Xpath"), data);
		return this;
	}
	
    public Homepage enterEmailId(String data) {
		
    	enterByXpath(prop.getProperty("Homepage.EmailId.Xpath"), data);
    	return this;
	}
	
    public Homepage enterVerifyEmailId(String data) {
		
    	enterByXpath(prop.getProperty(""), data);
    	return this;
	}
	
	public Homepage selectState(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("Homepage.State.Xpath"), data);
        return this;	
	}
	

	
}
