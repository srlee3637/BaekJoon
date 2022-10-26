import java.util.*;
public class Main1157 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String S1 = S.toUpperCase();
		String[] ans = S1.split("");
		String[] alpha = 
			{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
					"K","L", "M", "N", "O", "P", "Q", "R", "S", 
					"T", "U", "V", "W", "X", "Y", "Z", "?"};

		int [] count = new int[27];

		for(int i = 0; i < S1.length(); i++) {

			for(int j = 0; j < alpha.length; j++) {

				if(ans[i].equals(alpha[j])) {
					count[j]++;
					break;
				}
			}
		}
		int max = 0;
		int answer = 0;

		for(int i = 0; i < count.length; i++) {

			if(count[i] > max) {
				max = count[i];
				answer = i;
				
			}else if(count[i] == max && count[i]!=0) {
				answer = count.length-1;
			}
		}
		System.out.println(alpha[answer]);

	}

}
