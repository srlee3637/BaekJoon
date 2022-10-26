import java.util.*;

public class Main5622 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String[] ans = S.split("");
		String P = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] phone = P.split("");
		int[] time = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		int sum = 0;

		for(int i = 0; i < ans.length; i++) {
			for(int j = 0; j < phone.length; j++) {
				if(ans[i].equals(phone[j])) {
					sum+=time[j];
				}
			}
		}
		System.out.println(sum);
	}
}
