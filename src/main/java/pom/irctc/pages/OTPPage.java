package pom.irctc.pages;

import pom.alerts.pages.Alertspage;
import wrappers.GenericWrappers;

public class OTPPage extends GenericWrappers{
	   
public OTPPage clickonVerifyButton() {
		
		clickByXpath("//button[text()='Verify']");
        return new OTPPage();		
	}
	public OTPPage VerifyOTPErrorMsg(String data) {
		
		verifyTextContainsByXpath("//span[text()='otp is required.']", data);
		return this;		
	}

      

}
