package org.practise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Add_new {
public static void main(String[] args) {
	List<Integer> list=new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(90);
	list.add(10);
	list.add(10);
	list.add(40);
	list.add(50);
	//list.add(2, 50);
	//list.add(70);
	//list.add(8, 80);
	list.remove(6);
	list.add(6,100);
	list.set(7, 90);
	Collections.replaceAll(list, 10, 100);
	System.out.println(list);
	//System.out.println(list);
}
}
//10,20,30,90,10,10,40,50