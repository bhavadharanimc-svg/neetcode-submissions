class Solution {
    public boolean isPerfectSquare(int num) {
        long root=(long)Math.sqrt(num);
        if((root*root)==num){
            return true;
        }
        return false;
    }
}