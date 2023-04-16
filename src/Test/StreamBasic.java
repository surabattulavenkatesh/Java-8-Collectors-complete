package Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasic {

	public static void main(String[] args) {

		Map<String, Long> updatedMap = Stream.of("aabbbccddd".split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for (Map.Entry<String, Long> i : updatedMap.entrySet()) {
			System.out.print(i.getKey()+ " : "+i.getValue());
		}
	}

}
