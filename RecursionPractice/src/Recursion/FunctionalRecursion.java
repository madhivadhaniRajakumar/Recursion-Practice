package Recursion;

public class FunctionalRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalRecursion f = new FunctionalRecursion();
		System.out.println(f.sumOfNNumbers(3));
		System.out.println(f.factorial(4));
	}
	
	public int sumOfNNumbers(int n) {
		if(n==0) {
			return 0;
		}
		
		return n+ sumOfNNumbers(n-1);
	}
	public int factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		return n* factorial(n-1);
	}

}
