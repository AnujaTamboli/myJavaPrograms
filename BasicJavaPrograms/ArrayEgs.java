import java.util.Scanner;

public class ArrayEgs {
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Scanner input = new Scanner(System.in);
		
		//getting the array elements
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = input.nextInt();
		}
		
		//displaying the entered elements
		System.out.println("The array Entered is: ");
		for(int x: arr)
			System.out.print(x+"\t");
		
		input.close();
	}
}
