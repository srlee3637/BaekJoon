////import java.io.BufferedReader;
////import java.io.BufferedWriter;
////import java.io.FileInputStream;
////import java.io.FileNotFoundException;
////import java.io.IOException;
////import java.io.InputStreamReader;
////import java.io.OutputStreamWriter;
////import java.util.*;
////public class Main1654 {
////
////	public static void main(String[] args) throws IOException {
////
////		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
////
////		StringTokenizer st = new StringTokenizer(br.readLine());
////
////		int k = Integer.parseInt(br.readLine());
////		int [] wlan = new int[k];
////		int n = Integer.parseInt(br.readLine());
////		
////		
////		for(int i = 0; i < k; i++) {
////			wlan[i] = Integer.parseInt(br.readLine());
////		}
////		Arrays.sort(wlan);
////
////
////		long l = 0;
////		long r = wlan[n-1];
////		long ans = 0;
////		
////
////		st = new StringTokenizer(br.readLine());	
////
////
////
////		
////		while(l<=r){
////			long mid = (l+r)/2;
////			long sum = 0;
////			for(int i = 0; i < n; i++){
////				if(wlan[i]>mid){
////					sum += wlan[i]/mid;
////				}
////			}
////			
////			
////			if(sum == n){
////				ans=mid;
////				break;
////			}else if(sum>n){
////				l = mid + 1;
////				//if(mid >ans){
////				ans = mid;
////				//}
////			}else {
////				r = mid - 1;
////			}
////			
////
////			
////		}
////        System.out.println(ans);
////        
////        bw.flush();
////		bw.close();
////		br.close();
////	}
////}
////
//
//
//
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.*;
//public class Main1654{
//	public static void main(String[] args){
//
//		try {
//			System.setIn(new FileInputStream("src/input.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		int [] tree = new int[n];
//		for(int i = 0; i < n; i++){
//			tree[i] = sc.nextInt();
//		}
//		Arrays.sort(tree);
//
//		int l = 0;
//		int r = tree[n-1];
//		int ans = 0;
//		
//		while(l<=r){
//			int mid = (l+r)/2;
//			int sum = 0;
//			System.out.println("mid" + mid);
//			for(int i = 0; i < n; i++){
//				if(tree[i]>=mid){
//					sum += tree[i]/mid;
//				}
//			}
//			System.out.println("sum" +sum);
//			
//			if(sum == m){
//				ans=mid;
//				break;
//				
//			}else if(sum > m){
//				ans = mid;
//				l = mid+1;
//				//if(mid >ans){
//				
//				System.out.println(m);
//				//}
//			
//			}else {
//				r = mid - 1;
//			}
//			
//
//			
//		}
//        System.out.println(ans);
//
//	}
//}




import java.util.Scanner;
 
public class Main1654 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int K = in.nextInt();
		int N = in.nextInt();
 
		int[] arr = new int[K];
		
		long max = 0;
		
		// 입력과 동시에 해당 랜선의 길이가 최댓값인지를 확인하고 max를 갱신
		for (int i = 0; i < K; i++) {
			arr[i] = in.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
 
		// 반드시 max에서 +1 값이어야 한다.
		max++; 
 
		long min = 0; // 탐색 길이 최솟값
		long mid = 0; 
 
		while (min < max) { 
			
			// 범위 내에서 중간 길이를 구한다.
			mid = (max + min) / 2;
			
 
			long count = 0;
			
			// 구해진 중간 길이로 잘라서 총 몇 개가 만들어지는지를 구한다.
 
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			
			/*
			 *  [upper bound 형식]
			 *  
			 *  mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
			 *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
			 *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
			 */
			if(count < N) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
			
 
		}
		
		// UpperBound로 얻어진 값(min)에 -1이 최대 길이가 된다.
		System.out.println(min - 1);
	}
}
 