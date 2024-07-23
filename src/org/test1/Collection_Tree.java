package org.test1;

import java.util.Set;
import java.util.TreeSet;

public class Collection_Tree {
public static void main(String[] args) {
	Set <String> set= new TreeSet<String>();
	set.add("Apple");
	set.add("Orange");
	set.add("Banana");
	System.out.println(set);
	for(String fruit :set) {
		System.out.println(fruit);
	}
}
}

