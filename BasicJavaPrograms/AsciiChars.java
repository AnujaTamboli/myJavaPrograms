public class AsciiChars {
	public static void main(String[] args) {
		
		for(int i=0; i < 255; i++) {
			System.out.print(i);
			System.out.print(" "+(char)i); //printing the ascii number of the character
			
			if(i % 8 == 7) {
				System.out.println("\n"); //printing the space
			} else {
				System.out.println("\t");
			}
		}
	}
}
