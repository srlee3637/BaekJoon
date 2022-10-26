import java.util.Arrays;
import java.util.Scanner;
public class Main1316 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			String str = scan.next();
			String[] str1 = str.split("");
			String[] ans = new String[str1.length +1];
			int j = 0;
			int k = 1;
			int l = 1;
			ans[0] = str1[0];
			while(j<str1.length-1) {
				
				
				
				if(!str1[j].equals(str1[k])) {
					ans[l] = str1[k];
					l++;
				}
				j++;
				k++;
			}
			
			a:for(int x = 0; x < ans.length; x++) {
				
				if(ans[x+1] == null  ) {
					count++;
					break;
				}
				for(int y = x+1; y < ans.length; y++) {
					
					
					if(ans[x].equals(ans[y])){
						break a;
					}
				}
				
			}
			
		}
		System.out.println(count);
		
	}

}

