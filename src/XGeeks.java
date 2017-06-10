import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
                String Izuku = "Izuku's quirk is One For All";
                String Todoroki = "Todoroki's quirk is Half-Cold Half-Hot";
                String Bakugo = "Bakugo's quirk is Explosion";
                String Ochako ="Ochako's quirk is Zero Gravity" ; 
                String Mina = "Mina's quirk is Acid";
	
	
	
		// 2. Ask the user to enter a name. Store their answer in a variable.
                String answer = JOptionPane.showInputDialog("What superhero do you want?");
             
	
    // 3. Show the superpower in a pop-up, depending on the name entered.
    //6/1/17 Update: I changed the string to a case 
    switch (answer) {
        case "Izuku":
            JOptionPane.showMessageDialog(null,Izuku);
            break;
        case "Todoroki":
            JOptionPane.showMessageDialog(null,Todoroki);
            break;
        case "Bakugo":
            JOptionPane.showMessageDialog(null,Bakugo);
            break;
        case "Ochako":
            JOptionPane.showMessageDialog(null,Ochako);
            break;
        case "Mina":
            JOptionPane.showMessageDialog(null,Mina);
            break;
        default:
            JOptionPane.showMessageDialog(null,"Please pick another My Hero Academia character");
            break;
    }		
				
				
            }
    }

