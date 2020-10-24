//package varLenArga;

public class VariableLengthArgs {
	public static void main(String[] args) {
		System.out.println(average(43,65,65,48,5,45)); //getting and printing the average of the numbers
	}
	
	//function to calculate the average of the numbers
	public static int average(int...numbers){
		int total = 0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length; //returning the average
	}
}
