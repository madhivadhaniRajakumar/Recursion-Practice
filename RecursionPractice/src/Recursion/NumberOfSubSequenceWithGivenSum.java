package Recursion;

public class NumberOfSubSequenceWithGivenSum {
	
	static int [] a = new int[] {1,2,3,1,1};
    int n = a.length;
    int k =3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfSubSequenceWithGivenSum nm = new NumberOfSubSequenceWithGivenSum();
		System.out.println(nm.noOfSubSq(0, a, 0));
		
	}
	
	public int noOfSubSq(int i,int [] a, int sum) {
		if(i==n) {
			if(sum==k) {
				return 1;
			}
			return 0;
		}
		sum = sum+a[i];
		int l = noOfSubSq(i+1, a, sum);
		
		sum = sum- a[i];
		int r = noOfSubSq(i+1, a, sum);
		
		return l+r;
	}

}
