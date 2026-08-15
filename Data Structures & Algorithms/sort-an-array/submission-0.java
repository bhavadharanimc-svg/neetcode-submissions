class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public void mergesort(int[]nums,int left,int ryt){
        if(left>=ryt){
            return;
        }
        int mid=left+(ryt-left)/2;
        mergesort(nums,left,mid);
        mergesort(nums,mid+1,ryt);
        merge(nums,left,mid,ryt);
    }
    public void merge(int[]nums,int left,int mid,int ryt){
       int[]temp=new int[ryt-left+1];
       int i=left;
       int j=mid+1;
       int k=0;
       while(i<=mid&&j<=ryt){
        if(nums[i]<=nums[j]){
            temp[k]=nums[i];
            i++;
        }
        else{
            temp[k]=nums[j];
            j++;
        }
        k++;
       } 
       while(i<=mid){
        temp[k]=nums[i];
        i++;
        k++;
       } 
       while(j<=ryt){
        temp[k]=nums[j];
        j++;
        k++;
       }   
       for(int x=0;x<temp.length;x++){
        nums[left+x]=temp[x];
       }
      
    }
}