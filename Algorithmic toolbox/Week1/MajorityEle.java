import java.util.*;
public class MajorityEle {

	static int getMajorityElement(int[] a) {
		
	
		Hashtable<Integer, Integer> memory = 
	            new Hashtable<Integer, Integer>(); 
	
		for (int i=0; i < a.length; i++) {
			
			if(memory.containsKey(a[i])) {
					
				memory.put(a[i], memory.get(a[i])+1);	
				
				if (memory.get(a[i]) > (a.length/2)) {
					
					return 1;
				}
			}
			else {
				memory.put(a[i],1);		
			}
		}
		
		return 0;
		
		
		
	
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        System.out.println(getMajorityElement(a));


	}

}
