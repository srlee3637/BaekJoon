import java.util.*;

public class Main2908 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int A1 = 0;
		int B1 = 0;
		int X = 0;
		int Y = 0;
		while(A>0 && B>0) {
			A1 = A % 10;
			X = X * 10 + A1;
			A = A/10;
			
			B1 = B % 10;
			Y = Y *10 + B1;
			B = B / 10;
		}
		
		int Max = (X > Y) ? X : Y;
		System.out.println(Max);
		
	}
	
}
