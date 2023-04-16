package JPMC;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		
		list.add("100");
		list.add("hii");
		list.add("cena");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add("200");
		}
		System.out.println("------------------------------------");
		Iterator<String> it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next()+" ");
			list.add("200");
		}
		
		System.out.println("------------------------------------");
		
		ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
		map.put("Hii", "001");
		map.put("Ey", "Trivendrum");
		
		System.out.println(map);
		
		Iterator<Entry<String, String>> itmap = map.entrySet().iterator();
		
		while(itmap.hasNext()) {
			
			Entry<String, String> entry = itmap.next();
			System.out.println(entry.getKey()+"------"+entry.getValue());
			map.remove("Hii");
		}
		
		Iterator<Entry<String, String>> itmap1 = map.entrySet().iterator();
		
		while(itmap1.hasNext()) {
			
			Entry<String, String> entry = itmap1.next();
			System.out.println(entry.getKey()+"------"+entry.getValue());
			//map.remove("Hii");
		}
	}

}
