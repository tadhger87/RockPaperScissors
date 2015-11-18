/**
RockPaperScissorsApp2.java
@Tadhg O Cuirrin
HDip
x14109824
x14109824@student.ncirl.ie
03/12/14
*/

import java.util.Scanner;
import java.util.Arrays;


public class RockPaperScissorsApp3{
public static void main (String args[]){

	Scanner sc = new Scanner(System.in);
	RockPaperScissors3 myRock = new RockPaperScissors3();  //calls the instantiable class


	String playChoice;
	String doPlay = "yes";
	String dontPlay = "no";
	int rounds = 0;
	String pShape;
	int compWin = 0;
	int playerWin = 0;
	int compLoss = 0;
	int playerLoss = 0;
	int draw = 0;




	System.out.println("Hi there!  Would you like to play Rock Paper Scissors - yes or no?");
		playChoice = sc.next();



	if (playChoice.equalsIgnoreCase (doPlay)){
		System.out.println ("Great!  How many games would you like to play? ");
			int games = sc.nextInt();
				int gameStats[][] = new int[games][6];
					//int gameStatsPlayer[][] = new int[games][4];
						int x = 0;  // x is the 'games counter
							int p = 0;  //an unused counter relating to the gameStats
								int wins = 0, losses = 0, level = 0;


		//for(int i = 0; i < games -1; i++){
		while(x < games){//first while loop

			int lives = 3;
			String playerShape[] = new String[50];
				int j = 0; //for the users shapes

String compShape[] = myRock.getCompShape();





	while(lives > 0){

			System.out.println ("Please enter rock, paper or scissors...");

			pShape = sc.next();
			playerShape[j] = pShape;  //assigns the user's shape input to the array of player's chosen shapes
			j++;



			myRock.setPShape(pShape);  // send player's choice to the instantiable class
				myRock.compute();

				myRock.setLives(lives);		//send the user's lives to the instantiable class
			myRock.compute();

			lives = myRock.getLives();	// getting the players lives from the instantiable class as they decrease
				//rounds = myRock.getRounds();
					compWin = myRock.getCompWin();
						playerWin = myRock.getPlayerWin();
							compLoss = myRock.getCompLoss();
						playerLoss = myRock.getPlayerLoss();
					draw = myRock.getDraw();
				String cShape = myRock.getCShape();
			String message = myRock.getMessage();




			System.out.println();
				System.out.println("You chose " + pShape);
					System.out.println("Computer chose " + cShape);
					System.out.println(message);
				System.out.println("You have " + lives + " left");
			System.out.println();



			gameStats[games-1][0] = games;
			gameStats[games-1][1] = playerWin;
			gameStats[games-1][2] = playerLoss;
			gameStats[games-1][3] = compWin;
			gameStats[games-1][4] = compLoss;
			gameStats[games-1][5] = draw;

++rounds;
	}//end of inner while;




//show how many rounds the computer and player each won
	System.out.println ("Game " + x + " is complete");
		System.out.println ();
			System.out.println ("You played " + rounds + " rounds");
				System.out.println ();

				System.out.println("You won " + playerWin + " rounds");
			System.out.println("You lost " + compWin + " rounds");
		System.out.println("You tied " + draw + " rounds");

System.out.println();
System.out.println("Player's shapes were... ");
	for(j = 0; j<playerShape.length;j++){  //display player's chosen shapes
		if (playerShape[j] == null) {
		        continue;
			}else{
		        System.out.print(playerShape[j]);
		        System.out.println();

		    }
    }




System.out.println();
System.out.println("Computer shapes were... ");
for(int k = 0; k<compShape.length;k++){  //display computer's chosen shapes
		if (compShape[k] == null) {
		        continue;
			}else{
		        System.out.print(compShape[k]);
		        System.out.println();
		    }
    }


//Calculate who won the game
System.out.println();

if(playerWin > compWin){
	System.out.println("You won this game!!!");

	System.out.println();
	++wins;


}else if(compWin > playerWin){
	System.out.println("You lost this game");
	System.out.println();
	++losses;

}else{
	System.out.println("You finished level");
	System.out.println();
	++level;
		}



	x++;

}//end of while loop

System.out.println("It's all over!");  //decide and display who won the most games overall
for(int y = 0; y < gameStats.length; y++){

	//print out gameStat array contents
	System.out.println();
	System.out.println("Game: " + gameStats[y][0]);
	System.out.println("Player rounds won: " + gameStats[y][1]);
	System.out.println("Player rounds lost: " + gameStats[y][2]);
	System.out.println();
	System.out.println("Computer rounds won: " + gameStats[y][3]);
	System.out.println("Computer rounds lost: "+ gameStats[y][4]);
	System.out.println();
	System.out.println("Level: "+ gameStats[y][4]);
	System.out.println();


}

//}//end of first for loop

//}



System.out.println("You won " + wins + " games");
System.out.println("You lost " + losses + " games");
System.out.println(level + " games finished all level");

if(wins > losses){
	System.out.println("Congratulations, you won the whole thing!!!");
	System.out.println();

}else if(losses > wins){
	System.out.println("Commiserations, you lost overall");
	System.out.println();

}else{
	System.out.println("You finished level");
	System.out.println();
	}





}else if(playChoice.equals(dontPlay)){
	System.out.println("That's too bad - have a nice day anyways");
	}

else{
	System.out.println("Invalid input");
	}//end of outer if

}//end of main

}//end of public class