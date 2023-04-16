package StreamsComplete;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapOperations {

	public static void main(String[] args) {

		//.map allows us to take one operation type and transforms it to another.
		//.map(Person::map)
		
		Set<Integer> set = new HashSet<>(Arrays.asList(9,5,3,2,8,4,3,0,7,1,3,2,5,8));
		
		List<Integer> collect = set.stream().collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
