package com.shrirang.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo1 {

	
	
	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		
		List l=marks.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println(l);
		
	}

}
