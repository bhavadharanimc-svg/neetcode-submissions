class Solution {
    public int majorityElement(int[] nums) {
     int max=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int val:map.keySet()){
           if(map.get(val)>n/2){
            return val;
           }
        }
       return -1;
    }
}