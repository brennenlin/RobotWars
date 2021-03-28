package hack;

import java.net.URL;
import java.util.Scanner;

import javax.swing.*;

public class Main {

public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	JFrame jf = new JFrame();
    jf.setAlwaysOnTop(true);
	
    ImageIcon title = new ImageIcon((Main.class.getResource("title.gif")));
    ImageIcon letter = new ImageIcon((Main.class.getResource("letter copy.jpg")));
    ImageIcon welcome = new ImageIcon((Main.class.getResource("welcomePoster.jpg")));
    ImageIcon dad = new ImageIcon((Main.class.getResource("Dad.gif")));
    ImageIcon jumpscare = new ImageIcon((Main.class.getResource("maxresdefault.jpg")));

    ImageIcon pt = new ImageIcon((Main.class.getResource("PT.png")));

	// Instructions
	
	
	System.out.println("Robot Wars: The Last Scientist is an interactive storytelling game where your choices affect the outcome of the universe. \n You wake up in the year 2325 when Order 77-The Robotic Takeover has taken place and wiped the ability for humans to do sciences.\n With the help of your fRIenDLY nEigHBORHOOD help bot, you will fight the 3 evil science bots (Chembot, Biobot, Physbot) and \n realize that things are not the way they seem...\n\n");

	
	
	
	System.out.println("A long time from now in a galaxy far, far away...");
	System.out.println("(Press enter to continue)");
	scan.nextLine();
	
	
	
	
    
    JOptionPane.showMessageDialog(jf, "","Image", JOptionPane.INFORMATION_MESSAGE, title);

       
   
    
        
   
    
	
	System.out.println("*    *    *     *    *    *     *    *    *     *    *    *     *    *    *    \n"
			+ "   *    *     *    *     *    *     *    *     *    *     *    *     *    *  \n"
			+ " *    *    *     *    *    *     *    *    *     *    *    *     *    *    *    \n"
			+ "   *    *     *    *     *    *     *    *     *    *     *    *     *    *  \n"
			+ "   *    *     *    *     *    *     *    *     *    *     *    *     *    *  \n"
			+ " *    *    *     *    *    *     *    *    *     *    *    *     *    *    *    \n"
			+ "   *    *     *    *     *    *     *    *     *    *     *    *     *    *  \n"
			+ " *    *    *     *    *    *     *    *    *     *    *    *     *    *    *    \n"
			+ "   *    *     *    *     *    *     *    *     *    *     *    *     *    *  \n"
			+ " *    *    *     *    *    *     *    *    *     *    *    *     *    *    *    \n"
			+ "   *    *     *    *     *    *     *    *     *    *     *    *     *    *    \n"
			+ " *    *    *     *    *    *     *    *    *     *    *    *     *    *    *    \n"
			+ "   *    *     *    *     *    *     *    *     *    *     *    *     *    *  \n"
			+ " *    *    *     *    *    *     *    *    *     *    *    *     *    *    *    \n"
			+ "   *    *     *    *     *    *     *    *     *    *     *    *     *    *  \n"
			+ " *    *    *     *    *    *     *    *    *     *    *    *     * \n"); 
	
	
	
	
	
	
	System.out.println("Welcome to Robot Wars: The Last Scientist");	
	scan.nextLine();
	
	System.out.println("In this interactive storybased RPG game, you will be exploring the futuristic world in the year 2325.");
	scan.nextLine();
	
	
	System.out.println("However, it's not rainbows, sunshines, and butterflies as you'd expect...");
	scan.nextLine();
	
	System.out.println("Evil rogue robots have taken over the world!!!");
	scan.nextLine();
	
	System.out.println("While you meet a friendly robot guide, be prepared to bump into the rogue robot enemies!");
	scan.nextLine();
	
	System.out.println("Use your chemistry, biology, and physics skills to defeat them!");
	scan.nextLine();
	
	System.out.println("While you go through your journey, keep pressing 'enter' to continue. I'm sure you figured it out by now!"); 
	scan.nextLine();

