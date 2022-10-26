import java.util.*;

public class Main1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] M = new int[N];
		int max = 0;
		double avg = 0;
		
		for(int i = 0; i < N; i++) {
			M[i] = sc.nextInt();
			
			if(max < M[i]) {
				max = M[i];
			}
		}
		double[] newM =  new double[N];
		
		for(int j = 0; j < N; j++) {
			newM[j] = (double)M[j] / max  * 100;
			avg += newM[j];
			
			
		}
		avg = avg/N;
		System.out.println(avg);
	}

}
