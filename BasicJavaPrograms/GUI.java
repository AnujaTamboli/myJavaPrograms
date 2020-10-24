//package graphicalUserInterface;

import javax.swing.JOptionPane;

public class GUI {
	public static void main(String[] args) {
		
		//JOptionPane is used to get the window in java
		//accepting numbers to add using JOptions pane
		String fn = JOptionPane.showInputDialog("Enter first number: ");
		String sn = JOptionPane.showInputDialog("Enter second number:");
		
		//converting the numbers to integers
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		//displaying the added answer using the JOptionsPane
		JOptionPane.showMessageDialog(null,"The answer is: "+sum,"the title",JOptionPane.PLAIN_MESSAGE);
	}
}