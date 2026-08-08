class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer>ans = new ArrayList<>();
        boolean[]used=new boolean[nums.length];
        List<List<Integer>>res=new ArrayList<>();
        helper(nums,ans,used,res);
        return res;
    }
    public void helper(int nums[],ArrayList<Integer>ans,boolean[]used,List<List<Integer>>res){
        if(ans.size()==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true){
                continue;
            }

           ans.add(nums[i]);
           used[i]=true;
           helper(nums,ans,used,res);
           used[i]=false;
           ans.remove(ans.size()-1);
           

        }
    }
}