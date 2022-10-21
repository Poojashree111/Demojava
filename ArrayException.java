import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
public String getPriceDetails()
{
    Scanner sc=new Scanner(System.in);
    
    int d;
    System.out.println("enter no.of elements");
    int n=sc.nextInt();
    
    int a[]=new int[n];
    System.out.println("enter"+n +"elements");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("enter index of array");
    try {
    int b=sc.nextInt();
    return("the array element is:"+a[b]);
    
    }catch (ArrayIndexOutOfBoundsException e) {
        return("the array index outof range");
     } catch (InputMismatchException e) {
        return("Input was not in the correct format");
     }
    
}
public static void main(String [] args)
{
    ArrayException obj=new ArrayException();
System.out.println( obj.getPriceDetails());
}
}