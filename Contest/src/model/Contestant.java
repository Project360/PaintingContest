package model;

import java.util.Date;

public class Contestant {
	
	public enum AgeGroup {
		AGE_UNDER_10, AGE_10_TO_14, AGE_ABOVE_14
	}
	
	private String myLastName;
	private String myFirstName;
	private Date myBirthday;
	private AgeGroup myAgeGroup;
	private Entry myEntry;
	
	public Contestant(String theLastName, String theFirstName,
				Date theBirthday) {
		myLastName = theLastName;
		myFirstName = theFirstName;
		myBirthday = theBirthday;
		myEntry = null;
		setAgeGroup();
	}
	
	private void setAgeGroup() {
		// based on birthday set myAgeGroup
	}
	
	public boolean submitEntry() {
		// create Entry object
		return true;
	}
}

