
import java.util.*; 
public class Swapnumbers {
public static void main(String[] args) {
      int x , y;
Scanner s= new Scanner(System.in);
		System.out.println("enter the first number");
		x=s.nextInt();
		System.out.println("enter the Second number");
		y=s.nextInt();
      System.out.println("x = "+x+", y= "+y);
        x = x + y;      
        y = x - y;      
        x = x - y;
 System.out.println("x = "+x+", y= "+y);
}
}