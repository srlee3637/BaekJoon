import java.util.*;
public class Main2798 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		int N1 = 1;
		for(int i = 1; i <= N; i++) {
			arr[i-1] = scan.nextInt();
			
		}
		N1 = N*(N-1)*(N-2)/6;
		int[] ans = new int[N1];
		int sum = 0;
		int l=0;
		
		for(int i = 0; i < N; i++) {
			
			for(int j = i+1; j < N; j++){
				
				for(int k = j+1; k < N; k++) {
					
					sum = arr[i] + arr[j] + arr[k];
					ans[l] = sum;
					l++;
				}
				
			}
		}
		Arrays.sort(ans);
		System.out.println(Arrays.toString(ans));
		int min = 0;
		int max = N1-1;
		
		while(min<max) {
			int mid = (min+max)/2;
			
			if(M > ans[mid]) {
				min = mid + 1;
			}else max = mid;
		}
		
		if(M >= ans[min]) System.out.println(ans[min]);
		else System.out.println(ans[min-1]); 
		
		
		
		scan.close();
	}

}
