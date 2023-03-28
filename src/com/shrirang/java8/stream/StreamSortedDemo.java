package com.shrirang.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedDemo {

	
	
	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(35);
		marks.add(25);
	
		List<Integer> l=marks.stream().sorted().collect(Collectors.toList());
	//	System.out.println(marks.stream().filter(i->i>=30).collect(Collectors.toList()`));
		System.out.println(l);
		
	}

}
