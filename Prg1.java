public class Prg1 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, -1, 3, 3};
		int sum = 6;
		
		for(int i =0;i<arr.length;i++) 
			for(int j=i+1;j<arr.length;j++) 
				if((arr[i] + arr[j]) == sum)
					
				System.out.println(arr[i]+" \t "+ arr[j]);
			
		
	}

}