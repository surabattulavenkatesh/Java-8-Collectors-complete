package Collectors;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsTest {

	public static void main(String[] args) {
		/*
		 * courseFirstNameJoined
		 * (partionedMap)
		 * partionedMapCounting
		 * groupingByCourse
		 * groupingByCourseCount-->Individual courseName count
		 * Mappping(Extracting indivial val(like name)
		 * group by Course dept by summing their review Score
		 * sumOfReviewScoreByDeptUsingSumming)
		 * groupingByNameAndReviewScore
		 * // Filtering to specific department
		 * // Course with highest review scorer
		 * lowestNoOfStudents.get()
		 * //get the employee with highest salary
		 * //flatMapping by courseName
		 */
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("SpringBoot", "Framework", 97, 18000), new Course("API", "Micorservices", 92, 14000),
				new Course("MicroServices", "Micorservices", 90, 20000),
				new Course("Full Stack", "Full stack", 99, 17000), new Course("Azure", "Cloud", 93, 19000),
				new Course("Aws", "Cloud", 96, 20000));
		
		
		
		System.out.println();
		//Joining
		System.out.println(
				courses.stream().map(i->i.getName()).collect(Collectors.joining(",")));
		
		//partioning
		System.out.println(
				courses.stream().collect(Collectors.partitioningBy(i->i.getReviewScrorer()>95)));
		System.out.println(
				courses.stream().collect(Collectors.partitioningBy(i->i.getReviewScrorer()>95,Collectors.counting())));
		
		//groupingBy
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getName)));
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getName, Collectors.counting())));
		
		//mapping inside grouping
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getReviewScrorer, 
						Collectors.mapping(i->i.getName(), Collectors.toList()))));
		//grouping and Summing
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getName, Collectors.summingInt(i->i.getReviewScrorer()))));

		//group by Course dept by summing their review Score
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getName, Collectors.mapping(Course::getReviewScrorer, 
						Collectors.reducing(Integer::sum)))));
		//sumOfReviewScoreByDeptUsingSumming
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getName, Collectors.summarizingInt(Course::getReviewScrorer))));
		
		// Filtering to specific department
		System.out.println(
				courses.stream().collect(Collectors.filtering(i->i.getCategory().equalsIgnoreCase("framework"), 
						Collectors.summarizingInt(Course::getReviewScrorer))));
		
		System.out.println(
				courses.stream().collect(Collectors.maxBy(Comparator.comparing(Course::getReviewScrorer))));
		
		System.out.println(
				courses.stream().collect(Collectors.minBy((i,j)->i.getReviewScrorer() - j.getReviewScrorer())));
		
		String str = "hello";
		System.out.println(
		str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		//get the employee with highest salary(using collecting and then
		
		System.out.println(
				courses.stream().collect(Collectors.collectingAndThen(Collectors.maxBy
						(Comparator.comparing(Course::getReviewScrorer)), i->i.map(Course::getName).orElse("Name Not found")))
				);
	}

}
