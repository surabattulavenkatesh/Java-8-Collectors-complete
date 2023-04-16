package JPMC;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JPMC2 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Heello","Hii","","happy","");
		
		list.stream().filter(i->!i.isEmpty()).forEach(System.out::println);
		
		Integer[] arr = {1,2,3,4,5};
		
		Object list1 = Arrays.stream(arr).collect(Collectors.
				collectingAndThen(Collectors.toList(), i->{
					
					Collections.reverse(i);
					return i;
				}));

		System.out.println(list1);
		
		Integer[] reversedArr = IntStream.range(0, arr.length).
				mapToObj(i->arr[arr.length-1-i]).toArray(i->new Integer[i]);
		
		System.out.println(Arrays.toString(reversedArr));
		
	}

}
