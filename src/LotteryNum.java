import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNum {
public static void main(String[] args) {
	Random lNum= new Random(); 
	int a=lNum.nextInt(101); 
	int b= lNum.nextInt(550)+5;
	int c =lNum.nextInt(43)+7;
	int d= lNum.nextInt(716)+33;
	int e =lNum.nextInt(41)+11;
	JOptionPane.showMessageDialog(null,"The numbers are"+" " +a +" "+b+" "+c+" "+d+" "+e);
	



}
}
