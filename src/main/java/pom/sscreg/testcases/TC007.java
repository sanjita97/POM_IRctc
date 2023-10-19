package pom.sscreg.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.sscreg.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify new user registration for staff selection commission(ssc) application.";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://ssc.nic.in/registration/home";
		
	}
	@Test

     public void sscregistration() {
	
	           new Homepage()
	           .clickonAdharYesButton()
	           .enterAdharNo("123456789000")
	           .enterConfirmAdharNo("123456789000")
	           .enterName("sanjita")
	           .enterVerifyName("sanjita")
	           .enterFatherName("saravanan")
	           .enterVerifyFatherName("saravanan")
	           .enterMotherName("amutha")
	           .enterVerifyMotherName("amutha")
	           .enterDateOfBirth("08/03/1997")
	           .enterVerifyDateOfBirth("08/03/1997")
	           .selectEducationBoard("Tamil Nadu Board of Secondary Education")
	           .selectVerifyEducationBoard("Tamil Nadu Board of Secondary Education")
	           .enterRoLlNo("123456789")
	           .enterVerifyRollNo("123456789")
	           .selectYearOfPassing("2013")
	           .selectVerifyYearOfPassing("2013")
	           .clickonGender("Female")
	           .clickonVerifyGender("Female")
	           .selectEducationalQualification("Graduation")
	           .enterMobileNo("9445632178")
	           .enterVerifyMobileNo("9445632178")
	           .enterEmailId("sanjitasilpa1997@gmail.com")
	           .enterVerifyEmailId("sanjitasilpa1997@gmail.com")
	           .selectState("Tamil Nadu");
	           
     
     }
	
	
}
