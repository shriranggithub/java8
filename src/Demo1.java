
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Given a list of integers, find out all the even numbers exist in the list using Stream functions?

public class Demo1 {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,33,58,56,78);
		 
		Stream<Integer> stream=myList.stream();
		
		List<Integer>l=stream.filter(n->n%2==0).toList();
		
	//	System.out.println(myList);
		
		System.out.println(l);
	}
}
