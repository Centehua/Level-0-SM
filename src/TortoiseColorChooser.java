import java.awt.Color;
import java.util.logging.ErrorManager;
import javafx.scene.paint.Stop;


import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlElement;

import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                
            
		// 3. ask the user what color they would like the tortoise to draw
             String answer = JOptionPane.showInputDialog("What color would you like the tortoise to draw? " +"      "
              
                     + "Please choose one of the following colors" + ":"+" "
                            + "red" + "  "+"pink"+"  "+"yellow"+"  "
                            +"blue"+"  "+"green"+ "  "+"magneta"+"  "+"light gray"
                            +"  "+ "orange"+"  "+ "cyan");
             
		// 4. use an if/else statement to set the pen color that the user requested
                if(answer.equals("pink")){
                
                Tortoise.setPenColor(Color.pink);
                 
                } 
               
      
                   
                   
              
                           
           
             
             
		// 5. if the user doesn’t enter anything, choose a random color
                else  {
                   JOptionPane.showMessageDialog(null, "Please choose another color.");
                   
               } 
               
                      
		// 6. put a loop around your code so that you keep asking the user for more colors & drawing them
              
                
            
		// 2. set the pen width to 10
		Tortoise.setPenWidth(2); 
            
		// 1. make the tortoise draw a shape (this will take more than one line of code)
                /* 6/1/17 Update: I added a for loop to create a square
               since the previous shape was just a weird line thing */
                
                Tortoise.move(200);
                Tortoise.turn(90);
                Tortoise.move(200);
                Tortoise.turn(90);
                Tortoise.move(200);
                Tortoise.turn(90);
                Tortoise.move(200);
                Tortoise.turn(90);
                }      
	}
        
      
       
        }

