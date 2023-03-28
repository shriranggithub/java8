package com.shrirang.java8.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFindDuplicate {

	
	public static void main(String[] args) {
		
		List< Emp> l=new ArrayList<>();
		l.add(new Emp("Shree",80000));
		l.add(new Emp("Shree1",70000));
		l.add(new Emp("Shree2",60000));
		l.add(new Emp("Shree",90000));
		l.add(new Emp("Shree4",60000));
		
		Set<String> unique=new HashSet<>();
	  List<String> duplicate= l.stream().map(emp->emp.getName()).filter(name->!unique.add(name)).collect(Collectors.toList());
	  
	  System.out.println("unique:"+unique );
	  System.out.println("duplicate:"+duplicate);
	}
}
