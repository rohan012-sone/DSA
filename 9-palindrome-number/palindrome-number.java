class Solution {
    public boolean isPalindrome(int x) {
       boolean found = false;
       int n = x;
        int sum = 0;
        
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum*10+rem;
        }if(sum==x){
            found = true;
        }
        return found;
    }
}