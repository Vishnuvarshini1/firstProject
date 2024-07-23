package org.tcs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freq {
public static void main(String[] args) {
	String s="Welcome Home Home";
	
	Map<Character,Long>count=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(count);
	
}
}
