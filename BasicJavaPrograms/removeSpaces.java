import java.util.Scanner;

public class removeSpaces { 

    //function to remove spaces from the string
    static String rmSpace(String str) {     
        return (str.replaceAll("\\s","")); //replace all method replaces all the instances of a string with the given value
    } 
    public static void main(String args[]) { 
        java.util.Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string:");         
        String str = scan.nextLine(); //getting the string

        System.out.println(rmSpace(str)); //printing the output

        scan.close(); //closing the scanner
    } 
}