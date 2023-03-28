import java.util.function.BiPredicate;

// It will accept two input argument and return boolean
// Bi means 2
public class BiPredicateDemo1 {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p=(a,b)->(a+b)%2==0;
		
		System.out.println(p.test(10, 25));
	}
	
}
