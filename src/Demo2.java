import java.util.Arrays;
import java.util.List;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?


public class Demo2 {

	public static void main(String[] args) {
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,15,17);
		  
		 List<String> l=myList.stream().map(s->s+"").filter(n->n.startsWith("1")).toList();
		 
		 System.out.println(l);
				        
	}
}
