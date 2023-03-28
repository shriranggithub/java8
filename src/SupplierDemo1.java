import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo1 {

	
	public static void main(String[] args) {
		
		Supplier<Date> s=()->new Date();
		
		System.out.println(s.get());
		
		
		Supplier<String> s1=()->{
			String OTP="";
			for(int i=0;i<6;i++) {
				OTP=OTP+(int)(Math.random()*10);
			}
			
			return OTP;
		};
		
		System.out.println(s1.get());
	}
}
