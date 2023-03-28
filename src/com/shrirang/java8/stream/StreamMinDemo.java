package com.shrirang.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinDemo {

	
	
	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(35);
		marks.add(25);
		marks.add(5);
	
		Integer i=marks.stream().max((a,b)->a.compareTo(b)).get();
	//	System.out.println(marks.stream().filter(i->i>=30).collect(Collectors.toList()`));
		System.out.println(i);
		
	}

}
