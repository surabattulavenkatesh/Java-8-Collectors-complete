package Collectors;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest1 {

	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("SpringBoot", "Framework", 97, 18000), new Course("API", "Micorservices", 92, 14000),
				new Course("MicroServices", "Micorservices", 90, 20000),
				new Course("Full Stack", "Full stack", 99, 17000), new Course("Azure", "Cloud", 93, 19000),
				new Course("Aws", "Cloud", 96, 20000));

		System.out.println(courses.stream().map(i -> i.getName()).collect(Collectors.joining(",:")));
		System.out.println(courses.stream().collect(Collectors.partitioningBy(i -> i.getReviewScrorer() > 95)));
		System.out.println(courses.stream()
				.collect(Collectors.partitioningBy(i -> i.getReviewScrorer() > 95, Collectors.counting())));

		System.out.println(courses.stream().collect(
				Collectors.groupingBy(i -> i.getName())));
		System.out.println(courses.stream().collect(
				Collectors.groupingBy(i -> i.getName(), Collectors.counting())));

		System.out.println(courses.stream().collect(
				Collectors.groupingBy(i -> i.getName(), 
						Collectors.mapping(i -> i.getReviewScrorer(), Collectors.toList()))));
	}

}
