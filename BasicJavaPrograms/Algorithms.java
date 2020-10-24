import java.util.Random;
import java.util.Scanner;

public class Algorithms {
    public static void main(String[] args) {
        Random rand = new Random();
		int numberToGuess = rand.nextInt(1000); //generating a ranodm number to guess
		int numberOfTries = 0;
		
		Scanner input = new Scanner(System.in);
		int guess;
		boolean win = false;
		
		System.out.println("You have 15 guesses...! All the Best!");

		//iterating 10 times
		while (numberOfTries < 10) {			
			System.out.println("Guess a number between 1 to 1000: ");
			guess = input.nextInt(); //getting the guessed number
			numberOfTries++; //incrementing the number of tries
			
			if (guess == numberToGuess) {
				win = true; //if the correct number is guessed
			} else if (guess < numberToGuess) {
				System.out.println("Your Guess is too low...Try again!");
			} else if (guess > numberToGuess) {
				System.out.println("Your Guess is too High...Try again!");
			}
		}
		
		//showing the result
		if (win == true) {
			System.out.println("You Win!!!!");
		} else {
			System.out.println("Ohh! you finished with your tries...");
		}

		System.out.println("The number was " + numberToGuess);
		System.out.println("It took you " + numberOfTries + "tries");	
    }   
}
