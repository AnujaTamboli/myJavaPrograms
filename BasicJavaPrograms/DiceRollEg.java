//package diceRoll;

import java.util.Random;

public class DiceRollEg {
	public static void main(String[] args) {
		Random rand =  new Random();
		int freq[] = new int[7];
		
		//calculating the frequencies of each dice number
		for(int roll = 1; roll < 1000; roll++) {
			++freq[1+rand.nextInt(6)];
		}
		
		//printing the caculated frequencies
		System.out.println("The frequencies of the dice numbers if rolled 999 times are: ");

		for(int face = 1; face < freq.length; face++) {
			System.out.println(face+"\t"+freq[face]);
		}
	}
}