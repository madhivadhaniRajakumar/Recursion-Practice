package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubSequencesSumIsK {
  static int [] a = new int[] {1,2,3,1,5};
  int n = a.length;
  int k =6;
  List<Integer> ls = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintingSubSequencesSumIsK p = new PrintingSubSequencesSumIsK();
		p.subSeq(0, a, 0);

	}
	
	public void subSeq(int i, int arr[],int sum) {
		if(i==n) {
			if(sum==k) {
				System.out.println(ls);
				//System.out.println(sum);
				//System.out.println(k);
			}
			return;
		}
		ls.add(arr[i]);
		sum=sum+arr[i];
		subSeq(i+1, arr, sum);
		
		ls.remove(ls.size()-1);
		sum = sum-arr[i];
		subSeq(i+1, arr, sum);
	}

}
