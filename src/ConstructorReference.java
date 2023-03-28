
public class ConstructorReference {

	
	public static void main(String[] args) {
		
		Interf i=Sample::new;
		
		System.out.println(i.get());
		
	}
}


class Sample{
	
	 Sample(){
		
		System.out.println("sample class constructor");
	}
}

interface Interf{
	
	Sample get();
}

