import javax.swing.JOptionPane;

// Copyright The League of Amazing Programmers 2014

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String userNick = JOptionPane.showInputDialog("How many nickels do you have?");

		// Convert their answer to an int using Integer.parseInt()
		int nickNum = Integer.parseInt(userNick);
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("How many dimes do you have");
		int dimesNum = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
		String quart = JOptionPane.showInputDialog("How many quarters do you have?");
		int quartNum = Integer.parseInt(quart);
		// Calculate how much money the user has and save it in a double
		// variable
		double cal1 = 0.05 * nickNum + dimesNum * 0.10 + quartNum * 0.25;
		
		
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "$" + cal1);
	}
}
