package Java8to18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class InstanceofJava14 {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String,Integer> concurrentHMap = new ConcurrentHashMap<>();
		
		concurrentHMap.put("john", 01);
		Iterator<Entry<String,Integer>> it = concurrentHMap.entrySet().iterator();
		
		while(it.hasNext()) {
			
			concurrentHMap.put("cena", 02);
			System.out.println(it.next());
		}
		
		HashMap<String,Integer> HMap = new HashMap<>();
		
		HMap.put("john", 01);
		Iterator<Entry<String,Integer>> it1 = HMap.entrySet().iterator();
		
		while(it1.hasNext()) {
			
			HMap.put("cena", 02);
			System.out.println(it1.next());
		}
	}

}
