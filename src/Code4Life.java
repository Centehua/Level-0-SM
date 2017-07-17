
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
public class Code4Life {
   public static void main (String[]args) {
     String userans=  JOptionPane.showInputDialog("How many hours did you code this week?");
     int num = Integer.parseInt(userans); 
     
     if(num<2){
     JOptionPane.showMessageDialog(null,"Stop watching Youtube and write code.");   
     } else if(num>3&&num<5) {
     JOptionPane.showMessageDialog(null,"You're a Code Ninja.");
     } else if ( num > 5){
     
     } 
         
     
}   
   
private static void playBatmanTheme() {
 		try {
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    Thread.sleep(60002);
    } catch (Exception ex) {
    ex.printStackTrace();
    }
}
} 


	