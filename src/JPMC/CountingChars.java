package JPMC;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingChars {

	public static void main(String[] args) {

		String str = "VenVkatesh";
		//find the first non repeated element in a string
		System.out.println(
		str.chars().mapToObj(i-> Character.toLowerCase(Character.valueOf((char)i)))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		System.out.println(
				str.chars().mapToObj(i-> Character.toLowerCase(Character.valueOf((char)i)))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
				entrySet().stream().filter(i->i.getValue()==1L).findFirst().get()
				);
		
		Set<Character> set = new HashSet<Character>();
		System.out.println(
				str.chars().mapToObj(i->Character.
						toLowerCase(Character.valueOf((char)i))).filter(i->set.add(i)).findFirst()
				);
	}

}
