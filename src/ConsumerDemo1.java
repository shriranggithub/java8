import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo1 {

	
	public static void main(String[] args) {
		
		
		
		Function<Student, String> f = student -> {
			int marks = student.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[distinction]";
			else if (marks >= 60)
				grade = "B[first class]";
			return grade;
		};
		
		Predicate<Student> p=p1->p1.marks>=60;
		
		Consumer<Student> c=student->{
			
			System.out.println("Student name:"+student.name);
			System.out.println("Student marks:"+student.marks);
			System.out.println("Student grade:"+f.apply(student));
		};
		
		List<Student> list = new ArrayList<>();

		list.add(new Student("Shrirang", 80));
		list.add(new Student("RK", 60));
		list.add(new Student("KK", 50));
		
		for(Student s:list) {
			if(p.test(s))
			c.accept(s);
		}
		
	}
}
