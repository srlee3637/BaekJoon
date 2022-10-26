import java.util.*;
public class Main1152 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		
		String S1= S.trim();
		String[] ans = S1.split(" ");
		
		if(S1.isEmpty()) {
			System.out.println(0);
		}
		else System.out.println(ans.length);
		
	}

}
