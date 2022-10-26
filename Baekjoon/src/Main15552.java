import java.util.*;
import java.io.*;

public class Main15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());;
			
			
			bw.write(sum + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
