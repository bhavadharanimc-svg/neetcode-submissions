class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        helper(0, nums, ans, result);

        return result;
    }

    public void helper(int index, int[] nums,
                       ArrayList<Integer> ans,
                       List<List<Integer>> result){

        if(index == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }

       
        ans.add(nums[index]);
        helper(index + 1, nums, ans, result);

        
        ans.remove(ans.size() - 1);

        
        helper(index + 1, nums, ans, result);
    }
}