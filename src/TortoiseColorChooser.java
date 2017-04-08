import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		String answer = JOptionPane.showInputDialog("What would like the tortoise to draw");

		// 4. use an if/else statement to set the pen color that the user requested
		if (answer.equals("red")) {
			Tortoise.setPenColor(Color.RED);
		}
		if (answer.equals("pink")) {
			Tortoise.setPenColor(Color.PINK);
		}
		if()
		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);

		// 1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.moveTo(200, 250);
		Tortoise.turn(180);
		Tortoise.moveTo(250, 200);
		Tortoise.move(20);
		Tortoise.moveTo(100, 250);
	}
}
