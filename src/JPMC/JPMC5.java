package JPMC;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class JPMC5 {

	public static void main(String[] args) {

		Map<Integer,Integer> map = new HashMap<>();
		map.put(10, 12);
		map.put(2, 14);
		map.put(5, 19);
		
		//sort by keys
		System.out.println(
		map.entrySet().stream().sorted(Entry.comparingByKey())
		.collect(Collectors.toMap
				(i->i.getKey(), j->j.getValue(), (i,j)->i, LinkedHashMap:: new)));
		
		System.out.println(
				map.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(i->i.getKey(), j->j.getValue(), (i,j)->j, LinkedHashMap::new)));
	}

}
