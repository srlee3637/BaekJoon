import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;







public class Main10816 {

	public static int upperBound(int arr[], int front, int rear, int key){
		int mid;
		while(front<rear){
			mid = (front + rear) / 2;
			if(arr[mid] <= key) front = mid + 1;
			else rear = mid;
		}
		return rear;
	}
	
	public static int lowerBound(int arr[], int front, int rear, int key){
		int mid;
		while(front<rear){
			mid = (front + rear) / 2;
			if(arr[mid] < key) front = mid + 1;
			else rear = mid;
		}
		return rear;
	}
	
	
	
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int n = Integer.parseInt(br.readLine());
		int [] src = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			src[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(src);
		int target = 0; ;
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());	
		

		for(int i = 0; i < m; i++) {
			target = Integer.parseInt(st.nextToken());
			int count =0;
			
			count = upperBound(src,0, src.length,target)-lowerBound(src,0, src.length,target);
					
			bw.write(count+"\n"); 
			}
		
			
		bw.flush();
		bw.close();
		br.close();

	}

}


/*
 * public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int n = Integer.parseInt(br.readLine());
		int [] src = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			src[i] = Integer.parseInt(st.nextToken());
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
				
				
				if(target == src[mid]){
					count++;
					
					for(int j = mid-1; j>=0; j--) {

						if(target==src[j]) {
							count ++;
						}else{
							break;
						}


					}
					for(int j = mid+1; j<n; j++) {

						if(target==src[j]) {
							count ++;
						}else{
							break;
						}


					}
					
					break;
					
				}else if(target>src[mid]) {
					l = mid + 1;
				}else {
					r = mid - 1; 
				}



			}
			System.out.println(count);
		}


		bw.flush();
		bw.close();
		br.close();

	}

}

 * for(int j = mid-1; j>=0; j--) {

						if(target==src[j]) {
							count ++;
						}else{
							break;
						}


					}
					for(int j = mid+1; j<n; j++) {

						if(target==src[j]) {
							count ++;
						}else{
							break;
						}


					}
 */
