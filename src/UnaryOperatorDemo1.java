import java.util.function.UnaryOperator;

public class UnaryOperatorDemo1 {

	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> f=i->i*i;
		
		System.out.println(f.apply(10));
	}
}
