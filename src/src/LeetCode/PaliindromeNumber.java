package LeetCode;

public class PaliindromeNumber {

	public static void main(String[] args) {

		int num = 121;
		String rev = new StringBuilder(String.valueOf(num)).reverse().toString();
		int num1 = Integer.valueOf(rev);
		
		if(num==num1) {
			System.out.println("yes it is a palindrome");
		}else {
			System.out.println("Nope it is not");
		}
		
	}

}
