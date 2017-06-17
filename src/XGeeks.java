import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {
             
        
        for (int i = 0; i < 10; i++) { 
	
		// 1. Save the superpower for each person in a variable.
                String Izuku = "Izuku's quirk is One For All";
                String Shoto = "Shoto's quirk is Half-Cold Half-Hot";
                String Katsuki = "Bakugo's quirk is Explosion";
                String Ochaco ="Ochaco's quirk is Zero Gravity" ; 
                String Mina = "Mina's quirk is Acid";
                
           	// 2. Ask the user to enter a name. Store their answer in a variable.
                String answer = JOptionPane.showInputDialog("What superhero do you want?" 
                +"  "+ "Pick from the following:" +"  "+ "Izuku"+ " "+ "Shoto"
                + " " + "Bakugo"+" "+ "Ochako"+ " "+ "Mina"); 
            
	
    // 3. Show the superpower in a pop-up, depending on the name entered.
    
    //6/1/17 Update: I changed the string to a case 
    
        switch (answer) {
        default:
            JOptionPane.showMessageDialog(null,"Please pick another My Hero Academia character."
            + "  " + "Also please write the character's name in capitals (only first letter)." );
            break;
        case "Izuku":
            ImageIcon c = new ImageIcon("C:\\Users\\Selena Minez\\OneDrive\\GitHub\\Level-0-SM\\src\\CharacterPics\\Izuku Midoriya.png");
           JOptionPane.showMessageDialog(null,Izuku,"Izuku Midoriya", JOptionPane.PLAIN_MESSAGE,c);
            break;
        case "Shoto" :
            ImageIcon d = new ImageIcon("C:\\Users\\Selena Minez\\OneDrive\\GitHub\\Level-0-SM\\src\\CharacterPics\\Shoto Todoroki.png");
           JOptionPane.showMessageDialog(null,Shoto,"Shoto Todoroki", JOptionPane.PLAIN_MESSAGE,d);
            break;
        case "Katsuki":
            ImageIcon e = new ImageIcon("C:\\Users\\Selena Minez\\OneDrive\\GitHub\\Level-0-SM\\src\\CharacterPics\\Katsuki Bakugo.png");
           JOptionPane.showMessageDialog(null,Katsuki,"Katsuki Bakugo", JOptionPane.PLAIN_MESSAGE,e);
            break;
        case "Ochaco":
            ImageIcon a = new ImageIcon("C:\\Users\\Selena Minez\\OneDrive\\GitHub\\Level-0-SM\\src\\CharacterPics\\Ochaco Uraraka.png");
           JOptionPane.showMessageDialog(null,Ochaco,"Ochako Uraraka", JOptionPane.PLAIN_MESSAGE,a);
            break;
        case "Mina":
           ImageIcon b = new ImageIcon("C:\\Users\\Selena Minez\\OneDrive\\GitHub\\Level-0-SM\\src\\CharacterPics\\Mina Ashido.png");
           JOptionPane.showMessageDialog(null,Mina,"Mina Ashido", JOptionPane.PLAIN_MESSAGE,b);
        }
            break;
       
             }			
				
        }
        } 
