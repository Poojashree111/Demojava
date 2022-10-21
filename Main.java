import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        //creating object of Scanner class 
        Scanner s = new Scanner(System.in);
        //Taking input of number of elements in the series
        System.out.println("Enter the Nth term “N” ");
        int n = s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j = 1;
            while( j<=i)
            {
                System.out.print(i);
                j++;
            }
            System.out.print(" ");
            i++;
        }      
    }
}