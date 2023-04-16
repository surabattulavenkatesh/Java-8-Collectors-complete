package Collectors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class collectorsDemo {

	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("SpringBoot", "Framework", 97, 18000), new Course("API", "Micorservices", 92, 14000),
				new Course("MicroServices", "Micorservices", 90, 20000),
				new Course("Full Stack", "Full stack", 99, 17000), new Course("Azure", "Cloud", 93, 19000),
				new Course("Aws", "Cloud", 96, 20000));

		String courseFirstNameJoined = courses.stream().map(i -> i.getName()).collect(Collectors.joining(","));

		System.out.println("joining Course names : " + courseFirstNameJoined);

		// split review scorer partioning

		Map<Boolean, List<Course>> partionedMap = courses.stream()
				.collect(Collectors.partitioningBy(i -> i.getReviewScrorer() > 95));

		System.out.println(partionedMap);

		Map<Boolean, Long> partionedMapCounting = courses.stream()
				.collect(Collectors.partitioningBy(i -> i.getReviewScrorer() > 95, Collectors.counting()));

		System.out.println("Partioning count : "+partionedMapCounting);

		Map<String, List<Course>> groupingByCourse = courses.stream().collect(Collectors.groupingBy(Course::getName));
		System.out.println(groupingByCourse);

		Map<String, Long> groupingByCourseCount = courses.stream()
				.collect(Collectors.groupingBy(Course::getName, Collectors.counting()));

		System.out.println("grouping and counting: "+groupingByCourseCount);

		// Mappping(Extracting indivial val(like name)

		Map<String, List<Integer>> groupingByNameAndMappingByScore = courses.stream().collect(Collectors
				.groupingBy(Course::getName, Collectors.mapping(Course::getReviewScrorer, Collectors.toList())));

		System.out.println("Name and Score : "+groupingByNameAndMappingByScore);

		// group by Course dept by summing their review Score

		Map<String, Optional<Integer>> sumOfReviewScoreByDept = courses.stream().collect(Collectors.groupingBy(
				Course::getName, Collectors.mapping(Course::getReviewScrorer, Collectors.reducing(Integer::sum))));

		System.out.println(sumOfReviewScoreByDept);

		Map<String, Integer> sumOfReviewScoreByDeptUsingSumming = courses.stream()
				.collect(Collectors.groupingBy(Course::getName, Collectors.summingInt(i -> i.getReviewScrorer())));

		System.out.println(sumOfReviewScoreByDeptUsingSumming);

		// group the course by course name and summarize by their review score
		Map<String, IntSummaryStatistics> groupingByNameAndReviewScore = courses.stream()
				.collect(Collectors.groupingBy(Course::getName, Collectors.summarizingInt(Course::getReviewScrorer)));

		System.out.println(groupingByNameAndReviewScore);

		// Filtering to specific department

		IntSummaryStatistics groupingByNameAndReviewScoreGettingFiltered = courses.stream().collect(Collectors
				.filtering(i -> i.getName().equals("AZURE"), Collectors.summarizingInt(Course::getNoOfStudent)));

		System.out.println(groupingByNameAndReviewScoreGettingFiltered);

		// Course with highest review scorer

		Optional<Course> highesNoOfStudents = courses.stream().collect(Collectors.maxBy((i,j)->i.getNoOfStudent()-j.getNoOfStudent()));
		
		System.out.println(highesNoOfStudents.get());
		
		Optional<Course> lowestNoOfStudents = courses.stream().collect(Collectors.minBy(Comparator.comparing(Course::getNoOfStudent)));
		System.out.println(lowestNoOfStudents.get());
		
		//get the employee with highest salary
		
		String nameOfHighestReviewScore = courses.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Course::getReviewScrorer)), i->i.map(c->c.getName()).orElse("courseFirstNameJoined")));
		
		String nameOfThirdHighestReviewScore = courses.stream().sorted(Comparator.
				comparing(Course::getReviewScrorer).reversed()).skip(2).map(i->i.getName()).findFirst().get();
		System.out.println("third hIghest reviwe score name : "+nameOfThirdHighestReviewScore);
		System.out.println(nameOfHighestReviewScore);
		
		//flatMapping by courseName
		
//		Map<String, List<Object>> courseMap = courses.stream().collect(Collectors.groupingBy(Course::getName,
//				Collectors.flatMapping(i->i.getReviewScrorer(), Collectors.toList())));
	}

}
