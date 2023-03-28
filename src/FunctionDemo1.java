import java.util.function.Function;

// when we have to pass one parameter and output in any type then we should go for Function interface
public class FunctionDemo1 {

	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f=n->n*n;// passing input as Integer and return type as Integer
		
		System.out.println(f.apply(10));
		
		Function<String, Integer> f1=s->s.length();
		
		System.out.println(f1.apply("SomeString"));
	}
}
