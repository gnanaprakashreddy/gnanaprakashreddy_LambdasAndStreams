package com.epam.Java8LamdasStreams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/*
 *  Average of Numbers using lambdas and streams  
 */
public class AverageOfList 
{
	public static double averageOfList(List<Integer> list) {
		IntSummaryStatistics stats = list.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
		return stats.getAverage();
	}
	
    public static void main( String[] args )
    {
    	List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    	
    	System.out.println(averageOfList(list));
    }
}
