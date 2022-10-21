import java.util.*;

public class prm2 {
	
	public static void main(String[] args) {
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the first number");
		a=s.nextInt();
		System.out.println("enter the Second number");
		b=s.nextInt();
		for(int i=1;i<a;i++) {
			if(a%i == 0 &&  b%i==0) {
				System.out.println(i);
				
			}
			
		}
		
		
	}

}
