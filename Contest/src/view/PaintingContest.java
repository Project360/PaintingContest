package view;

import java.util.HashMap;

import model.Entry;

/**
 * The PaintingContest object represents the coloring contest. It contains the
 * submitted contest entries which is loaded at the start of the program from the
 * attached textfile. It starts by displaying the Registration screen and changes
 * the GUI based on the user actions.
 * 
 * @author Sara Vandandaigue
 * @version 0.1
 *
 */
public class PaintingContest {
	
	/**
	 * Map of entryID to Entry object.
	 */
	private HashMap<Integer, Entry> myContestEntries;

	public static void main(String[] args) {
		//new Registration();
		new HomeScreen();
	}
	
	/**
	 * Loads the contest entries from the textfile (DB).
	 * @return
	 */
	private boolean loadEntries() {
		//load entries from textfile
		return true;
	}
	
	public HashMap<Integer, Entry> getEntries() {
		return myContestEntries;
	}
	
	public Entry getEntry(int theEntryID) {
		return myContestEntries.get(theEntryID);
		
	}
	

}
