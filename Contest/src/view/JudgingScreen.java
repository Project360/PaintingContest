package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.Entry;
import model.Judge;

public class JudgingScreen extends JFrame implements ActionListener {
	private JTextField myEntryIdText;
	private JTextField myScoreText;
	private Judge myJudge;
	
	public JudgingScreen(Judge theJudge) {
		// create GUI and display
		myJudge = theJudge;
	}
	
	private boolean assignScore() {
		int theEntryID = Integer.parseInt(myEntryIdText.getText());
		int theScore = Integer.parseInt(myScoreText.getText());
		PaintingContest contest = null;
		Entry theEntry = contest.getEntry(theEntryID);
		myJudge.assignScore(theEntry, theScore);
		return true;
	}
	
	private boolean assignFirst() {
		return true;
	}
	
	private boolean assignSecond() {
		return true;
	}
	
	private boolean assignThird() {
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
