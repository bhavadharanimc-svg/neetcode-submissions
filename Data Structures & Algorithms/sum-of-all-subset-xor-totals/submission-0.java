class Solution {
    int sum=0;
    public int subsetXORSum(int[] nums) {
        
        helper(0,nums,0);
        return sum;
    }
    public void helper(int index,int[]nums,int xor){
        if(index==nums.length){
            sum+=xor;
            return;
        }
        
        helper(index+1,nums,xor^nums[index]);
        
        helper(index+1,nums,xor);
    }
}