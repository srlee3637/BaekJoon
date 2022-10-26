import java.util.*;

public class Main2941 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		String[] ans = str.split("");
		int count = 0;
		for(int i = 0; i < ans.length; i++) {


			if(ans[i].equals("=")|| ans[i].equals("-")) {
				continue;
			}
			
			else if( i < (ans.length -1) && ans[i].equals("d")) {

				if(i < (ans.length -2) && ans[i+1].equals("z") ) {
					
					if(ans[i+2].equals("=")) {
						i+=2;
					}
				}
			}
			
			else if(i < ans.length -1 && ans[i].equals("l") || ans[i].equals("n") ){

				if(ans[i+1].equals("j")) {
					i++;
				}

			}
			
			count ++;
		}

		System.out.println(count);

	}

}
