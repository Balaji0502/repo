class Solution {
    public static int gcd(int a, int b) {
        // code here
        int rem=1;
        int divident,divisor;
        if(a>b){
             divident=a;
             divisor=b;
        }
        else{
             divident=b;
             divisor=a;
        }
        rem=divident%divisor;
        while(rem!=0){
            
            
             
             divident=divisor;
             divisor=rem;
            rem=divident%divisor;
        }
        return divisor;
    }
}
