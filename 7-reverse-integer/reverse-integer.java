class Solution {
    public int reverse(int x) {
        long f = 0;
        int x1 =x;
        x = Math.abs(x);
        while(x>0){

            int rem = x%10;
             x /= 10;
            f = (f*10)+rem;
           
        }
         if(f>Integer.MAX_VALUE||f<Integer.MIN_VALUE){
            return 0;
       }else if(x1<0){
            return (int) (-f);
        }
    else
        return (int) f;
    }
}