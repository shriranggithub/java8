import java.util.function.BiFunction;

// takes two input argument and one return type
public class BiFunctionDemo1 {

	
public static void main(String[] args) {
	BiFunction<String, Integer, Emp> f=(eName,salary)->new Emp(eName, salary);
	
	Emp e1=f.apply("Shrirang", 80000);
}
}
