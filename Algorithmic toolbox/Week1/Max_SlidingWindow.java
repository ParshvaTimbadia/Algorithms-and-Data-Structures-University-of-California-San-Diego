import java.util.*;
public class Max_SlidingWindow {

	private static void solver(int[] arr, int k) {
		
		Deque<Integer> tracker = new LinkedList<Integer>(); //Keeps the track of the largest number in the Queue.
		int i=0;
		for (i=0; i< k; ++i) {
			
			while( !tracker.isEmpty() && arr[i] >= arr[tracker.peekLast()] ) {
				
				tracker.removeLast();
			}
			
			tracker.addLast(i);
		}
		
		
		for(; i<arr.length; ++i) {
			
			System.out.println(arr[tracker.peek()]+" ");
			
			
			while(!tracker.isEmpty() && tracker.peek() <= i-k) {
				tracker.removeFirst();
			}
			
			while( !tracker.isEmpty() && arr[i] >= arr[tracker.peekLast()] ) {
				
				tracker.removeLast();
			}
			
			tracker.addLast(i);
			
			

		}
		
		System.out.println(arr[tracker.peek()]);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Size of the Array
		int[] a= new int[n];
		for (int i=0; i< n; i++) {
			
			a[i]= sc.nextInt();
		}
		
		int m = sc.nextInt(); // Size of the window
		
		solver(a, m);
		
		sc.close();
		

	}

}
