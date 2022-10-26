import java.util.*;

public class Main11720{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String s = scan.next();
        
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            sum+= (int)(s.charAt(i)-'0');    
        }

        System.out.println(sum);
    }
}