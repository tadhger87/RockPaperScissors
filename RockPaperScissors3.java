/**
RockPaperScissors2.java
@Tadhg O Cuirrin
HDip
x14109824
x14109824@student.ncirl.ie
03/12/14
*/

public class RockPaperScissors3{

	private String pShape;
	private String cShape = new String();
	private String[]playerShape;
	private String[]compShape;
	private String message;
	private int lives;
	private int k = 0;
	private int rounds;
	private int playerWin;
	private int compWin;
	private int draw;
	private String shapes[];
	private int compLoss;
	private int playerLoss;



public RockPaperScissors3(){
	//constructors
	cShape = " ";
	shapes = new String[]{"rock","paper","scissors"};
	compShape = new String[50];
	message = " ";
	rounds = 0;
	playerWin = 0;
	compWin = 0;
	playerLoss = 0;
	compLoss = 0;
	draw = 0;
	lives = 0;


}


		public void setPShape(String pShape){
		this.pShape = pShape;
	}
		public void setLives(int lives){
		this.lives = lives;
	}


		public String getCShape(){
			return cShape;
	}
		public String getMessage(){
			return message;
	}
		public int getLives(){
			return lives;
	}
	//	public int getRounds(){
		//	return rounds;
	//}
		public String[] getCompShape() {
        	return compShape;
	}
		public int getCompWin(){
			return compWin;
	}

		public int getPlayerWin(){
			return playerWin;
	}
		public int getCompLoss(){
			return compLoss;
	}

		public int getPlayerLoss(){
			return playerLoss;
	}
		public int getDraw(){
			return draw;
	}





	public void compute(){




	//int i = (int) (Math.random() * shapes.length);
	cShape = shapes[(int) (Math.random() * shapes.length)];
		//cShape = shapes[i];  //computer shape chosen
			compShape[k] = cShape;
				k++;


//shape calculations
			if (pShape.equalsIgnoreCase(cShape)){

				message = "DRAW!";
				draw++;
			}
			else if(pShape.equalsIgnoreCase("rock") && cShape.equals("scissors")){

				message = "Rock beats Scissors - you win!";
				playerWin++;
				compLoss++;

			}
			else if(pShape.equalsIgnoreCase("scissors") && cShape.equals("paper")){

				message = "Scissors beats paper - you win!";
				playerWin++;
				compLoss++;
			}
			else if(pShape.equalsIgnoreCase("paper") && cShape.equals("rock")){

				message = "Paper beats Rock - you win!";
				playerWin++;
				compLoss++;

			}
			else if(pShape.equalsIgnoreCase("paper") && cShape.equals("scissors")){

				message = "Scissors beats paper - you lose!";
				--lives;
				compWin++;
				playerLoss++;
			}
			else if(pShape.equalsIgnoreCase("scissors") && cShape.equals("rock")){

				message = "Rock beats scissors - you lose!";
				--lives;
				compWin++;
				playerLoss++;

			}
			else if(pShape.equalsIgnoreCase("rock") && cShape.equals("paper")){

				message = "Paper beats Rock - you lose!";
				--lives;
				compWin++;
				playerLoss++;
			}

			else {
			message = "Invalid input - please enter rock, paper or scissors";

		}
//++rounds;
		}
//end of while



	}










