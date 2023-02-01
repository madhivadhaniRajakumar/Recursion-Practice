package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subSequenceArray {

	static int []arr = new int[] {1,2,3,1,5};
	static int n = arr.length;
	static List<Integer> l = new ArrayList<>();
	List<List<Integer>> ls = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subSequenceArray sq = new subSequenceArray();
		sq.subSequence(0, l,arr,n);
	}
	
	public void subSequence(int i ,List<Integer> l,int arr[] , int n ) {
		if(i==n) {
			System.out.println(l);
			return;
		}
		l.add(arr[i]);
		subSequence(i+1,l,arr,n);
		l.remove(l.size()-1);
		subSequence(i+1, l,arr,n);
		
	}

}
