//package randomNumGenerator;

import java.util.Random; 

public class RandomNumGeneratorProg {
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		//generating 10 random numbers from 1-100
		for(int counter = 1; counter <= 10;counter++){
			number = 1+dice.nextInt(100); //getting the random number
			System.out.println(number+" "); //printing the random number
		}
	}
}