package org.practise;

import java.util.LinkedList;
import java.util.List;

public class Coll_for {
public static void main(String[] args) {
	
	List<Integer>list=new LinkedList<>();
	list.add(105);
	list.add(205);
	list.add(305);
	list.add(405);
	list.add(505);
	list.add(605);
	list.add(705);
	list.add(805);
	for(Integer l:list) {
		System.out.println(l);
	}
	
}
}
