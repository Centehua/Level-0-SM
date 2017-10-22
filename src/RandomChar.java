import java.util.Random;

import javax.swing.JOptionPane;

public class RandomChar {
 public static void main(String[] args) {
		String userAns = JOptionPane.showInputDialog("Type in a character.");
		Random z = new Random();
	int num = z.nextInt(15+1)+5;
	
	trianglePrinter(userAns,num);
}
 static void trianglePrinter(String userAns, int num) {
	

	 	for (int a = 1; a <num-1; a++) {
			for (int i = 0; i < a; i++) {
			System.out.print(userAns);	
		}
		System.out.println();	
		
		}
		
}
		
		 
 } 
 


