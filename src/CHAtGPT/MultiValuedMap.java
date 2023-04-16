package CHAtGPT;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MultiValuedMap {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("","Null",null,"123","#@&#&HGJ");
		
		strings.stream().map(i->{
			if(Objects.isNull(i) || i.isBlank()) {
				i="hyderbad";
			}
			return i;
			
		}).forEach(System.out::println);
	}

}
