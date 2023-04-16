package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromesubString {

	/*
	 * Input: s = "babad"
		Output: "bab"
		Explanation: "aba" is also a valid answer.
	 */
	static List<String> strList = new ArrayList<>();
	public static void main(String[] args) {

		String str = "fabad";
		
		for(int i = 0; i<=str.length(); i++) {
			for(int j = i+1; j<=str.length(); j++) {
				String subString = str.substring(i,j);
				if(isPalindrome(subString)) {
					strList.add(subString);
				}
			}
		}
		
		String longestPalindrome = strList.stream().max((i,j)->i.length()-j.length()).get();
		System.out.println(longestPalindrome);
	}

	private static boolean isPalindrome(String str) {

		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	

}
