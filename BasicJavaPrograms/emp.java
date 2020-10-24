import java.util.Scanner;

public class emp {

	//variables
	int empId;
	String empName;
	float empSalary;
	
	//employee constructor
	public emp(){
		empId=0;
		empName=null;
		empSalary=0.0f;				
	}
	
	//parameterised constructor
	public emp(int empId, String empName, float empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;				
	}
	
	//method to get the data
	public void getdata(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		empId=sc.nextInt();
		
		System.out.println("Enter the Employee Name:");
		empName=sc.next();
		
		System.out.println("Enter the Employee Salary:");
		empSalary=sc.nextFloat();
	}
	
	//method to display the data
	public void dispaly(){
		System.out.println("The Employee ID is:"+empId);
		System.out.println("The Employee Name is:"+empName);
		System.out.println("The Employee Salary is:"+empSalary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1,e2;
		
		e1 = new emp(); //creating emp class object
		e1.getdata(); //calling the getdata function
		e1.dispaly(); //displaying the entered details
		
		e2 = new emp(); //creating emp class another object
		//assigning the values to the variables
		e2.empId=78;
		e2.empName="Jhon";
		e2.empSalary=350000.88f;
		e2.dispaly(); //displaying the details
	}
}
