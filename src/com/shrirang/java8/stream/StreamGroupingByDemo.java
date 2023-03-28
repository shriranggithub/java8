package com.shrirang.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByDemo {

	
	public static void main(String[] args) {
		
		List< Emp> l=new ArrayList<>();
		l.add(new Emp("Shree",80000));
		l.add(new Emp("Shree1",70000));
		l.add(new Emp("Shree2",60000));
		l.add(new Emp("Shree",90000));
		l.add(new Emp("Shree4",60000));
		l.add(new Emp("Shree5",70000));
		
		Map<Integer,List<Emp>> empGroup=l.stream().collect(Collectors.groupingBy(emp->emp.getSalary()));
		
		System.out.println(empGroup);
	}
}


