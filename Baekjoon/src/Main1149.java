import java.util.*;
public class Main1149 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int [][] dp = new int[1001][3];
		int N = scan.nextInt();
		int ans = 0;
		dp[0][0] = scan.nextInt();
		dp[0][1] = scan.nextInt();
		dp[0][2] = scan.nextInt();
		
		int R = 0;
		int G = 0;
		int B = 0;
		
		for(int i = 1; i < N; i++) {
			R = scan.nextInt();
			G = scan.nextInt();
			B = scan.nextInt();
			
			dp[i][0] = R + Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = G + Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = B + Math.min(dp[i-1][0], dp[i-1][1]);
			
		}
		
		ans = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
		
		System.out.println(ans);
		
	}

}
