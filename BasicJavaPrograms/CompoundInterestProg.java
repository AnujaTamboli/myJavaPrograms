public class CompoundInterestProg {
	public static void main(String[] args) {
		double amount,principal = 10000,rate = 7;
		
		//calculating the compound interest
		for(int yr = 1;yr <= 20;yr++) {
			amount = principal*Math.pow(1 + rate, yr);
			System.out.println(yr+":  "+amount); //printing the interest calculated
		}
	}
}
