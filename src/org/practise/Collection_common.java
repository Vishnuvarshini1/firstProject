package org.practise;

import java.util.ArrayList;
import java.util.List;

public class Collection_common {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(90);
	list.add(10);
	list.add(10);
	list.add(40);
	list.add(50);
	System.out.println(list);
	List<Integer>list1=new ArrayList<>();//100,
	list1.add(100);
	list1.add(200);
	list1.add(300);
	list1.add(400);
	list1.add(500);
	list1.add(600);
	list1.add(700);
	list1.add(800);
	System.out.println(list1);
	list.retainAll(list1);
	System.out.println(list);
}
}
//10,20,30,90,10,10,40,50
//30,40,50,60,80