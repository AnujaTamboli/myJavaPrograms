//child class boxOne
class boxOne{
	//variables of the child class
	double width;
	double height;
	double depth;
}

//parent class Box
public class Box{
	public static void main(String[] args){
		boxOne mybox = new boxOne(); //creating the object for the class boxOne
		double vol; 

		//assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		//compute the volum of the box
		vol = mybox.width * mybox.height * mybox.depth;

		//printing the output
		System.out.println("Volume is: " + vol);
		
	}
}