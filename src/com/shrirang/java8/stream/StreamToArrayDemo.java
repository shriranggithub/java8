package com.shrirang.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToArrayDemo {

	
	
	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(35);
		marks.add(25);
		marks.add(5);
	
		Integer[]l=marks.stream().toArray(Integer[]::new);	
		
		System.out.println(l.toString());
		
	}

}



