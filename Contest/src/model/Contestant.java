package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Contestant {
	
	public enum AgeGroup {
		AGE_UNDER_10, AGE_10_TO_14, AGE_ABOVE_14
	}
	
	private String myLastName;
	private String myFirstName;
	private LocalDate myBirthday;
	private AgeGroup myAgeGroup;
	private Entry myEntry;
	
	public Contestant(String theFirstName, String theLastName,
				LocalDate date) {
		myLastName = theLastName;
		myFirstName = theFirstName;
		myBirthday = date;
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

