// User function Template for Java
class Solution {
    public static int power(int x,int y){
        if(y==0){
            return 1;
        }
        int half=power(x,y/2);
        if(y%2==0){
            return half*half;
        }
        
            return x*half*half;
        
    }
    public static int order(int n){
        int t=0;
        while(n>0){
            t++;
            n/=10;
        }
        return t;
    }
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int temp=n;
        int x=order(temp);

        while(temp!=0){

        int r=temp%10;
        sum +=power(r,x);
        temp/=10;
        }
        return sum==n;
    }
}
