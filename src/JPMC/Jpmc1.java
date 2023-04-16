package JPMC;

public class Jpmc1 {

	StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {

		String str = "my name is nitin and i can speak malayalam";
		
		String[] s1  = str.split(" ");
		for(String i : s1) {
			
			if(isPalindrome(i)) {
				
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPalindrome(String str) {
		
		String rev = new StringBuilder(str).reverse().toString();
		
		return str.equals(rev);
		
	}

}
