import java.util.Scanner;
import java.util.Arrays;

public class MaxAdRevenue {

	private static long maxProduct(int[] a, int[] b) {
		
		        Arrays.sort(a);
		        Arrays.sort(b);
		        
		        
		        long result = 0;
		        for (int i = 0; i < a.length; i++) {
		            result += (long)((long)a[i] * (long)b[i]);
		        }
		        return result;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        sc.close();
        System.out.println(maxProduct(a, b));

	}

}
