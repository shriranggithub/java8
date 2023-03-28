import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the maximum value element present in it using Stream functions?

public class Demo5 {

	public static void main(String[] args) {
		
		   List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		   
		  Integer i= myList.stream().max((a,b)->a.compareTo(b)).get();
		  
		  System.out.println(i);
	}
}
