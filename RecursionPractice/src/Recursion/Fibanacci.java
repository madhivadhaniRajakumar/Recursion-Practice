package Recursion;

public class Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibanacci f = new Fibanacci();
		System.out.println(f.fibanacciValue(4));

	}
	public int fibanacciValue(int n) {
		if(n<=1) {
			return n;
		}
		return fibanacciValue(n-1)+ fibanacciValue(n-2)+fibanacciValue(n-3);
	}

}
