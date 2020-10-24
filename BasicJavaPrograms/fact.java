import java.util.Scanner;

public class fact{
    public static int factorial(int num) {
        if(num == 0) {
            return 1; //returing value "1" when the num becomes "0"
        }
        return num * factorial(num-1); //recursive function call
    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
 
        System.out.println("Enter the number for which factorial you want to find: ");
        int num = scan.nextInt(); //acceting the number

        int result = factorial(num); //calling the function to calculate the factorial
        System.out.println("The Factorail of " + num + " is " + result); //printing the result

        scan.close(); //closing the scanner
    }
}