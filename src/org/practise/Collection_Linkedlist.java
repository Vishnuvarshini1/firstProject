package org.practise;

import java.util.LinkedList;
import java.util.List;

public class Collection_Linkedlist {
public static void main(String[] args) {
	List<Integer>list=new LinkedList<>();
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	list.add(500);
	list.add(600);
	list.add(700);
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(4));
}
}
