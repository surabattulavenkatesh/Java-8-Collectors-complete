package JAVA_120_problems;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Date_Time {

	public static void main(String[] args) {

		//Before Java 8
		//System.out.println(new SimpleDateFormat("dd-MM-YYYY").format(new Date()));
		
		System.out.println(LocalDate.now().minusDays(1));
		System.out.println(LocalDate.of(2023,11,25));
		System.out.println(LocalDate.of(2023,Month.APRIL,25));
		//LocalTime
		System.out.println(LocalTime.now());
		//Local Date Time
		
	}

}
