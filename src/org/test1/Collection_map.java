package org.test1;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_map {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "Gokul");
	map.put(2,"Aparna");
	map.put(3,"Vicky");
	System.out.println(map);
	map.put(1,"Vishnu");
	System.out.println(map);
	map.put(4,"Aparna");
	System.out.println(map);
	System.out.println(map.get(2));
	//System.out.println(map.get("Vicky"));

	//System.out.println(map.containsKey(5));
	//System.out.println(map.containsValue("Aslin"));

	map.remove(1);
	System.out.println(map);
	Map<Integer,String> map2=new LinkedHashMap<Integer,String>();
	map2.put(1,"Aslin");
	map2.put(5,"Soundarya");
	map2.put(6,"Gokul");
	map.putAll(map2);
	System.out.println(map);
	Set<Integer> keySet = map.keySet();
	System.out.println(keySet);
	Collection<String> values = map.values();
	System.out.println(values);
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	System.out.println(entrySet);
	for(Entry<Integer, String> entry:entrySet) {
		//System.out.println(entry.getKey());
		//System.out.println(entry.getValue());
		System.out.println(entry);
	}		

}
}