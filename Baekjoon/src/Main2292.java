import java.util.*;
public class Main2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int answer  = 1;
		int honey = 1;
		
		while(num>honey) {
			honey += 6 * answer;
			answer ++;
		}
		
		System.out.println(answer);
	}

}
