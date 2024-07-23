package org.practise;

import java.util.LinkedList;
import java.util.List;

public class Collection_loop {
public static void main(String[] args) {
	int arr[]= {105,205,305,405,505,605,705,805};
	List<Integer>list=new LinkedList<>();
	for(int i=0;i<arr.length;i++) {
		list.add(arr[i]);
		
	}
	System.out.println(list);
}
}
