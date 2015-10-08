import java.util.Scanner;
import java.util.Random;

public class Dice_Roller {
	public static void main(String args[]){
		Scanner typeNum = new Scanner(System.in);
		Random rollerDice = new Random();
		
		int num = 0; //Loop counter iterates "rolls" times
		int rolls = 0; //User defined number of rolls
		int numTwo = 0; //Tracks number of twos found
		int numThree = 0; //Tracks number of threes found
		int numFour = 0; //Tracks number of fours found
		int numFive = 0; //Tracks number of fives found
		int numSix = 0; //Tracks number of sixes found
		int numSeven = 0; //Tracks number of sevens found
		int numEight = 0; //Tracks number of eights found
		int numNine = 0; //Tracks number of nines found
		int numTen = 0; //Tracks number of tens found
		int numEleven = 0; //Tracks number of elevens found
		int numTwelve = 0; //Tracks number of twelves found
		int diceRollerOne = 0; //Dice value #1
		int diceRollerTwo = 0; //Dice value #2
		int totalRoll = 0; //Sum of dice values
		
		System.out.println("How much times should I roll it?");
		rolls = typeNum.nextInt();

		if (rolls >= 1){
			//Roll dice "roll" times
			for (num = 0; num < rolls; num++){
				diceRollerOne = rollerDice.nextInt(6) + 1;
				diceRollerTwo = rollerDice.nextInt(6) + 1;
				totalRoll = diceRollerOne + diceRollerTwo;
				
		//Count number of whatever is assigned (numOne, numTwo, etc.)
		if (totalRoll == 2){
		}
		else if (totalRoll == 3){
			numThree = numThree + 1;
		}
		else if (totalRoll == 4){
			numFour = numFour + 1;
		}
		else if (totalRoll == 5){
			numFive = numFive + 1;
		}
		else if (totalRoll == 6){
			numSix = numSix + 1;
		}
		else if (totalRoll == 7){
			numSeven = numSeven + 1;
		}
		else if (totalRoll == 8){
			numEight = numEight + 1;
		}
		else if (totalRoll == 9){
			numNine = numNine + 1;
		}
		else if (totalRoll == 10){
			numTen = numTen + 1;
		}
		else if (totalRoll == 11){
			numEleven = numEleven + 1;
		}
		else if (totalRoll == 12){
			numTwelve = numTwelve + 1;
		}
		System.out.println("The exact roll for dice roll number " + (num + 1) + " is " + totalRoll + " (" + diceRollerOne + "+" + diceRollerTwo + ")");
			}
			
		//Print statistics on dice rolls
		System.out.println("Here are the dice roll statistics:");
		System.out.println("The number of twos that you rolled is " + numTwo);
		System.out.println("The number of threes that you rolled is " + numThree);
		System.out.println("The number of fours that you rolled is " + numFour);
		System.out.println("The number of fives that you rolled is " + numFive);
		System.out.println("The number of sixes that you rolled is " + numSix);
		System.out.println("The number of sevens that you rolled is " + numSeven);
		System.out.println("The number of eights that you rolled is " + numEight);
		System.out.println("The number of nines that you rolled is " + numNine);
		System.out.println("The number of tens that you rolled is " + numTen);
		System.out.println("The number of elevens that you rolled is " + numEleven);
		System.out.println("The number of twelves that you rolled is " + numTwelve);
		System.out.println("Here is the dice roll histogram:");
		System.out.println("Times 2 is rolled:");
		System.out.println("Times 3 is rolled:");
		System.out.println("Times 4 is rolled:");
		System.out.println("Times 5 is rolled:");
		System.out.println("Times 6 is rolled:");
		System.out.println("Times 7 is rolled:");
		System.out.println("Times 8 is rolled:");
		System.out.println("Times 9 is rolled:");
		System.out.println("Times 10 is rolled:");
		System.out.println("Times 11 is rolled:");
		System.out.println("Times 12 is rolled:");
		}
		else{
			System.out.println("The amount of rolls is insufficient. PLEASE TRY AGAIN LATER.");
		}
	}
}
