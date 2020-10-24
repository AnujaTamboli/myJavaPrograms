import java.util.Scanner;

public class intPalindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //getting the int sequence to check
        System.out.println("Enter the interger sequence: ");
        int original  = scan.nextInt();
        int num = original;
        int reverse=0;
        
        //creating the reverse of the sequence
        while (original != 0) {
            int remainder = original % 10;
            reverse = reverse * 10 + remainder;
            original /= 10;
        } 

        //if reverse matches the original number then print palindrome else print not palindrome
        if(num == reverse) {
            System.out.println("The Sequence entered is a Palindrome!");
        } else{
            System.out.println("The Sequence entered is Not a Palindrome!");
        }

        scan.close(); //closing the scanner
    }
}