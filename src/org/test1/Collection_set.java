package org.test1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_set {
public static void main(String[] args) {
	Set <String> set =new HashSet<String>();
	set.add("Yellow");
	set.add("Red");
	System.out.println(set.add("Green"));
	System.out.println(set.add("orange"));
	System.out.println(set);
	System.out.println(set.add("Green"));
	System.out.println(set.add("orange"));
	//set.clear();
	System.out.println(set);
	System.out.println(set.isEmpty());
	set.remove("Red");
	System.out.println(set);
	set.add("Red");
	System.out.println(set);
	System.out.println(set.contains("Yellow"));
	Set<String> set2=new LinkedHashSet<String>();
	set2.add("pink");
	set2.add("blue");
	set2.add("white");
	set2.add("Yellow");
	System.out.println(set2);
	set.addAll(set2);
	set.removeAll(set2);
	System.out.println(set);
	set.retainAll(set2);
	System.out.println(set);
	System.out.println(set.containsAll(set2));
}
}
