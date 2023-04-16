package JPMC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java83Years {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(21,32,45,34,12,10,19);
		
		System.out.println(
		numbers.stream().map(i->i.toString()).filter
		(i->i.startsWith("1")).sorted().collect(Collectors.toList()));
	}

}
