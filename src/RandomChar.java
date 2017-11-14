import java.util.Random;

import javax.swing.JOptionPane;

public class RandomChar {
 public static void main(String[] args) {
		String userAns = JOptionPane.showInputDialog("Type in a character.");
		Random z = new Random();
	int num = z.nextInt(16)+5;
	trianglePrinter(userAns,num);
  




}
 
 
 
 static void trianglePrinter(String userAns, int num) {
	

	for (int a = 1; a <num; a++) {
			for (int i = 0; i < a; i++) {
			System.out.print(userAns);	
		}
		System.out.println();	
		
		}
        
        
        
        for(int s = num; s > 0; s--) {
           
        for (int i =1; i < s; i++) {
        System.out.print(userAns);
    }
   System.out.println();
       
     }
       
	
           
	
		
		
		 
 } 
}



