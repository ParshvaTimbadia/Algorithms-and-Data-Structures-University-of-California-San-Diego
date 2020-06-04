import java.util.Scanner;

public class LCM {
	
	static long gcd_for_lcm(long a, long b) {
	
	if (b==0)
			return a;
	else {
		return gcd_for_lcm(b, a%b);
	}
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	long a= sc.nextInt();
	long b= sc.nextInt();

	sc.close();
	long GCD=(gcd_for_lcm(a,b));
	
	long lcm= (a*b)/GCD;
	
	System.out.println(lcm);
	

}


}
