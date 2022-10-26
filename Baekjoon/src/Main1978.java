import java.util.*;
public class Main1978{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;
        int ans = 0;
        
        for(int i = 0; i < arr.length; i++){
            count  = 0;
            arr[i] = sc.nextInt();
            
            for(int j = 1; j <= arr[i]; j++){
                if(arr[i]%j ==0){
                    count++;
                }
            }
            
            if(count == 2){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}