import java.util.Scanner;
public class Main8958 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		int count = 0;
		int sum = 0;
		for(int i = 0; i<n; i++) {
			String s1 = s.next();
			sum=0;
			count = 0;
			for(int j = 0; j<s1.length(); j++) {
				
				if(s1.charAt(j)=='O') {
					count++;
					sum+=count;
				}else {
					count = 0;
				}
			}
			System.out.println(sum);
		}





	}
}












