
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Selena Minez
 */
public class HighLowGame {
   public  static void main(String[]args){
       // Random number 
       int random = new Random().nextInt(100)+1;
       System.out.println(random);
       
       for(int i = 0 ; i<3; i++){
      //Question + conversion  
       String answer = JOptionPane.showInputDialog("Guess a number between 1 to 100");
       
       int num = Integer.parseInt(answer);
       
       // If statments that determine what shows up after number is typed in 
       if(num == random) {
       JOptionPane.showMessageDialog(null,"You win!");
       
       } 
       else if(num > random){
       JOptionPane.showMessageDialog(null,"Too high");
       
       }
       else if (num < random){
       JOptionPane.showMessageDialog(null,"Too low");
       }
       
       } 
       JOptionPane.showMessageDialog(null,"You lose little pleb");
   }  
}
