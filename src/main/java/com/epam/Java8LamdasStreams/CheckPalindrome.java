package com.epam.Java8LamdasStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  Check If The List Of Strings Are Palindrome Or Not 
 */
public class CheckPalindrome {
	
	public static boolean isPalindrome(String input) {
		StringBuilder reverse = new StringBuilder(input).reverse();
	    return (reverse.toString()).equals(input);
	}
	
	
	public static List<String> palindromeStrings(List<String> strings){
		List<String> palindromeStrings = (List<String>) strings.stream()
				  .filter(string -> isPalindrome(string)).collect(Collectors.toList());
		return palindromeStrings;
	}
	
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("malayalam","prakash","madam","abcdcba","gnana","shirt","prassarp");
		List<String> palindromeStrings = palindromeStrings(strings);
		System.out.println(palindromeStrings);
	}
}
