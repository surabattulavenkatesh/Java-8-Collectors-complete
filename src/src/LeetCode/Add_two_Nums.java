package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add_two_Nums {

	/*
	Input: l1 = [2,4,3], l2 = [5,6,4]
			Output: [7,0,8]
			Explanation: 342 + 465 = 807.
	*/
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2,4,3);
		List<Integer> list2 = Arrays.asList(5,6,4);
		String str1 = list1.stream().map(i->i.toString()).map(i->new StringBuilder(i).reverse().toString()).collect(Collectors.joining());
		String str2 = list2.stream().map(i->i.toString()).map(i->new StringBuilder(i).reverse().toString()).collect(Collectors.joining());
		Integer total = Integer.valueOf(str1)+Integer.valueOf(str2);
		String val = String.valueOf(total);
		String val1 = Stream.of(val).map(i->new StringBuilder(i).reverse().toString()).collect(Collectors.joining());
		String[] arrval = val1.split("");
		System.out.println(Arrays.asList(arrval));
		
	}

}
