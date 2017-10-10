import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int[] userTries = new int[10]; // Number of tries user has (10)
		int numTries = 0;
		int userNum;
		double score;
		Random num = new Random();
		int comNum = num.nextInt(20);
		System.out.println("Welcome to the guessing name!\nIn this game you will guess a number in the given range until you type\nwhat the computer is thinking.");
		System.out.println("Type in an integer between 0 and 20");
		userNum = userInput.nextInt();
		int i = 0;
		while(userNum != comNum) {	
			if(userNum > comNum) {
				printText("Too high! Try again");
				userNum = userInput.nextInt();
				numTries++;
			}
			else if(userNum < comNum) {
				printText("Too low. Try Again");
				userNum = userInput.nextInt();
				numTries++;
			}
			
		}
		score = (userTries.length-numTries) * 10; // Calculates score based on users amount of attempts and maximum tries
		for(int j = 0; j < userTries.length; j++) {
		userTries[i] = userNum;
			if (numTries == userTries.length + 1 && userNum == comNum) {
				score += 0.5;
			}
			if(numTries == userTries.length) {
				printText("GAME OVER. You ran out of tries. The number was " + comNum);
				System.exit(0);
			}
		}
		
		if(userNum == comNum) {
			printText("You win!");
			printText("You guessed the number in " + numTries + " tries.");
			printText("Your score is: " + score);
			System.exit(0);
		}
		userInput.close();
	}
	public static void printText(String message) {
		System.out.println(message);
	}
}
