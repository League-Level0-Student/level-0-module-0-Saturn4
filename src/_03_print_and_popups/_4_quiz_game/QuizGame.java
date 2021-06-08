package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String input = JOptionPane.showInputDialog("Is your hair brown?");
				// 3.  Use an if statement to check if their answer is correct
				if(input.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, "Cool");
					score++;
				}
				else {
					JOptionPane.showMessageDialog(null, "Oh");
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		input = JOptionPane.showInputDialog("Is the Sun a Star?");
		if(input.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You're right!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "The Sun is a Star!");
			score--;
		}
		input = JOptionPane.showInputDialog("Are narwhals real?");
		if(input.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Yup! Pretty cool");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "They are real! The horn is a tooth.");
			score--;
		}
		input = JOptionPane.showInputDialog("Do you like Dragons?");
		if(input.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Good! Dragons are great!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "I'm sorry that you're wrong.");
			score--;
		}
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Here is your score");
		JOptionPane.showMessageDialog(null, score);
		
	}
}
