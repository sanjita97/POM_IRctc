package pom.indianfrro.user.reg.pages;

import pom.alerts.pages.Alertspage;
import wrappers.GenericWrappers;

public class AccomodationRegPages extends GenericWrappers  {
	
	public AccomodationRegPages enterUserID(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.UserID.Xpath"), data);
		return this;
		
	}

    public AccomodationRegPages enterPassword(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.Password.Xpath"), data);
		return this;
		
	}

    public AccomodationRegPages enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.ConfirmPassword.Xpath"), data);
		return this;
		
	}
	
    public AccomodationRegPages selectQuestion(String data) {
	
       selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.Question.Xpath"), data);
	   return this;
	}
    
    public AccomodationRegPages enterYourAnswer(String data) {
    	
    	enterByXpath(prop.getProperty("AccomodationRegPages.YourAnswer.Xpath"), data);
    	return this;
		
	}

	public AccomodationRegPages enterName(String data) {
	
		enterByXpath(prop.getProperty("AccomodationRegPages.Name.Xpath"), data);
	    return this;
	
    }

	public AccomodationRegPages selectGender(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.Gender.Xpath"), data);
	    return this;
	
    }
	
	public AccomodationRegPages enterDateOfBirth(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.DateOfBirth.Xpath"), data);
	    return this;
	
    }
	
	public AccomodationRegPages enterDesignation(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.Designation.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages enterEmailID(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.EmailID.Xpath"), data);
		return this;
	}
	
	
	public AccomodationRegPages enterMobileNo(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.MobileNo.Xpath"), data);
	    return this;
	
    }
	
	public AccomodationRegPages enterPhoneNo(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.PhoneNo.Xpath"), data);
	    return this;
	
    }
	
	public AccomodationRegPages selectNationality(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.Nationality.Xpath"), data);
	    return this;
	
    }
	
	public AccomodationRegPages enterHotelorHouseDetailName(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.HotelorHouseDetailName.Xpath"), data);
	    return this;
	
    }
	
	public AccomodationRegPages enterCapacity(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.Capacity.Xpath"), data);
	    return this;
	
    }
	
	public AccomodationRegPages enterAddress(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.Address.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages selectState(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.State.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages selectCity(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.City.Xpath"), data);
		return this;
		
	}
	
	public AccomodationRegPages selectFRRODescription(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.FRRODescription.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages selectAccomodationType(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.AccomodationType.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages selectAccomodationGrade(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.AccomodationGrade.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages enterHotelEmailID(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.HotelEmailID.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages enterMoblieDetails(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.MoblieDetails.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages enterPhoneDetails(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.PhoneDetails.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages enterOwnerDetailsName(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.OwnerDetailsName.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages enterOwnerAddress(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.OwnerAddress.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages selectOwnerState(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.OwnerState.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages selectOwnerCity(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("AccomodationRegPages.OwnerCity.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages enterOwnerEmailID(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.OwnerEmailID.Xpath"), data);
	    return this;
	}
	
	public AccomodationRegPages enterOwnerPhoneNo(String data) {
		enterByXpath(prop.getProperty("AccomodationRegPages.OwnerPhoneNo.Xpath"), data);
	    return this;
	}
	
	public AccomodationRegPages enterOwnerMobileNo(String data) {
		
		enterByXpath(prop.getProperty("AccomodationRegPages.OwnerMobileNo.Xpath"), data);
		return this;
	}
	
	public AccomodationRegPages clickAddButton() {
		
		clickByXpathNoSnap(prop.getProperty("AccomodationRegPages.AddButton.Xpath"));
		return this;
	}
	
	
	
	
	
}
