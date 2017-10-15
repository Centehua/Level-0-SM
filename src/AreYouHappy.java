import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String UserH = JOptionPane.showInputDialog("Are you happy?");
	
	if(UserH.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	} else{
		String UserNo = JOptionPane.showInputDialog("Do you want to be happy?");
		if(UserNo.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Change Something");	
		} else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} 
	}
}
}
