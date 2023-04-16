package JPMC;

import java.util.ArrayList;
import java.util.List;

public class WildCardsInJava {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		intList.add(4);
		//intList.add("Hello");
		printList(intList);
		
	}
	public static void printList(List<?> list) {
		System.out.println(list);
	}

}
