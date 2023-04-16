package Collectors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8CollectorsPractice {

	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("SpringBoot", "Framework", 97, 18000), new Course("API", "Micorservices", 92, 14000),
				new Course("MicroServices", "Micorservices", 90, 20000),
				new Course("Full Stack", "Full stack", 99, 47000), new Course("Azure", "Cloud", 93, 19000),
				new Course("Aws", "Cloud", 96, 20000),new Course("Aws", "Cloud", 91, 20000));
		
		//name of highest paid employee
		System.out.println(
		courses.stream().collect(Collectors.maxBy(Comparator.comparing(c->c.getReviewScrorer()))).get().getName()
		);
		
		//list of courses who joined after 95
		System.out.println(
				courses.stream().collect(Collectors.filtering(i->i.getReviewScrorer()>95, Collectors.toList()))
				);
		
		//no of male and female employee
		
		//courses.stream.collect(Collectors.groupingBy(Course::getName, Collectors.counting));
		
		//average review score of all the courses
		
		System.out.println(
				courses.stream().mapToInt(i->i.getReviewScrorer()).average().orElse(100)
				);
		//method 2 :
		Double avgSal = courses.stream().collect(Collectors.averagingInt(Course::getReviewScrorer));
		System.out.println(avgSal);
		
		//Name of all the courses
		
		System.out.println(
				courses.stream().map(i->i.getName()).distinct().collect(Collectors.toList())
				);
		
		//Average salary of male and female employee
		
		
		System.out.println(
				courses.stream().collect(Collectors.groupingBy(Course::getName, Collectors.averagingInt(Course::getReviewScrorer)))
				);
		
		//course name with highest review score
		
		System.out.println(
				courses.stream().collect(Collectors.maxBy(Comparator.comparing(Course::getReviewScrorer))).map(i->i.getName()).get()
				);
		
		System.out.println(
				courses.stream().sorted((i,j)->j.getReviewScrorer()-i.getReviewScrorer())
				.map(Course::getName).findFirst().orElse("Name not found")
				);
		//details of lowest review score from Aws depatment
		
		System.out.println(
				courses.stream().filter(i->i.getName().equalsIgnoreCase("AWS")).
				sorted(Comparator.comparing(Course::getReviewScrorer)).findFirst().get()
				);
		
		//same as above using collectors
		System.out.println(
				courses.stream().collect(Collectors.filtering
						(i->i.getName().equalsIgnoreCase("AWS"),
								Collectors.minBy(Comparator.comparing(Course::getReviewScrorer))))
				);
		
		//average review score
		
		System.out.println(
				courses.stream().collect(Collectors.averagingInt(Course::getReviewScrorer))
				);
		
		// 3 rd highest Review score
		System.out.println(
				courses.stream().
				sorted(Comparator.comparing(Course::getReviewScrorer)).distinct().skip(3).findFirst().get()
				);
	}

}
