import java.util.Scanner;

public class Average {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		int total=0, grade, average, cnt=0;
		
		System.out.print("Enter 10 numbers: ");

		//accepting the grades and calculating the total 
		while(cnt < 10){
			grade = input.nextInt();
			total += grade;
			cnt++;
		}
		
		average = total/10; //dividing the number by 10
		System.out.println("Your average is: "+average); //printing the average

		input.close(); //closing the input
	}
}