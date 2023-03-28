import java.util.function.BinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class IntPredicateDemo1 {

	public static void main(String[] args) {
		int[] x= {0,5,15,20,25,30,35,40};
		
		IntPredicate p=i->i%2==0;
		
		
		
		for(int i:x)
		{
			System.out.println(p.test(i));
		}
	}
}
