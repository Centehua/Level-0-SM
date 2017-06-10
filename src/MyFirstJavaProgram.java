import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
	Robot lea = new Robot();  
	lea.setSpeed(10);
	lea.penDown();
	lea.setPenColor(2,2,2);
	lea.setX(70);
	lea.setY(800);
        
	
        lea.move(200);
	lea.turn(90);
	lea.move(100);
	lea.turn(90);
	lea.move(200);
	lea.turn(270);
	lea.move(50);
	lea.turn(270);
        lea.move(300);
        lea.turn(90);
	lea.move(100);
	lea.turn(90);
	lea.move(300);
	lea.turn(270);
	lea.move(50);
	lea.turn(270);
	lea.move(300);
	lea.turn(90);
	lea.move(100);
	lea.turn(90);
	lea.move(300);
        
    for (int i = 0; i < 5; i++){
            
        lea.turn(270);
        lea.move(50);
	lea.turn(270);
	lea.move(300);
	lea.turn(90);
	lea.move(100);
	lea.turn(90);
	lea.move(300);
    }   
            
       
	
	 
	
	}
	
	
	}
	
		 
		 
	