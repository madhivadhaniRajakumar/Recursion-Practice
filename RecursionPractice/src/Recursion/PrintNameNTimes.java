package Recursion;

public class PrintNameNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printName(0,5);

	}
    public static void printName(int i,int n) {
    	if(i==n) {
    		return;
    	}
    	System.out.println("Madhi");
    	printName(i+1,n);
    }
}
