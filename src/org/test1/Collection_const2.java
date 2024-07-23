package org.test1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_const2 {
public static void main(String[] args) {
	int arr[] = {10,20,30};
	Set<Integer>set = new LinkedHashSet<>();
	for(int i=0;i<arr.length;i++) {
		set.add(arr[i]);
		System.out.println(set);
		
	}
	System.out.println(set);
}
}
