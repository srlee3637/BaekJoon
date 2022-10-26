import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Main2805{
	public static void main(String[] args){

		try {
			System.setIn(new FileInputStream("src/input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		long [] tree = new long[n];
		for(int i = 0; i < n; i++){
			tree[i] = sc.nextInt();
		}
		Arrays.sort(tree);

		long l = 0;
		long r = tree[n-1];
		long ans = 0;
		
		while(l<=r){
			
			long mid = (l+r)/2;
			long sum = 0;
			for(int i = 0; i < n; i++){
				if(tree[i]>mid){
					sum += tree[i] - mid;
				}
			}
			
			
			if(sum == m){
				ans=mid;
				break;
			}else if(sum>m){
				l = mid + 1;
				//if(mid >ans){
				ans = mid;
				//}
			}else {
				r = mid - 1;
			}
			

			
		}
        System.out.println(ans);

	}
}