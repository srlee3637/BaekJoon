import java.util.*;
public class Main11407 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr =  new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int j =N-1;
		int max = arr[0];
		int sum = 0;
		
		while(K!=0) {
			max = arr[0];
			if(arr[j] >= max && arr[j] <= K) {
				max = arr[j];
				sum += K/max;
				K = K % max;
			}
			j--;
		}
		
		System.out.println(sum);
		
	}

}
