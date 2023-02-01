package Recursion;

public class BackTrackingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackTrackingBasic b = new BackTrackingBasic();
		b.print(3,3);
		System.out.println();
		b.printNto1(1, 3);

	}
	public void print(int i,int n) {
		if(i==0) {
			return;
		}
		print(i-1,n);
		System.out.print(i);
	}

	public void printNto1(int i,int n) {
		if(i>n) {
			return;
		}
		printNto1(i+1, n);
		System.out.print(i);
	}
}
