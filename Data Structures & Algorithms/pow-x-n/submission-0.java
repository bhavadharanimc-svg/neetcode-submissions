class Solution {
    public double myPow(double x, int n) {
       
       long exp=Math.abs((long)n);
       double res = 1.0;
       double base=x;
       while(exp>0){
            if(exp%2==1){
                res*=base;
            }
            base*=base;
             exp/=2;
       }
       if(n<0){
        return 1.0/res;
       }
       return res;
    }
}