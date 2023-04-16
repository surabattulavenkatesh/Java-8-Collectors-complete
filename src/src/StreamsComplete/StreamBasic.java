package StreamsComplete;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBasic {

	public static void main(String[] args) {

		//IntStream.iterate(1, i->i+1).limit(10).filter(i->i%2==0).forEach(System.out::println);
		
		//min & max
		List<Integer> list = Arrays.asList(7,8,1,4,5,2,6,4,8,3,4,99);
		
		List<Integer> copyof = Collections.unmodifiableList(list);
		System.out.println(
		list.stream().min((i,j)->i>j ? 1 : -1).get());
		
		Integer x = list.stream().max((i,j)->i>j ? 1 : -1).get();
		System.out.println(x);
		
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		
		OptionalInt min = IntStream.rangeClosed(1, 100).max();
		System.out.println(min);
		
		//convert 
		double sum = collect.stream().mapToInt(Integer::intValue).average().orElse(50);
		System.out.println(sum);
		
		IntSummaryStatistics summaryStatistics = collect.stream().mapToInt(Integer::intValue).summaryStatistics();
		
		System.out.println(summaryStatistics);
		
	}

}
