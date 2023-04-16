package JPMC;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepChar {

	public static void main(String[] args) {

		String str = "venkatesh";
		Character val  =  
		str.chars().mapToObj(i->Character.toLowerCase((char)i))
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
				Collectors.counting())).entrySet().stream().
					filter(i->i.getValue()==1).map(i->i.getKey()).findFirst().get();
		
		System.out.println("First non repeated character : "+val);
	}

}
