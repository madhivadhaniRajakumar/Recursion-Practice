package Recursion;

public class PrintLinearlyform1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintLinearlyform1toN p = new PrintLinearlyform1toN();
		p.printLinear(5, 5);

	}
	public void printLinear(int i,int n) {
		if(i==0) {
			return ;
		}
		System.out.print(i);
		printLinear(i-1, n);
	}

}
