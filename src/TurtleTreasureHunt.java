import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 7;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.setAngle(0);
		Tortoise.move(20);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.setAngle(180);
		Tortoise.move(20);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
		Tortoise.setAngle(270);
		Tortoise.move(20);

	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(20);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and
		// tortoiseLocationY
		System.out.println(tortoiseLocationX);
		System.out.println(tortoiseLocationY);

		// 6. If tortoise is at same location as the little girl,
		// make a pop-up tell the Tortoise where to go next
		if (tortoiseLocationX == 500 && tortoiseLocationY == 300) {

			JOptionPane.showMessageDialog(null, "Thank you tortoise");
		}

		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
		if (tortoiseLocationX == 420 && tortoiseLocationY == 100) {
			JOptionPane.showMessageDialog(null, "Hello");

		} else if (tortoiseLocationX == 400 && tortoiseLocationY == 240) {
			JOptionPane.showMessageDialog(null, "Pirate");
		} else if (tortoiseLocationX == 140 && tortoiseLocationY == 280) {
			JOptionPane.showMessageDialog(null, "Boy with blue hat");
		} else if (tortoiseLocationX == 320 && tortoiseLocationY == 400) {
			JOptionPane.showMessageDialog(null, "I'm a little fish");
		}
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want,
		 * and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground(
				"file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null,
				"Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}
