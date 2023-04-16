package CHAtGPT;

import java.util.Arrays;
import java.util.List;

public class findAnyChatGPT {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(5,6,7,8);
		
		boolean match = list1.stream().anyMatch(list2::contains);
		if(match) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
