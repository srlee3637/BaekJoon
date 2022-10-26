import java.util.*;

public class Main2581{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = N;
        int count = 0;
        boolean bool = true;
        
        for(int i = M; i <= N; i++){
            count = 0;
            for(int j = 1; j <= i; j++){
                
                if(i % j == 0){
                    count++;
                }
            }
            
            if(count == 2){
                sum+=i;
                bool = false;
                if(i < min){
                    min = i;
                }
            }
        }
        
        if(bool){
        	System.out.println(-1);
        }
        else{
        	System.out.println(sum);
        	System.out.println(min);
        }
        
        sc.close();
    }
}