class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int rev=0;
        int temp=Math.abs(n);
        while(temp!=0){
            rev=(rev*10)+(temp%10); 
            temp=temp/10;
            
        }
        return rev==Math.abs(n);
    }
}
