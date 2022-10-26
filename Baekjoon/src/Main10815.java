
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Main10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int [] src = new int[n];
		for(int i = 0; i < n; i++) {
			src[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(src);
		int target = 0; ;
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());	

		for(int i = 0; i < m; i++) {
			target = Integer.parseInt(st.nextToken());
			int count =0;
			int l =0;
			int r =n-1;
			while(l<=r) {
				int mid = (l+r)/2;
				int src1 =src[mid];
				int mid1 =mid;
				if(target == src1){
					bw.write(1 + " ");
					count = 1;
					break;
				}else if(target>src1) {
					l = mid + 1;
				}else {
					r = mid - 1; 
				}


				
			}
			if(count == 0) {
		
				bw.write(0 + " ");
				}
		}
		
		bw.flush();
		bw.close();
		br.close();




	}

}






