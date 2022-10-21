import java.util.Arrays;
import java.util.Scanner;
public class  cumulative {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
       
        int numbers[] = new int[n];
        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i) {
            numbers[i] = scan.nextInt();
        }
      
        int sum[] = cumulativeSum(numbers);
      
        System.out.println("Cumulative sum = " + Arrays.toString(sum));
       
        scan.close();
    }
    
    public static int[] cumulativeSum(int[] numbers) {
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // find sum
            numbers[i] = sum; // replace
        }
        return numbers;
    }
}