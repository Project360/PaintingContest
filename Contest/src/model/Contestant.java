package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Contestant {
	
	private String myLastName;
	private String myFirstName;
	private String myBirthday;
	private String phone;
	private String email;
	private String ageGroup;
	//private AgeGroup myAgeGroup;
	private Entry myEntry;
	
	public Contestant(String theFirstName, String theLastName,
				String phone, String age, String email) {
		myLastName = theLastName;
		myFirstName = theFirstName;
		this.phone = phone;
		ageGroup = age;
		this.email = email;
		myEntry = null;
	}
	
	public String getAgeGroup() {
		return ageGroup;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getLast() {
		return myLastName;
	}
	public String getFirst() {
		return myFirstName;
	}
	
	public String getBday() {
		return myBirthday;
	}
}

