import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	 Random a = new Random();     
	int b =a.nextInt(10);
	
	
	// 
	// 3. Print out this variable
	System.out.println(b);
	// 4. Get the user to enter a question for the 8 ball
	String userAns = JOptionPane.showInputDialog("Choose a number");
	int userNum = Integer.parseInt(userAns);
	
	// 5. If the random number is 0
	if(userNum==0) {
	JOptionPane.showMessageDialog(null, "Yes");	
		
	} 
	// -- tell the user "Yes"

	// 6. If the random number is 1
	else if(userNum==1) {
	JOptionPane.showMessageDialog(null, "No");	
		
	}
	
	
	// -- tell the user "No"

	// 7. If the random number is 2
	else if(userNum==2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google");	
		
	} 
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
	else if(userNum==3) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask your mom");	
	} 
	// -- write your own answer
	}
}

