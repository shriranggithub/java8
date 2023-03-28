import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// when we have to pass one parameter and output in any type then we should go for Function interface
public class FunctionDemo2 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("Shrirang", 80));
		list.add(new Student("RK", 60));

		// passing input as Student and it return grade type as String on the basis
		// student marks
		Function<Student, String> f = student -> {
			int marks = student.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[distinction]";
			else if (marks >= 60)
				grade = "B[first class]";
			return grade;
		};

		for (Student s : list) {
               
			System.out.println("Student name:"+s.name +" "+"Student grade:"+f.apply(s));
		}

	}

}

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}