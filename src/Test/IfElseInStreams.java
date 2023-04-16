package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IfElseInStreams {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		Arrays.asList(-1, 1, -2, 3, 4, -5, 6, 0).stream()
	    .forEach(i->{
	    	
	    	if(i>0) {
	    		nums.add(i);
	    	}
	    });
		
		nums.forEach(System.out::println);
	}

}
