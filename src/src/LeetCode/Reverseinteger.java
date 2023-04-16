package src.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Reverseinteger {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1, 100).sum();
		List<Integer> nums = Arrays.asList(2,3,4,5,6,7,9,1,8,4);
		
		int sum2 = nums.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum-sum2);
	}

}
