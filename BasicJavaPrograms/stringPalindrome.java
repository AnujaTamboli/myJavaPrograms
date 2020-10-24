import java.util.Scanner;

public class stringPalindrome{
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //decaring variables to store the strings
        String original, reverse = "";

        System.out.println("Enter the String you want to reverse: ");
        original = scan.nextLine(); //get the string form the user

        int length = original.length(); //calculating the lenght of the string
            
        //iterating over each character in the string and 
        //storing the characters in another variable in reverse order
        for (int i =  length-1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {//if original and reversed string matches then its a palindrome
            System.out.println("The String is a Palindrome!"); //if the string is palindrome
        } else{
            System.out.println("The String is Not a Palindrome!"); //if not matches print not a palindrome
        }

        scan.close(); //closing the scanner
    }    
}    