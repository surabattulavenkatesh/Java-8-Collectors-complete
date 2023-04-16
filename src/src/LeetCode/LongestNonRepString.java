package LeetCode;

import java.util.HashSet;
import java.util.Set;
public class LongestNonRepString {

	/*
	 * Input: s = "abcabcbb"
		Output: 3
		Explanation: The answer is "abc", with the length of 3.
	 */
	public static void main(String[] args) {
		
		String str = "abcdabcbb";
		String longestTillNow = "";
		String finalLongest = "";
		Set<Character> set = new HashSet<>();
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(set.contains(ch)) 
			{	
				longestTillNow = "";
				set.clear();
			}
			set.add(ch);
			longestTillNow+=ch;
			if(longestTillNow.length()>finalLongest.length()) {
				finalLongest = longestTillNow;
			}
		}
		System.out.println(finalLongest);

	}

}
