import java.util.Scanner;

public class fibo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int var1 = 0, var2 = 1, var3 = 0, cntr=1;

		//getting the number
		System.out.print("Enter the limit: ");
		int num = scan.nextInt();

		System.out.println("The Fibonaci Series is: ");
		
		//printing the first value
		System.out.print(var2+"\t");
		
		//iterating the 
		while(cntr < num) {
			var3 = var1 + var2; //adding the two consecutive values to generate the next value
			var1=var2; //swapping the values
			var2=var3;
			System.out.print(var3+"\t"); //printing the generated value
			cntr++; //incrementing the counter
		}		

		scan.close(); //closing the scanner
	}
}