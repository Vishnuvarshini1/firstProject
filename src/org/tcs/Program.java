package org.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	
public static void main(String[] args) {
List<String>list=Arrays.asList("Java","C","python","Java",".Net");
List<String>unique=list.stream().distinct().collect(Collectors.toList());
System.out.println(unique);
}
}