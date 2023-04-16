package LeetCode;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Integer num = 9474;
	    Integer pow = String.valueOf(num).length();
	    int power = IntStream.iterate(num, i->i / 10).limit(pow).
		    	map(i -> (int) Math.pow(i % 10, pow)).sum();
	    		
	    System.out.println(power);
	    if(num==power) {
	    	System.out.println("Yes! it an Armstrong");
	    }else {
	    	System.out.println("Nope! it is not");
	    }
	    
	    Predicate pred = (i)->{
	    	Integer temp = (Integer) i;
			Integer armSum=0;
			int len = String.valueOf(temp).length();
	    	while(temp>0) {
	    		armSum = (int) (armSum+ Math.pow(temp%10, len));
	    		temp /=10;
	    	}
	    	return armSum == i;
	    	
	    };
//	    System.out.println(
//	    IntStream.range(10, 10000).filter(pred).boxed().collect(Collectors.toList()));
	    
	}
}
