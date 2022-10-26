import java.util.*;

public class Main3052 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] src = new int[10];
		boolean[] bool = new boolean[42];
		int count = 0;
		Arrays.fill(bool,true);
		
		
	
		
		for(int i = 0; i < src.length; i++) {
			src[i] = sc.nextInt();
			src[i] %= 42;
			
			if(bool[src[i]]) {
				bool[src[i]] = false;
				count++;
			}
			
			
		}
		
		
		System.out.println(count);
		
	}
}
