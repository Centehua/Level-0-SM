import javax.swing.JOptionPane;

public class PrimeOrNot {
 public static void main(String[] args) {
  String UserAns = JOptionPane.showInputDialog("Choose a number")	;
  int UserNum= Integer.parseInt(UserAns);
  if(UserNum<2) {
	JOptionPane.showMessageDialog(null, "This isn't a prime number");  
	System.exit(0);
  }
  for (int i = 2; i < UserNum; i++) {
	if(UserNum%2==0) {
	JOptionPane.showMessageDialog(null, "This isn't a prime number");	
	System.exit(0);
	}	
	
}
  JOptionPane.showMessageDialog(null, "This a prime number");
}
}
