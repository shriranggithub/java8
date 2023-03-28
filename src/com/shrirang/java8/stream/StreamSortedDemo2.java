package com.shrirang.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedDemo2 {

	
	
	public static void main(String[] args) {
		List< Emp> l=new ArrayList<>();
		l.add(new Emp("Shree",80000));
		l.add(new Emp("Shree1",70000));
		l.add(new Emp("Shree2",60000));
		l.add(new Emp("Shree3",90000));
		l.add(new Emp("Shree4",60000));

		List<Emp> l1=l.stream().sorted((a,b)->-a.getSalary().compareTo(b.getSalary())).collect(Collectors.toList());
	//	System.out.println(marks.stream().filter(i->i>=30).collect(Collectors.toList()`));
	//	System.out.println(l);
		
		System.out.println(l1);
		
	}

}

class Emp{
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	String  name;
	Integer salary;
	public Emp(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
}