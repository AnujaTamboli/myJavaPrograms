public class MultiDimArrat {
	public static void main(String[] args) {
		int farray[][] = {{25,65,45,66},{85,33,45,96}};
		int sarray[][] = {{6,22,56,147},{5,63},{12,35,56}};
		
		display(farray); //calling the function to display farray
		System.out.println();
		display(sarray); //calling the function to display sarray
	}
	
	//function to display the array
	public static void display(int x[][]){
		for(int row = 0;row < x.length;row++){
			for(int column = 0;column < x[row].length;column++){
				System.out.print(x[row][column]+"\t"); //printing the array elements
			}
			System.out.println(); //printing next line
		}
	}
}
