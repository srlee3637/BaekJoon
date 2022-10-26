import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main1202 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		int[][] mv = new int[n][2]; 
		int[] c = new int[k];

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			mv[i][0] = Integer.parseInt(st.nextToken());
			mv[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(mv, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
			
				return o1[0]-o2[0];
			}
		});

		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			c[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(c);



		long ans = 0L;
		int j = 0;
		for (int i = 0; i < k; i++) {
			
			while (j < n && mv[j][0] <= c[i]) {
					pq.add(mv[j++][1]);
			}
			
			if (!pq.isEmpty()) {
				ans += pq.poll();
				
			}
			
		}
		

		bw.write(ans + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}

