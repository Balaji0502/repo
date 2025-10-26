import java.util.List;
import java.util.*;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> divisors=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                divisors.add(i);

            
            if(i!=n/i){
                divisors.add(n/i);
            }
            }
        }
            Collections.sort(divisors);
        
        return divisors;
    }
}
