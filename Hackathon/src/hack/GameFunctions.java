package hack;
	public class GameFunctions {

	  static int points = 0;
	  static int health=3;
	  static int attempts = -1;
	 
	 
	// 3 math problems, 3 answers, 3 attempts per problem, points

	 
	  public static void Tutorial() {
	    
	     System.out.println("In each boss fight, there will be 3 math problems and 3 attempt per problem");
	    
	     System.out.println("Although you can use all 3 attempts, the more attempts you use, the less points you'll receive.");
	    
	     System.out.println("Every time you answer a question correctly, you damage the enemy. However, if you answer incorrectly, you will be damaged.");
	    
	 
	  }
	 
	 
	 
	 


	  public static void showStats(boolean correct){
	     //if answer incorrect, display each method with parameter false
	     if(!correct) {
	        System.out.println("ENEMY HEALTH: " + enemyHealth(false));
	        System.out.println("ATTEMPTS: " + Attempts(false));
	        System.out.println("POINTS: " + showPoints(false));
	     }
	     //if answer correct, display each method with parameter true
	     if(correct) {
	        System.out.println("ENEMY HEALTH: " + enemyHealth(true));
	        System.out.println("ATTEMPTS: " + Attempts(true));
	        System.out.println("POINTS: " + showPoints(true));
	     }
	  }
	 
	  public static int enemyHealth(boolean correct){
	     //if answer is correct, deplete enemy health
	     if(correct) {
	        health--;
	     }
	     //return health variable
	     return health;

	  }


	  public static int Attempts(boolean correct) { // parameter doesn't matter
	     //counter number of attempts
	     attempts++;
	     //return attempts variable
	     return attempts;

	  }
	  public static int showPoints(boolean correct) {
	     //only counter points after answer is correct
	     if(correct) {
	        //Based on number of attempts, add certain number of points.
	        if (attempts == 1) {
	           points = points + 3;

	        }

	        if (attempts == 2) {
	           points = points + 2;

	        }

	        if (attempts == 3) {
	           points = points + 1;

	        }
	     }
	     //return variable points
	     return points;

	  }
	  public static void resetAttempts(){
	     //attempts resets back to -1 when called (since the first time the method is called it counters back to 0
	     attempts=-1;

	  }
	  public static void resetHealth(){
	     //reset health when new enemy to fight
	     health=3;

	  }
	 
	 
	 
	}




	
	
	
	

