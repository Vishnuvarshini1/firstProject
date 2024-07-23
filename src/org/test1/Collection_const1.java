package org.test1;

import java.util.ArrayList;
import java.util.List;

public class Collection_const1 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Apple");
	list.add("Mango");
	list.add("Papaya");
	System.out.println(list);
	String a[]=new String[list.size()];
	for(int i=0;i<list.size();i++) {
		a[i]=list.get(i);
		System.out.println(a[i]);
	}
}
}
