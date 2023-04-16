package JAVA_120_problems;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayRotaion {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		int k = 1;
		
		Integer[] array = Stream.concat(IntStream.rangeClosed(1, arr.length).skip(k+1).boxed(),
				IntStream.rangeClosed(1, arr.length).limit(k+1).boxed()).toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(array));
	}

}
