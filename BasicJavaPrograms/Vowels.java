import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		char getchar;
		
		System.out.println("Enter a character:");
		getchar=sc.next().charAt(0);
		
		if(getchar=='a' || getchar=='e' || getchar=='i' || getchar=='o' || getchar=='u') {
			System.out.println("The character entered is a Vowel!"); //print if the character entered is a vowel
		} else if(getchar=='A' || getchar=='E' || getchar=='I' || getchar=='O' || getchar=='U') {
			System.out.println("The character entered is a Vowel!"); //print if the character entered is a consonent
		} else {
			System.out.println("The character entered is NOT a Vowel!"); //print if the character entered is not a vowel nor a consonent
		}
	}
}