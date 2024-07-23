package org.practise;

import java.util.LinkedList;
import java.util.List;

public class Coll_REmove {
public static void main(String[] args) {
	List<Integer>list=new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(90);
	list.add(10);
	list.add(10);
	list.add(40);
	System.out.println(list.lastIndexOf(10));
	System.out.println(list.remove(5));
	System.out.println(list);
}
}
//10,20,30,90,10,10,40