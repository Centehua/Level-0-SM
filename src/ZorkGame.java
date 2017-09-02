import java.util.Scanner;

public class ZorkGame {

	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in); 
	System.out.println("Welcome to Westfall.");
	System.out.println("This is a small boar farm north of Sentinel Hill." + " "+ "There is a fence here and a group of adventurers");
	String ans =kb.nextLine();
	// Go North
	if(ans.equalsIgnoreCase("go north")){
	System.out.println("There is nothing north except a farm and the Great Sea. You can visit the farm, but there is a group of Murlocs cooking.");	
	String NorthAns =kb.nextLine();
        
        // Go North Option
	 if(NorthAns.equalsIgnoreCase("go to farm")){
	System.out.println("A wild murloc runs towards you. You are unarmed and try running, but are slain. The murlocs begin to eat your corpse.");	
        
        //go east in north option 
	}else if(NorthAns.equalsIgnoreCase("go east")){
         System.out.println("There is a mine that you can enter. It's near a Gnoll camp so be careful");
         String EastAns2 = kb.nextLine();
         if(EastAns2.equalsIgnoreCase("go to mine")){
         System.out.println("You walk into the mine and get lost. You are later slain by a kobold, who thinks you stole his candle.");	
         }
         
         //go south in north option
         }else if(NorthAns.equalsIgnoreCase("go south")){
		System.out.println("There is a mountain near Sentinel Hill. You can travel to Sentinel Hill and visit vendors.");
           String SouthAns2= kb.nextLine();     
           if(SouthAns2.equalsIgnoreCase("go to Sentinel Hill")){
		System.out.println("You are welcomed by a town guard. There is a blacksmith shop and inn near you. You can either visit the blacksmith shop or inn "
		);	
		String HillAns= kb.nextLine();
            if(HillAns.equalsIgnoreCase("go to inn")){
               System.out.println("The innkeeper is having a raffle and any person who walks into the inn is illegible to win a free room for one full week. You can either wait for raffle to end or go to the blacksmith shop. ");
               String innAns = kb.nextLine();
               if(innAns.equalsIgnoreCase("wait")){
               System.out.println("After waiting 40 mintutes for the raffle to end you are announced the winner. Congratulations! You can continue your adventure tomorrow after a good night's rest.");
               }else if(innAns.equalsIgnoreCase("go to blacksmith")){
               System.out.println("The blacksmith is on his lunch break and has left his shop unattended. You must steal a weapon in order continue your adventure in Eastern Kingdoms.");
               String InnBlac = kb.nextLine();
               if(InnBlac.equalsIgnoreCase("steal weapon")){
                    System.out.println("As you reach for the weapon a townsmen reports you to a guard. You are caught red-handed and put in a jail ceil. You journey of Eastern Kingdoms comes to an end for now.");
                }
               } 
                }else if(HillAns.equalsIgnoreCase("go to blacksmith")){
                System.out.println("The blacksmith is on his lunch break and has left his shop unattended. You must steal a weapon in order to continue your adventure in Eastern Kingdoms.");
                String blaSmithAns = kb.nextLine();
                if(blaSmithAns.equalsIgnoreCase("steal weapon")){
                    System.out.println("As you reach for the weapon a townsmen reports you to a guard. You are caught red-handed and put in a jail ceil. You journey of Eastern Kingdoms comes to an end for now.");
                }
                }
		}    
           
         //go west in north option
        }else if(NorthAns.equalsIgnoreCase("go west")){
	  System.out.println("There is an abandoned farm that you can travel to.");
	  String WestAns2= kb.nextLine();
         if(WestAns2.equalsIgnoreCase("go to farm")){
		  System.out.println("A flock of Fleshrippers appear and begin to attack you. You to try to fight them off, but more come and you get slain.");
	  }  
         } 
        } 
	 
	
        //Go East 
	else if(ans.equalsIgnoreCase("go east")){
	System.out.println("There is a mine that you can enter. It's near a Gnoll camp so be careful");	
	String EastAns =kb.nextLine();
        
        //Go East Option
	if(EastAns.equalsIgnoreCase("go to mine")){
	System.out.println("You walk into the mine and get lost. You are later slain by a kobold, who thinks you stole his candle.");	
        
        // go east in east option 
        }else if(EastAns.equalsIgnoreCase("go east"))
        System.out.println("There is a mine that you can enter. It's near a Gnoll camp so be careful");
         String EastAns3 = kb.nextLine();
         if(EastAns3.equalsIgnoreCase("go to mine")){
         System.out.println("You walk into the mine and get lost. You are later slain by a kobold, who thinks you stole his candle.");
         
         // go south in east option
         }else if(EastAns.equalsIgnoreCase("go south")){
         System.out.println("There is a mountain near Sentinel Hill. You can travel to Sentinel Hill and visit vendors.");
           String SouthAns3= kb.nextLine();     
           if(SouthAns3.equalsIgnoreCase("go to Sentinel Hill")){
		System.out.println("You are welcomed by a town guard. There is a blacksmith shop east of you. There is also an inn west of you. You can either visit the blacksmith shop or the inn "
		);	
		String HillAns= kb.nextLine();
		if(HillAns.equalsIgnoreCase("go to inn")){
                System.out.println("The innkeeper is having a raffle and any person who walks into the inn is illegible to win a free room for one full week. You can either wait for raffle to end or go to the blacksmith shop. ");
                String innAns2 = kb.nextLine();
                if(innAns2.equalsIgnoreCase("wait")){
               System.out.println("After waiting 40 mintutes for the raffle to end you are announced the winner. Congratulations! You can continue your adventure tomorrow after a good night's rest.");
               }else if(innAns2.equalsIgnoreCase("go to blacksmith")){
               System.out.println("The blacksmith is on his lunch break and has left his shop unattended. You must steal a weapon in order continue your adventure in Eastern Kingdoms.");
               String InnBlac2 = kb.nextLine();
               if(InnBlac2.equalsIgnoreCase("steal weapon")){
                    System.out.println("As you reach for the weapon a townsmen reports you to a guard. You are caught red-handed and put in a jail ceil. You journey of Eastern Kingdoms comes to an end for now.");
                }
               } 
                }else if(HillAns.equalsIgnoreCase("go to blacksmith")){
               System.out.println("The blacksmith is on his lunch break and has left his shop unattended. You must steal a weapon in order to continue your adventure in Eastern Kingdoms.");
                String blaSmithAns2 = kb.nextLine();
                if(blaSmithAns2.equalsIgnoreCase("steal weapon")){
                    System.out.println("As you reach for the weapon a townsmen reports you to a guard. You are caught red-handed and put in a jail ceil. You journey of Eastern Kingdoms comes to an end for now.");
                }
                } 
		}    
           
          // go west in  east option 
         }else if(EastAns.equalsIgnoreCase("go west")){
         System.out.println("There is an abandoned farm that you can travel to.");
	  String WestAns3= kb.nextLine();
         if(WestAns3.equalsIgnoreCase("go to farm")){
		  System.out.println("A flock of Fleshrippers appears and attacks you. You to try to fight them off, but more come and you get slain.");
	  }  
         
         // go north in east option 
         } else if(EastAns.equalsIgnoreCase("go north")){
         System.out.println("There is nothing north except a farm and the Great Sea. You can visit the farm, but there is a group of Murlocs cooking");
	  String NorthAns3= kb.nextLine();
         if(NorthAns3.equalsIgnoreCase("go to farm")){
		  System.out.println("A wild murloc runs towards you. You are unarmed and try running, but are slain. The murlocs begin to eat your corpse.");
	  }  
         }      
        
        
	// Go South
	} else if(ans.equalsIgnoreCase("go south")){
		System.out.println("There is a mountain near Sentinel Hill. You can travel to Sentinel Hill and visit vendors.");
		String SouthAns= kb.nextLine();
                
        //Go South Option
		if(SouthAns.equalsIgnoreCase("go to Sentinel Hill")){
		System.out.println("You are welcomed by a town guard. There is a blacksmith shop east of you. There is also an inn west of you. You can either visit the blacksmith shop or the inn "
		);	
		String HillAns= kb.nextLine();
		if(HillAns.equalsIgnoreCase("go to inn")){
                    System.out.println("The innkeeper is having a raffle and any person who walks into the inn is illegible to win a free room for one full week. You can either wait for raffle to end or go to the blacksmith shop. ");
                String innAns3 = kb.nextLine();
                if(innAns3.equalsIgnoreCase("wait")){
               System.out.println("After waiting 40 mintutes for the raffle to end you are announced the winner. Congratulations! You can continue your adventure tomorrow after a good night's rest.");
               }else if(innAns3.equalsIgnoreCase("go to blacksmith")){
               System.out.println("The blacksmith is on his lunch break and has left his shop unattended. You must steal a weapon in order continue your adventure in Eastern Kingdoms.");
               String InnBlac3 = kb.nextLine();
               if(InnBlac3.equalsIgnoreCase("steal weapon")){
                    System.out.println("As you reach for the weapon a townsmen reports you to a guard. You are caught red-handed and put in a jail ceil. You journey of Eastern Kingdoms comes to an end for now.");
                }
                }else if(HillAns.equalsIgnoreCase("go to blacksmith")){
                System.out.println("The blacksmith is on his lunch break and has left his shop unattended. You must steal a weapon in order to continue your adventure in Eastern Kingdoms.");
                String blaSmithAns3 = kb.nextLine();
                if(blaSmithAns3.equalsIgnoreCase("steal weapon")){
                    System.out.println("As you reach for the weapon a townsmen reports you to a guard. You are caught red-handed and put in a jail ceil. You journey of Eastern Kingdoms comes to an end for now.");
                }
                } 
        // go west in south option        
	}else if(SouthAns.equalsIgnoreCase("go west")){
         System.out.println("There is an abandoned farm that you can travel to.");
	  String WestAns4= kb.nextLine();
         if(WestAns4.equalsIgnoreCase("go to farm")){
		  System.out.println("A flock of Fleshrippers appears and attacks you. You to try to fight them off, but more come and you get slain.");
	  }  
         
         // go east in south option
         }else if(SouthAns.equalsIgnoreCase("go east")){
         System.out.println("There is a mine that you can enter. It's near a Gnoll camp so be careful");
	  String EastAns4= kb.nextLine();
         if(EastAns4.equalsIgnoreCase("go to mine")){
		  System.out.println("You walk into the mine and get lost. You are later slain by a kobold, who thinks you stole his candle.");
	  } 
         
         //go north in south option 
         }else if(SouthAns.equalsIgnoreCase("go north")){
         System.out.println("There is nothing north except a farm and the Great Sea. You can visit the farm, but there is a group of Murlocs cooking.");
	  String NorthAns4= kb.nextLine();
         if(NorthAns4.equalsIgnoreCase("go to farm")){
		  System.out.println("A wild murloc runs towards you. You are unarmed and try running, but are slain. The murlocs begin to eat your corpse.");
	  }  
         }   
        }
            
		
		
        // Go West       
	} else if(ans.equalsIgnoreCase("go west")){
	  System.out.println("There is an abandoned farm that you can travel to.");
	  String WestAns= kb.nextLine();
          
          // Go West Option 
            if(WestAns.equalsIgnoreCase("go to farm")){
            System.out.println("A flock of Fleshrippers appears and attacks you. You to try to fight them off, but more come and you get slain.");
            }
         
           // go north in west option 
	   if(WestAns.equalsIgnoreCase("go north ")){
             System.out.println("There is nothing north except a farm and the Great Sea. You can visit the farm, but there is a group of Murlocs cooking.");
            String NorthAns5= kb.nextLine();
            if(NorthAns5.equalsIgnoreCase("go to farm")){
	    System.out.println("A wild murloc runs towards you. You are unarmed and try running, but are slain. The murlocs begin to eat your corpse.");
            }  
            
            // go south in west option 
            } else if(WestAns.equalsIgnoreCase("go south")){
            System.out.println("There is a mountain near Sentinel Hill. You can travel to Sentinel Hill and visit vendors.");
            String SouthAns5= kb.nextLine();     
            if(SouthAns5.equalsIgnoreCase("go to Sentinel Hill")){
		System.out.println("You are welcomed by a town guard. There is a blacksmith shop east of you. There is also an inn west of you. You can either visit the blacksmith shop or the inn "
		);	
		String HillAns= kb.nextLine();
		if(HillAns.equalsIgnoreCase("go to inn")){
               System.out.println("The innkeeper is having a raffle and any person who walks into the inn is illegible to win a free room for one full week. You can either wait for raffle to end or go to the blacksmith shop. ");
                String innAns4 = kb.nextLine();
                if(innAns4.equalsIgnoreCase("wait")){
               System.out.println("After waiting 40 mintutes for the raffle to end you are announced the winner. Congratulations! You can continue your adventure tomorrow after a good night's rest.");
               }else if(innAns4.equalsIgnoreCase("go to blacksmith")){
               System.out.println("The blacksmith is on his lunch break and has left his shop unattended. You must steal a weapon in order continue your adventure in Eastern Kingdoms.");
               String InnBlac4 = kb.nextLine();
               if(InnBlac4.equalsIgnoreCase("steal weapon")){
                    System.out.println("As you reach for the weapon a townsmen reports you to a guard. You are caught red-handed and put in a jail ceil. You journey of Eastern Kingdoms comes to an end for now.");
                }
                }else if(HillAns.equalsIgnoreCase("go to blacksmith")){
                System.out.println("The blacksmith is on his lunch break and has left his shop unattended. You must steal a weapon in order to continue your adventure in Eastern Kingdoms.");
                String blaSmithAns4 = kb.nextLine();
                if(blaSmithAns4.equalsIgnoreCase("steal weapon")){
                    System.out.println("As you reach for the weapon a townsmen reports you to a guard. You are caught red-handed and put in a jail ceil. You journey of Eastern Kingdoms comes to an end for now.");
                }
                } 
		} 
                
            // go east in west option     
            } else if(WestAns.equalsIgnoreCase("go east")){
             System.out.println("There is a mine that you can enter. It's near a Gnoll camp so be careful");
             String EastAns5= kb.nextLine();
             if(EastAns5.equalsIgnoreCase("go to mine")){
             System.out.println("You walk into the mine and get lost. You are later slain by a kobold, who thinks you stole his candle.");
	    }  
           
            // go west in west option 
            } else if(WestAns.equalsIgnoreCase("go west")){
             System.out.println("There is an abandoned farm that you can travel to.");
            String WestAns5= kb.nextLine();
            if(WestAns5.equalsIgnoreCase("go to farm")){
            System.out.println("A flock of Fleshrippers appears and attacks you. You to try to fight them off, but more come and you get slain.");
            }
            }   	
}

    }
       
        
        }
}
        
        
        
        

       
       
        

