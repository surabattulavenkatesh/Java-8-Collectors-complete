package JPMC;

public class ReverseNumberJava8 {

	public static void main(String[] args) {

		int num = 76349;
		
		int digit = 0;
		int remainder = 0;
		while(num!= 0) {
			
			remainder = num%10;
			digit = digit * 10 + remainder;
			num = num/10;
		}
		System.out.println(digit);
		Integer reverse = Integer.parseInt(new StringBuilder("76349").reverse().toString());
		System.out.println(reverse);
	}

}
