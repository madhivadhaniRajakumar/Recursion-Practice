package Recursion;

import java.util.*;

public class SwapingArray {
	 static int [] a= new int[] {1,2,3,4,5};
	 static int n = a.length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapingArray ar = new SwapingArray();
		ar.reverse(0);
//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]);
//		}
		System.out.println(Arrays.toString(a));
	}
	public void reverse(int i) {
		if(i>n/2) {
			return;
		}
		int tem = a[n-i-1];
		a[n-i-1] = a[i];
		a[i]=tem;
		
		reverse(i+1);
		
	}

}