	System.out.println("Also, be wary of new open tabs on your computer throughout your playthrough."); 
	scan.nextLine();
	
	System.out.println("During this journey, you will only discover more of the truth...");
	scan.nextLine();
	
	System.out.println("Good luck out there. You will need it...");
	scan.nextLine();
	
	
	
	

	
	
	// Name input
	System.out.print("Enter your name: ");
	String nameInput = scan.next();
	
	
	
	
	
	
	
	
	// Story starts
	
	
System.out.println("I open my eyes. I wake up in the middle of the streets.");
scan.nextLine(); 
scan.nextLine(); 

System.out.println("As I looked around, I realized it was the year 2325 when suddenly, a tall, slender robotic figure approached me. \n"
		+ "");
scan.nextLine(); 


Robot.printFriendlyRobot(); 

System.out.println("\nYou’re finally here " + nameInput + "! " + "We desperately need your help!");
scan.nextLine(); 


JOptionPane.showMessageDialog(jf, "","Image", JOptionPane.INFORMATION_MESSAGE, welcome);




System.out.println("You: Wait, who are you? And how do you know my name? \n"
		+ "");
scan.nextLine(); 

System.out.println("Eward: I’m Eward. I’m one of the last help bots that are still alive out of the many evil rogue robots. \n"
		+ "");
scan.nextLine(); 

System.out.println("Eward: You " + nameInput + ", are the only human here that remembers all 3 sciences.\n"
		+ "");
scan.nextLine(); 

System.out.println("You: How would humans forget science? And why are there rogue robots?");
scan.nextLine(); 

System.out.println("Eward: As you humans continued to create more technology, it was only about time before you created rogue robots.\n"
		+ "");
scan.nextLine(); 

System.out.println("Eward: Many many years ago, all the sciences - biology, chemistry and physics were all united as one.");
	
scan.nextLine(); 


System.out.println("People had the ability to do all 3. However, ever since Order 77-The Robotic Takeover, the robots claimed the sciences to be their own.");
	
scan.nextLine(); 

System.out.println("Ever since then, humans have struggled to learn sciences and if they do, they have the ability to ONLY major in one. \n That is...until you came along."
		+ "");
	
scan.nextLine(); 



System.out.println("You: So what you’re saying is that these “evil rogue robots” that WE created have taken over US? AND now our human race has gotten DUMBER?!? \n"
		+ "");

scan.nextLine(); 

System.out.println("Eward: Correct, these rogue robots realized that in order to rule the world, they had to get rid of advanced human thinking. \n They knew that the potential of the human brain was too powerful to be left alone…\n"
		+ ""
		+ "");
scan.nextLine(); 

System.out.println("Eward: Because of this, human thinking is the only way to destroy these evil robots. You have to use your science skills to destroy them. \n But I’m sure you’ll need my help.  \n"
		+ "");
scan.nextLine(); 


System.out.println("All of the sudden, I hear loud stomps coming closer and closer towards us…  \n"
		+ "");
scan.nextLine(); 



System.out.println("Evil Robot 1: " + nameInput + " DETECTED!!! INITIATING TERMINATION SEQUENCE!!! \n"
		+ "");
scan.nextLine(); 

System.out.println("Eward: Now, now. We have no time to waste before you get killed. You must Install my program into your computer. \n"
		+ "");
scan.nextLine();

// Enter “install” for a pop up window 

String installation;
do{
    System.out.println("Please permit installation into drivers. Type 'install' into your console");
    installation = scan.nextLine();
}
while(!installation.contains("install"));




ImageIcon yes = new ImageIcon((Main.class.getResource("Untitled_Artwork-1.png"))); // 325 x 240 size
JOptionPane.showMessageDialog(jf, "Hi "+nameInput+ " did it work? Do you see me?","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

JOptionPane.showMessageDialog(jf, "Okay good... wow I can’t believe I am in colour! \n It really is a whole new world here! But anyways... we don’t have time to waste","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );



System.out.println("Evil Robot 1: " + nameInput + " DETECTED!!! INITIATING TERMINATION SEQUENCE");
scan.nextLine(); 

//CHEMISTRY BOSS FIGHT  

System.out.println("A periodic table will be provided. We reccomend that you do not close the tab, or the program may terminate");
Image3 gui3 = new Image3();
gui3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
gui3.setVisible(true);
gui3.pack();
gui3.setTitle("Image");


//Show tutorial dialogue
GameFunctions.Tutorial();
scan.nextLine();
//Print Enemy Robot 1
Robot.printEnemyRobot1();

//Show stats with answer incorrect (answer hasn't been provided yet)
GameFunctions.showStats(false);
//Print question
System.out.println("1. What is the element with the atomic mass of 137g? (answer in lowercase)");
//User input
String answer;
answer = scan.nextLine();
//While answer is incorrect
while(!answer.contains("barium")){
//Reprint robot without damage
Robot.printEnemyRobot1();
//Show stats with answer incorrect
GameFunctions.showStats(false);
System.out.println("Incorrect");
JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

//Get user input again
answer = scan.nextLine();

}
//When answer is correct, show damaged robot
Robot.printEnemyRobot1_damage1();
//Show stats with answer correct
GameFunctions.showStats(true);
System.out.println("Correct\n\nPress enter to continue");
JOptionPane.showMessageDialog(jf, "Yay! You Got it! Congrats on getting your first question!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

scan.nextLine();
scan.nextLine();
//Reset attempt counter for next question
GameFunctions.resetAttempts();
//Print robot with damage=1
Robot.printEnemyRobot1_damage1();
GameFunctions.showStats(false);
System.out.println("Sum of the atomic numbers of Iron, potassium, and sodium");
answer = scan.nextLine();
while(!answer.contains("56")){
   Robot.printEnemyRobot1_damage1();
   GameFunctions.showStats(false);
   System.out.println("Incorrect");
   JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

   answer = scan.nextLine();

}
Robot.printEnemyRobot1_damage2();
GameFunctions.showStats(true);
System.out.println("Correct\n\nPress enter to continue");
JOptionPane.showMessageDialog(jf, "Yay! You Got it!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

scan.nextLine();
scan.nextLine();
//Reset attempt counter for next question
GameFunctions.resetAttempts();
//Print robot with damage=2
Robot.printEnemyRobot1_damage2();
GameFunctions.showStats(false);
System.out.println("What is the chemical formula for salt (eg chemical formulas: H2O, KCl etc.");
answer =scan.nextLine();
while(!answer.contains("NaCl")){
   Robot.printEnemyRobot1_damage2();
   GameFunctions.showStats(false);
   System.out.println("Incorrect");
   JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

   answer = scan.nextLine();

}

GameFunctions.showStats(true);
System.out.println("Chembot: NOOOO you destroyed me");
JOptionPane.showMessageDialog(jf, "Yay! You got him!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );






//END BOSS FIGHT 1





JOptionPane.showMessageDialog(jf, "Whew that was a close one!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

scan.nextLine(); 

System.out.println("You: Okay Eward, so how exactly did robots go about making the human brain so dumb?"); 
scan.nextLine();


JOptionPane.showMessageDialog(jf, "As humans were so reliant on technology,\n rogue robots easily found access to every cell phone to television","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );




JOptionPane.showMessageDialog(jf, "On March 27, 2021, they broadcasted a video that shrinked the human brain.\n It reduced the brain's capacity to store such vast amounts of information, \n and humans had to relearn even the most basic maths and sciences.","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );





System.out.println("You: Wait, 2021??? I'm starting to remember! I’m from that time! In my mind, \n I can see my father smiling at me while I feel myself fade away slowly."); 
scan.nextLine();

System.out.println("You: There was nothing we could’ve done to stop the rise of the rogue robots. \n So I created the time machine to come here"
		+ ""); 
scan.nextLine();


JOptionPane.showMessageDialog(jf, "","Image", JOptionPane.INFORMATION_MESSAGE, dad);


//SOMEHOW INCLUDE SOME FIRST PERSON POV GIF OF A HAPPY OLD MAN SMILING at you while the image gets blurier and blurier 




System.out.println("Suddenly, I hear a loud evil robotic voice come from the shadows: " + nameInput + " THIS IS YOUR FINAL, AND ONLY WARNING.\n"
		+ "");
scan.nextLine();

System.out.println("I see a strong, bulky robot come out of the shadows.\n"
		+ "");
scan.nextLine();

System.out.println("Biobot: Hand yourself over " + nameInput + " and I will let you live. \n"
		+ "");
scan.nextLine();

System.out.println("You: Who are you? And what do you want?");
scan.nextLine();

System.out.println("Biobot: I am Biobot, the rogue robot of biology. I do not need to harm you. \n Your brain which contains all the 3 sciences is all I need.");
scan.nextLine();

JOptionPane.showMessageDialog(jf, "Don’t listen to Biobot!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );



System.out.println("I will transplant another human brain into you, and you can live happily ever after...");
scan.nextLine();

JOptionPane.showMessageDialog(jf, "He promised the same to your FATHER. He TOOK your father!!!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );



System.out.println("Biobot: Just hand yourself over, and you will be ok. \n"
		+ "");
scan.nextLine();


System.out.println("You: YOU LIAR!!! NEVER!!!\n"
		+ "");
scan.nextLine();

System.out.println("Biobot: You leave me no choice but to destroy you. It didn’t have to be this way… ");
scan.nextLine();

GameFunctions.resetAttempts();
GameFunctions.resetHealth();

// BOSS FIGHT 2 

//Print Enemy Robot 2
Robot.printEnemyRobot2();

//Show stats with answer incorrect (answer hasn't been provided yet)
GameFunctions.showStats(false);
//Print question
System.out.println("What is the “powerhouse of the cell” (answer in lowercase)\n"
		+ "");
//User input

answer = scan.nextLine();
//While answer is incorrect
while(!answer.contains("mitochondria")){
//Reprint robot without damage
Robot.printEnemyRobot1();
//Show stats with answer incorrect
GameFunctions.showStats(false);
System.out.println("Incorrect");
JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

//Get user input again
answer = scan.nextLine();

}
//When answer is correct, show damaged robot
Robot.printEnemyRobot2_damage1();
//Show stats with answer correct
GameFunctions.showStats(true);
System.out.println("Correct\n\nPress enter to continue");
JOptionPane.showMessageDialog(jf, "Yay! You Got it!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

scan.nextLine();
scan.nextLine();
//Reset attempt counter for next question
GameFunctions.resetAttempts();
//Print robot with damage=1
Robot.printEnemyRobot2_damage1();
GameFunctions.showStats(false);
System.out.println("Trees create energy through a process called photosynthesis. What gas is given off during this process? (answer in lowercase)\n"
		+ "");
answer = scan.nextLine();
while(!answer.contains("oxygen")){
 Robot.printEnemyRobot2_damage1();
 GameFunctions.showStats(false);
 System.out.println("Incorrect");
 JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

 answer = scan.nextLine();

}
Robot.printEnemyRobot2_damage2();
GameFunctions.showStats(true);
System.out.println("Correct\n\nPress enter to continue");
JOptionPane.showMessageDialog(jf, "Yay! You Got it!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

scan.nextLine();
scan.nextLine();
//Reset attempt counter for next question
GameFunctions.resetAttempts();
//Print robot with damage=2
Robot.printEnemyRobot2_damage2();
GameFunctions.showStats(false);
System.out.println("2. What is the young one of a cow called? (answer in lowercase)\n"
		+ "");
answer = scan.nextLine();
while(!answer.contains("calf")){
 Robot.printEnemyRobot2_damage2();
 GameFunctions.showStats(false);
 System.out.println("Incorrect");
 JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

 answer = scan.nextLine();

}

GameFunctions.showStats(true);
System.out.println("Chembot: NOOOO you destroyed me");
JOptionPane.showMessageDialog(jf, "Yes!!! You got em!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );










//Defeat the boss



System.out.println("You: WHERE IS MY FATHER?!?");
scan.nextLine();

System.out.println("Biobot: He is alive here…");
scan.nextLine();

System.out.println("*Biobot dies*"
		+ "");
scan.nextLine();


JOptionPane.showMessageDialog(jf, "Excellent my apprentice, you used your science skills very effectively… \n Continue using your powers! You are getting stronger and stronger...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );




System.out.println("I hear footsteps approaching me that are much quieter than before. A human-shaped robot appears in front of me.");
scan.nextLine();

System.out.println("All of a sudden it attacks me!");
scan.nextLine();

//Physics BOSS FIGHT 3





GameFunctions.resetAttempts();
GameFunctions.resetHealth();

//Print Enemy Robot 3
Robot.printEnemyRobot3();

//Show stats with answer incorrect (answer hasn't been provided yet)
GameFunctions.showStats(false);
//Print question
System.out.println("Which body in our Solar System was once classified as a planet, but isn't any more? (answer in lowercase)\n"
		+ "");
//User input

answer = scan.nextLine();
//While answer is incorrect
while(!answer.contains("pluto")){
//Reprint robot without damage
Robot.printEnemyRobot3();
//Show stats with answer incorrect
GameFunctions.showStats(false);
System.out.println("Incorrect");
JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

//Get user input again
answer = scan.nextLine();

}
//When answer is correct, show damaged robot
Robot.printEnemyRobot3_damage1();
//Show stats with answer correct
GameFunctions.showStats(true);
System.out.println("Correct\n\nPress enter to continue");
JOptionPane.showMessageDialog(jf, "Yay! You Got it!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

scan.nextLine();
scan.nextLine();
//Reset attempt counter for next question
GameFunctions.resetAttempts();
//Print robot with damage=1
Robot.printEnemyRobot3_damage1();
GameFunctions.showStats(false);
System.out.println("What force pulls us to Earth? (answer in lowercase)\n"
		+ "");
answer = scan.nextLine();
while(!answer.contains("gravity")){
Robot.printEnemyRobot3_damage1();
GameFunctions.showStats(false);
System.out.println("Incorrect");
JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

answer = scan.nextLine();

}
Robot.printEnemyRobot3_damage2();
GameFunctions.showStats(true);
System.out.println("Correct\n\nPress enter to continue");
JOptionPane.showMessageDialog(jf, "Yay! You Got it!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

scan.nextLine();
scan.nextLine();
//Reset attempt counter for next question
GameFunctions.resetAttempts();
//Print robot with damage=2
Robot.printEnemyRobot3_damage2();
GameFunctions.showStats(false);
System.out.println("Glass is opaque, true or false? (answer in lowercase)\n"
		+ "");
answer=scan.nextLine();
while(!answer.contains("false")){
Robot.printEnemyRobot3_damage2();
GameFunctions.showStats(false);
System.out.println("Incorrect");
JOptionPane.showMessageDialog(jf, "You're incorrect! C'mon you can do this...","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );

answer = scan.nextLine();

}

GameFunctions.showStats(true);
JOptionPane.showMessageDialog(jf, "Down goes the mighty physics bot!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );





//END BOSS FIGHT











System.out.println("As I destroy the robot, a weak old man falls out of the robotic suit \n"
		+ "");
scan.nextLine();

System.out.println("As the robotic wires detach from him, he finally is able to stand to his feet \n"
		+ "");
scan.nextLine();

System.out.println("As I look the man in the eye, I realize that it is my father....\n"
		+ "");
scan.nextLine();

System.out.println("You: Dad..is that you? \n"
		+ "");
scan.nextLine();

System.out.println("You: Why were you in that suit? Are you Darth Vader or something?\n"
		+ "");
scan.nextLine();

System.out.println("Father: I was under control.");
scan.nextLine();



System.out.println("Father: Listen " + nameInput + ", you don’t have to believe me. \n Here, I have a letter that I wrote 5 years ago in case I could see you again.");
scan.nextLine();

// hands letter 

JOptionPane.showMessageDialog(jf, "","Image", JOptionPane.INFORMATION_MESSAGE, letter);






System.out.println("You: Wow dad, thanks for this. I’m happy you still thought of me when you were gone. I never thought I’d see you again.\n"
		+ "");
scan.nextLine();

System.out.println("Father: Of course " + nameInput + ", especially with Emperor Eward and his evil creation of Order 77, \n not a day went by where I didn’t think of you.\n"
		+ "");
scan.nextLine();


System.out.println("You: Emperor Eward?!? \n"
		+ "");
scan.nextLine();

System.out.println("Father: Yes, he started Order 77 and turned the best human scientists into robots under his control.\n"
		+ "");
scan.nextLine();

System.out.println("You: I have a bit of bad news…\n"
		+ "");
scan.nextLine();


//Creepy jumpscares
JOptionPane.showMessageDialog(jf, "I'm sure you didn't like the scare","Image", JOptionPane.INFORMATION_MESSAGE, jumpscare);


ImageIcon evil = new ImageIcon((Main.class.getResource("Evil.png")));

ImageIcon scary = new ImageIcon((Main.class.getResource("Scary.png"))); // shrink

ImageIcon surprised = new ImageIcon((Main.class.getResource("Surprised.png"))); //shrink

JOptionPane.showMessageDialog(jf, "Emperor Eward: WHILE I WAS IN YOUR COMPUTER, \n I SUMMONED THE 3 ROBOTS YOU ENCOUNTERED ALL FROM EACH BRANCH OF SCIENCE!!! \n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, scary  );

JOptionPane.showMessageDialog(jf, "Emperor Eward: I’VE BEEN ABSORBING YOUR POWERS ALL ALONG!!!! MWAHAHAHAHA! \n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, scary );

JOptionPane.showMessageDialog(jf, "You really are a foolish child...you realize this is a HACK-athon right? \n You should have expected for me to hack your computer!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );

JOptionPane.showMessageDialog(jf, "Your life is over...and your computer is hacked...yes I know it is March 28 2021 where you are. \n Meaning that Order 77 happened.\n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, scary );

JOptionPane.showMessageDialog(jf, "There is nothing you can do to stop me. \n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, scary );





//(button that says fight Emperor Eward)

JOptionPane.showMessageDialog(jf, "What, you want to fight me? I mean you will never win. I have the powers of the entire Internet and your computer. \n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );

JOptionPane.showMessageDialog(jf, "But fine...I will give you a chance. But I’ll tell you, it won’t be easy. \n And if you lose, your computer is mine forever. \n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, scary );


System.out.println("Father: C’mon" + nameInput + " you can do it!");



// EPIC FINAL BOSS FIGHT WITH CHEM, BIO, AND PHYSICS QUESTIONS


String [] answers = new String[6];
answers[0]="a";
answers[1]="b";
answers[2]="d";
answers[3]="c";
answers[4]="b";
answers[5]="d";
ImageIcon[] questions = new ImageIcon[6];
questions[0] = new ImageIcon((Main.class.getResource("q1.jpeg")));
questions[1] = new ImageIcon((Main.class.getResource("q2.jpeg")));
questions[2] = new ImageIcon((Main.class.getResource("q3.jpeg")));
questions[3] = new ImageIcon((Main.class.getResource("q4.jpeg")));
questions[4] = new ImageIcon((Main.class.getResource("q5.jpeg")));
questions[5] = new ImageIcon((Main.class.getResource("q6.jpeg")));

JOptionPane.showMessageDialog(jf, "OKAY FINE. LET'S FIGHT. CURRENTLY YOU HAVE " +GameFunctions.showPoints(false) + " POINTS. DON'T EXPECT TO BE GETTING ANY MORE. \n Note that answers must be in lowercase","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, yes );
for(int i=0;i<6;i++){
  String answer1= JOptionPane.showInputDialog(jf,questions[i]);
  if(answer1.equals(answers[i])){
     JOptionPane.showMessageDialog(jf, "NOO you got it correct \n Points: " + GameFunctions.showPoints(true),"EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, surprised );
  }
  else{
     JOptionPane.showMessageDialog(jf, "HAH INCORRECT. As expected... \n Points: " + GameFunctions.showPoints(false),"EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );
  }
}









//Evil Ending 


JOptionPane.showMessageDialog(jf, "MWAHAHAHAHA! You did not save the world because \n YOU my friend are TERRIBLE at science!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );


JOptionPane.showMessageDialog(jf, "YOUR lack of abilities is an INSULT to me! \n I shouldn’t even be wasting MY time fighting you!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );


JOptionPane.showMessageDialog(jf, "Emperor Eward: Because of you everyone is still in danger. \n Goodbye.","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );






System.out.println("Father: Not only did you foolishly install Emperor Eward into your computer, but you let him destroy the world…  \n"
		+ "");
scan.nextLine();

System.out.println("Father: Son, there’s nothing I can say rather than I am disappointed.\n"
		+ "");
scan.nextLine();

System.out.println("Unfortunately, you have not scored high enough on the fights to save the world. \n You have unlocked BAD ENDING");
scan.nextLine();

System.out.println("Play again to discover more endings!");
scan.nextLine();


//Neutral Ending


JOptionPane.showMessageDialog(jf, "You made a decent effort. But “decent” is nowhere close to my PERFECT abilities. \n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );

JOptionPane.showMessageDialog(jf, "Maybe you should consider brushing up on your science skills \n before fighting a super powerful robot like me. \n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );


JOptionPane.showMessageDialog(jf, "After being bullied for my weak, tiny appearance for far too long, \n I am now unstoppable!!! \n All robots and humans are going to be under MY control!!!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, evil );



System.out.println("Father: Don’t worry " + nameInput + ", I know that you tried. I’m just glad to see you again. \n"
		+ "");
scan.nextLine();




//Good Ending 

// SCARED EWARD IN GUI
JOptionPane.showMessageDialog(jf, "Emperor Eward: NOOOOOO!!! I CANNOT BELIEVE THAT \n YOU HAVE ACTUALLY DEFEATED ME!!!","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, surprised );
JOptionPane.showMessageDialog(jf, "Emperor Eward: NOOOOO! IM LOSING CONNECTION TO YOurr...\n","EWARD IN WINDOW", JOptionPane.INFORMATION_MESSAGE, surprised );

//switches back to console

System.out.println("Emperor Eward: I WON’T BE ABLE TO RULE THE WORLD, \n I WON’T BE ABLE TO GET REVENGE ON ALL THOSE ROBOTS WHO BULLIED ME THROUGHOUT MY LIFE!\n"
		+ "");
scan.nextLine();



System.out.println("Emperor Eward: It’s because of you... How could you…  \n"
		+ "");
scan.nextLine();

System.out.println("*Emperor Eward fades away*\n");
scan.nextLine();

System.out.println("Father: You have defeated Emperor Eward and have freed the lives of all robots and humans. I am also so glad to see you again, and not to mention, proud. \n"
		+ "");
	
scan.nextLine();

System.out.println("Father: Yes son...it’s nice to finally see you again");
scan.nextLine();

System.out.println("You: Why were you in that suit? Are you Darth Vader or something?\n");
scan.nextLine();

System.out.println("Father: Yes son...it’s nice to finally see you again");
scan.nextLine();

System.out.println("Father: " + nameInput + ", you have defeated Emperor Eward and have freed the lives of all robots and humans. \n I am also so glad to see you again, and not to mention, proud. \n"
		+ "");
scan.nextLine();

System.out.println("You: Proud?");
scan.nextLine();

System.out.println("Father: Yes, you just saved the universe and recovered science...I’m very proud of you");
scan.nextLine();








}
}