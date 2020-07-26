package com.epam.Java8LamdasStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
 * Return the strings which starts with character a and has length of 3
 */
public class StartWithA {
	public static List<String> getStartingAStrings(List<String> lists) {
		List<String> filteredAStrings = lists.stream()
										.filter(list -> list.startsWith("a"))
										.filter(string -> string.length()==3)
										.collect(Collectors.toList());
		return filteredAStrings;
	}
	
	public static void main(String []args) {
		List<String> lists = Arrays.asList("abc","","abcdef","afg","ahi","sdfg","grg","aef");
		List<String> filteredAStrings = getStartingAStrings(lists);
		System.out.println(filteredAStrings);
	}
}
