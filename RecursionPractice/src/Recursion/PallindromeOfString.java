package Recursion;

public class PallindromeOfString {
   static String s = "goodday";
   static int n = s.length();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] ch = s.toLowerCase().toCharArray();
		PallindromeOfString p = new PallindromeOfString();
		System.out.println(p.isPalindrom(0, ch));
		

	}
	public boolean isPalindrom(int i,char [] ch) {
		if(i>n/2)
			return true;
		if(ch[i]!=ch[n-i-1]) {
			return false;
		}
		return isPalindrom(i+1, ch);
	}

}
