// User function Template for Java

class Solution {
    static int getLastDigit(String a, String b) {
        // code here
        if(b.equals("0")) return 1;
        int lastA=a.charAt(a.length()-1)-'0';
        
        int mod=0;
        for(int i=0;i<b.length();i++){
            mod=(mod*10+(b.charAt(i)-'0'))%4;
        }
        if(mod==0) mod=4;
        
        int result=1;
        for(int i=0;i<mod;i++){
            result=(result*lastA)%10;
        }
        return result;
    }
    
}
