package org.test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Collection_Test {
public static void main(String[] args) {
	ArrayList<Integer>a =new ArrayList<>();
	List<Integer> li=new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	System.out.println(li);
	System.out.println(li.size());
	li.remove(1);
	System.out.println(li);
	System.out.println(li.contains(10));
	System.out.println(li.isEmpty());
	//li.clear();
	//System.out.println(li);
//	Object[] array=li.toArray();
//	for(int i=0;i<array.length;i++) {
//		System.out.println(array[i]);
//	}
	//String string=li.toString();
//	System.out.println(string.length());
//	System.out.println(string);
//	for(int i=0;i<string.length();i++) {
//		char ch=string.charAt(i);
//		System.out.println(ch);
//	}
	List<Integer>li1=new LinkedList<>();
	li1.add(40);
	li1.add(50);
	li1.add(60);
	System.out.println(li1);
	li.addAll(li1);
	System.out.println(li);
	System.out.println(li.containsAll(li1));
	li.remove(2);
	System.out.println(li);
	System.out.println(li.containsAll(li1));
	li.removeAll(li1);
	System.out.println(li);
	li.retainAll(li1);
	System.out.println(li);
	
	
}
}

