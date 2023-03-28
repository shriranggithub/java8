import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		List< Emp> l=new ArrayList<>();
		l.add(new Emp("Shree",80000));
		l.add(new Emp("Shree1",70000));
		l.add(new Emp("Shree2",60000));
		l.add(new Emp("Shree3",90000));
		l.add(new Emp("Shree4",60000));
		
		Predicate<Emp> p=e->e.getSalary()>50000;
		
		for(Emp e1:l) {
			if(p.test(e1)) {
				System.out.println(e1.getName());
				System.out.println(e1.getSalary());
			}
		}
	}
}


class Emp{
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