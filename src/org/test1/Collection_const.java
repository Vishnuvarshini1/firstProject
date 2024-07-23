package org.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection_const {
public static void main(String[] args) {
	Set <String> set= new TreeSet<String>();
	set.add("Apple");
	set.add("Orange");
	set.add("Banana");
	System.out.println(set);
	Object[] array=set.toArray();
	//System.out.println(list);
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
}
}