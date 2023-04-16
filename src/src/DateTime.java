package src;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {

		//sdf
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:SS");
		Date d = new Date();
		String date = sdf.format(d);
		System.out.println(date);
		
		//Minus days using local Date
		
		LocalDate ld = LocalDate.now();
		LocalDate minusDays = ld.minusDays(10);
		System.out.println(minusDays);
		
	}

}
