import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {
/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal. */
		
	

		
	AnimalFarm() 
	{
		
	for(int i=0; i<6;i++){	
		
	String useranswer = JOptionPane.showInputDialog("Which animal do you want?");
	

		
	if(useranswer.equals("dog")){
		playWoof(); 
	} 
	else if(useranswer.equals("cow")){
		
		playMoo(); 	
	}
	else if(useranswer.equals("duck")){
		playQuack(); 
	} 
	else if(useranswer.equals("cat")){
		playMeow(); 	
	} 
			
	}
	
	} 
	
	
	//Noise methods 
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playMeow(){
		playNoise(meowFile);
	}
	

/* 2. Make it so that the user can keep entering new animals. */
	
	
	
	
	
	/* Ignore this stuff */
	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
        } 
    
	}

	public static void main(String[] args) {
	new AnimalFarm();
	
	}

}



