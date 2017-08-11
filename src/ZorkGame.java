import java.util.Scanner;

public class ZorkGame {

	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in); 
	System.out.println("Welcome to Westfall.");
	System.out.println("This is a small boar farm north of Sentinel Hill." + " "+ "There is a fence here and a group of adventurers");
	String ans =kb.nextLine();
	
	if(ans.equalsIgnoreCase("go north")){
	System.out.println("There is nothing north except a farm and the Great Sea. You can visit the farm, but there is a group of Murlocs cooking.");	
	String NorthAns =kb.nextLine();
	 if(NorthAns.equalsIgnoreCase("go to farm")){
	System.out.println("A wild murloc runs towards you. You are unarmed and try running, but are slain. The murlocs begin to eat your corpse.");	
	}
	
	 
	
	 else if(ans.equalsIgnoreCase("go east")){
	System.out.println("There is a mine that you can enter. It's near a Gnoll camp so be careful");	
	String EastAns =kb.nextLine();
	if(EastAns.equalsIgnoreCase("go to mine")){
	System.out.println("You walk into the mine and get lost. You are later slain by a kobold, who thinks you stole his candle.");	
	}
	
	} else if(ans.equalsIgnoreCase("go south")){
		System.out.println("There is a mountain near Sentinel Hill. You can travel to Sentinel Hill and visit vendors.");
		String SouthAns= kb.nextLine();
		if(SouthAns.equalsIgnoreCase("go to Sentinel Hill")){
		System.out.println("You are welcomed by a town guard. There is a blacksmith shop east of you. There is also an inn west of you. You can either visit the blacksmith shop or the inn "
		);	
		String HillAns= kb.nextLine();
		if(HillAns.equalsIgnoreCase("go to inn")){}
		}
		
		
	} else if(ans.equalsIgnoreCase("go west")){
	  System.out.println("There is an abandoned farm that you can travel to.");
	  String WestAns= kb.nextLine();
	  if(WestAns.equalsIgnoreCase("go to farm")){
		  System.out.println("A flock of Fleshrippers appears and attacks you. You to try to fight them off, but more come and you get slain.");
	  } 
	}
	
	}
	
	
}
}
