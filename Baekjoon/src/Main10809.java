import java.util.*;

public class Main10809{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		char[] c = S.toCharArray();
		
		a:for(char a = 'a'; a <= 'z'; a++) {
			
			for(int i = 0; i < c.length; i++) {
				
				if(c[i] == a) {
					System.out.print(i + " ");
					continue a;
				}
			}
			System.out.print(-1 + " ");
			
		}
	}
}