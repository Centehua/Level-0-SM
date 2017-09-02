import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String userName= JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		System.out.println(userName.toUpperCase());
		//    Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
			for (int i = 0; i < userName.length(); i++) {
				
			
			// 4. Create a variable to store the next character of the name
			//    using .substring(start, end)
			String piece= userName.substring(i, i++);
			//    HINT: replace 'start' and 'end' to get String with character at i 
				
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
			if(i%2==0) {
			piece=piece.toUpperCase();
			}else{
			piece=piece.toLowerCase();	
			} 
			
			// 6. ADD this String  (containing 1 char) to the goofyName String
			goofyName= goofyName+piece;
			}
		
		// 7. Use pop-up to show user their Goofy name
			JOptionPane.showMessageDialog(null,goofyName);
	}
}


