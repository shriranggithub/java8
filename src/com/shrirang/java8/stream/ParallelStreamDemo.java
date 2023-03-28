package com.shrirang.java8.stream;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

	
	
	public static void main(String[] args) {
		
		long start=0;
		long end=0;
		start=System.currentTimeMillis();
		IntStream.range(0, 1000).forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("plane stream took time:"+ (end-start));
		System.out.println("================================");
		
		start=System.currentTimeMillis();
		IntStream.range(0, 1000).parallel().forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("parallel stream took time:"+ (end-start));
	}
}

