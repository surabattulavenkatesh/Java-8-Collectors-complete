package JPMC;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseStringusingStreams {

	public static void main(String[] args) {
		
		String str = "This is my home";
		String[] split = str.split(" ");
		String[] reversedArr = IntStream.rangeClosed(1, split.length)
			    .mapToObj(i -> split[split.length - i])
			    .toArray(i-> new String[i]);
		
		System.out.println(Arrays.toString(reversedArr));
	}

}
