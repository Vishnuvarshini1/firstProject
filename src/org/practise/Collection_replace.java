package org.practise;

import java.util.LinkedList;
import java.util.List;

public class Collection_replace {
public static void main(String[] args) {
	List<Integer>list=new LinkedList<>();
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	list.add(500);
	list.add(600);
	list.add(700);
	list.set(2, 350);//replace
	System.out.println(list);
	
	
}
}
//100,200,300,400,500,600,700