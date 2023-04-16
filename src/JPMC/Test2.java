package JPMC;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,5);
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		
		int total = list1.stream().reduce(0, (i,j)->i+j);
		
		int val = list.stream().reduce(0, Integer::sum);
		
		System.out.println(total-val);
	}

}
