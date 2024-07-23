package org.test1;

import java.util.LinkedList;
import java.util.List;

public class Collection_cons2 {
public static void main(String[] args) {
	int arr[]= {10,20,30};
	List<Integer>list=new LinkedList<>();
	for(int i=0;i<arr.length;i++) {
		list.add(arr[i]);
		System.out.println(list);
	}
	System.out.println(list);
}
}

