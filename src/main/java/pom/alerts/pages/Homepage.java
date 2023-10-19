package pom.alerts.pages;

import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers{

	
public Alertspage switchToFrame(String data) {
		
		switchtoframename(data);
		return new Alertspage();
	}
    
   


}
