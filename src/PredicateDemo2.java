import java.util.function.Predicate;

//condition checking with two predicate 

public class PredicateDemo2 {

	public static void main(String[] args) {
		int[] x= {0,5,15,20,25,30,35,40};
		
		Predicate<Integer> p=n->n%2==0;
		Predicate<Integer> p1=n->n>10;
		System.out.println("predicate with AND");
		for(Integer x1:x) {
			if(p.and(p1).test(x1)) {
				System.out.println(x1);
			}
		}
		
		System.out.println("predicate with OR");
		for(Integer x1:x) {
			if(p.or(p1).test(x1)) {
				System.out.println(x1);
			}
		}
		
		System.out.println("predicate with negate");
		System.out.println("we are passing predicate for finding Even numbers "
				+ "but we are using negate method of predicate then we will get odd numbers");
		for(Integer x1:x) {
			if(p.negate().test(x1)) {
				System.out.println(x1);
			}
		}
	}
}
