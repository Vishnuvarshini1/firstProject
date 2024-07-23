package org.test1;

import java.util.ArrayList;
import java.util.List;

public class Collection_Test1 {
public static void main(String[] args) {
	List<Integer> li=new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	System.out.println(li);
	li.add(1,40);
	System.out.println(li);
	li.set(2, 50);
	System.out.println(li);
	li.set(3, 30);
	System.out.println(li);
	System.out.println(li.indexOf(50));
	System.out.println(li.lastIndexOf(50));
	List<Integer>li1 =new ArrayList<>();
	li1.add(70);
	li1.add(80);
	li1.add(90);
	li.addAll(li1);
	System.out.println(li);
	System.out.println(li.get(3));
	for(int i=0;i<li.size();i++) {
		System.out.println(li.get(i));
	}
}
}
