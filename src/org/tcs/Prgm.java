package org.tcs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prgm {
public static void main(String[] args) {
	String s="Java Concept of the Day";
	Map<Character, Long> charCount=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(charCount);
}
}
