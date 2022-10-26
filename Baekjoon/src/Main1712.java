import java.util.*;
public class Main1712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int ans = 0;
		
		
		if(B>=C) {
			ans = -1;
		}else{
			ans = (A/(C-B))+1; 
		}
		
		System.out.println(ans);
		
		sc.close();
		
	}

}
