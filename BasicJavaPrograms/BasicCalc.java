import java.util.Scanner;

public class BasicCalc {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int no1,no2,result=0,ch;
		
		System.out.println("Enter no1:");
		no1 = scan.nextInt(); //getting the first number
		
		System.out.println("Enter no2:");
		no2 = scan.nextInt(); //getting the second number
		
		int cnt = 5;
		
		do{
			//displaying the Menu
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulous");
			
			System.out.println("Enter your choice:");
			ch = scan.nextInt(); //accepting the choice
			
			//switch case for calculating the numbers
			switch(ch){			
				case 1:
					result = add(no1,no2); //calling the add function
					System.out.println(result);
					break;
				case 2:
					result = sub(no1,no2); //calling the sub function
					System.out.println(result);
					break;
				case 3:
					result = mul(no1,no2); //calling the mul function
					System.out.println(result);
					break;
				case 4:
					result = div(no1,no2); //calling the div function
					System.out.println(result);
					break;
				case 5:
					result = mod(no1,no2); //calling the mod function
					System.out.println(result);
					break;
			}
			cnt--; //decrementing the counter
		}while(cnt>0); //running while loop 5 times
		
		scan.close(); //closing the scanner
	}
		
	//function to add the numbers
	public static int add(int no1,int no2){
		return (no1+no2);
	}
	
	//function to sub the numbers
	public static int sub(int no1,int no2){
		//System.out.println(abcd);
		return (no1-no2);
	}
	
	//function to mul the numbers
	public static int mul(int no1,int no2){
		return (no1*no2);
	}
	
	//function to div the numbers
	public static int div(int no1,int no2){
		return (no1/no2);
	}
	
	//function to mod the numbers
	public static int mod(int no1,int no2){
		return (no1%no2);
	}
}
