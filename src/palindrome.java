import java.util.*;
public class palindrome {
	
	static boolean isPalindrome(String str) {
		int a = 0;
		int b = str.length() - 1;
		while (b > a) {
			if (str.charAt(a++) != str.charAt(b--)) {
				return false;
			}
		} return true;
	}
	
	static ArrayList<String> PalindromeStrings(String []arr, int c) {
		ArrayList<String >ans = new ArrayList<String>();
		for (int i = 0; i < c; i++) {
			if (isPalindrome(arr[i])) {
				ans.add(arr[i]);
			}
		} return ans;
	}
	
	
	public static void main(String[] args) {
		
		String [] palin = {"POP","NOON","BABE","ANNA","SANDWISH"};
		int c = palin.length;
		ArrayList<String> d = PalindromeStrings(palin, c);
		if (d.size() == 0)
			System.out.println("-1");
		for (String st : d)
			System.out.println(d + " ");
		
		

	}

}
