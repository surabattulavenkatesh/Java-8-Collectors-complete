package JPMC;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dupValuesInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,4,3,9,5,4,2,6,4,5,3,2);
		
		Set<Integer> set = new HashSet<>();
		System.out.println(
		list.stream().filter(i->!set.add(i)).distinct().sorted().collect(Collectors.toList()));
	}

}
