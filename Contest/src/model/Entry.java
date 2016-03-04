package model;

import java.awt.Image;
import java.io.Serializable;

public class Entry {
	public static final int MIN_SCORE = 0;
	public static final int MAX_SCORE = 10;
	public static final int DEFAULT_SCORE = -1;
	private Serializable myEntryID;
	private Image myImage;
	private int myScore;	// 0-10
	private boolean myIsRejected;
	private boolean myIsWinner;
	
	private Judge myJudge;
	
	private Contestant myContestant;
	
	public Entry(Contestant theContestant, Image theImage) {
		myContestant = theContestant;
		myImage = theImage;
		myScore = DEFAULT_SCORE;
		myIsRejected = false;
		myIsWinner = false;
		//myEntryID = new Serializable();
		myJudge = null;
	}
	
	public boolean assignJudge(final Judge theJudge) {
		if (theJudge != null) {
			myJudge = theJudge;
			return true;
		} else
			return false;
	}
	
	public void rejectEntry() {
		myIsRejected = true;
	}
	
	// getters and setters
}
