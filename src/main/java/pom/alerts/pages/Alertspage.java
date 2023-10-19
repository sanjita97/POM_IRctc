package pom.alerts.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class Alertspage extends GenericWrappers{

	public static String name, error ;

	public Alertspage switchToFrame(String data) {
		
		switchtoframename(data);
		return this;
	}

	public Alertspage clickOnTryItbutton() {
		
		clickByXpathNoSnap(prop.getProperty("Alertspage.TryItbutton.Xpath"));

		return  this;
	}
   public Alertspage getAlertTextandPrintinConsole() {
	   
	   getAlertText();
		return this;
	}
    public Alertspage accpetTheAlert() {

		acceptAlert();
	    return this;
	}  
    public Alertspage sendTheData(String data) {
		
		 alertsendkey(data);
		return this;
		
	}
    public Alertspage dismissTheAlert() {
		
		dismissAlert();
		return this;
	}
    public Alertspage getDataPresentInText() {

	name = getTextByXpath(prop.getProperty("Alertspage.GetTheDataPresentInText.Xpath"));
		
		return this;
		
	}
	
		
	public Alertspage verifyGivenData(String data) {
		
		verifyTextContainsByXpath(prop.getProperty("Alertspage.VerifyTheGivenData.Xpath"),data);
		return this;
	}
     
   public Alertspage getDataIsNotPresentedInText() {

		error = getTextByXpath(prop.getProperty("Alertspage.GetErrorText.Xpath"));
		
		return this;
		
	}
	
	public Alertspage verifyGivenDataIsNotPrinted(String data) {
		
		verifyTextContainsByXpath(prop.getProperty("Alertspage.VerifyErrorText.Xpath"),data);
		return this;
	}

	
	public Homepage refreshCurrentPage() {
		
		refreshpage();
		return new Homepage();
	}
	  public Alertspage switchToFrameOut() {
			
			switchoutofframe();
			return this;		
		}
			
	public Alertspage clickonHomebutton() {
		
		clickByXpath(prop.getProperty("Alertspage.Homebutton.Xpath"));
		return this;
	}
	

	
	
}
