package JPMC;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcuurentHashmapp {

	public static void main(String[] args) {

		ConcurrentHashMap<String,Integer> conhashmap = new ConcurrentHashMap<>();
		
		conhashmap.put("hyd", 01);
		conhashmap.put("bangalore", 02);
		
		Iterator<Entry<String,Integer>> it1 = conhashmap.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String,Integer> i1 = it1.next();
			System.out.println(i1.getKey()+" : "+i1.getValue());
			conhashmap.put("kerala", 03);
		}
		
		System.out.println("----------------------------------------------");
		Iterator<Entry<String,Integer>> it2 = conhashmap.entrySet().iterator();
		
		while(it2.hasNext()) {
			Entry<String,Integer> i1 = it2.next();
			System.out.println(i1.getKey()+" : "+i1.getValue());
			//conhashmap.put("kerala", 03);
		}
		
		
	}

}
