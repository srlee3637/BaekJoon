import java.util.*;
public class Main2231 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
	
		int ans = 0;
	
		for(int i = 0; i < N; i++) {
			int x = i;
			int sum = 0;
			
			while(x > 0){

				sum += x%10;
				x = x/10;
			}
			
		
			
			
			if(sum + i == N) {
				ans = i ;
				break;
			}
		}
		
		System.out.println(ans);


	}

}
