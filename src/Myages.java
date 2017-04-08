import javax.swing.JOptionPane;

public class Myages {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How old are you");
		int age = Integer.parseInt(answer);

		for (int i = 0; i <= age; i++) {
			System.out.println(i);

		}

	}

}
