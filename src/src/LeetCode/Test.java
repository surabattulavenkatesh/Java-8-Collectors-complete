package LeetCode;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Predicate<Integer> pred = i->{
			
			int armSum = 0, temp = i;
			while(temp>0) {
				
				armSum = (int) (armSum+ exponent(temp%10, String.valueOf(i).length()));
				temp=temp/10;
				
			}
			return armSum == i;
		};
		List<Integer> check = Stream.of(407).filter(pred).collect(Collectors.toList());
		if(!check.isEmpty()) {
			System.out.println("yes it is an armstrong number");
		}else {
			System.out.println("Nope it's not an Armstromg Number");
		}
	}
	public static int exponent(int base, int exponent) {
	    int result = 1;
	    while (exponent != 0) {
	      result = result* base;
	      exponent--;
	    }
	    return result;
	}
}
