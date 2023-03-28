package com.shrirang.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFindFirstDemo {

	
	
	public static void main(String[] args) {
		List< Emp> l=new ArrayList<>();
		l.add(new Emp("Shree",80000));
		l.add(new Emp("Shree1",70000));
		l.add(new Emp("Shree2",60000));
		l.add(new Emp("Shree3",90000));
		l.add(new Emp("Shree4",60000));

		
		
		System.out.println();
		System.out.println(l.stream().findFirst());
		
		
	}

}


	
