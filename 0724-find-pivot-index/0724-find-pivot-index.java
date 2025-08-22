class Solution {
    public int pivotIndex(int[] nums) {
       int n=nums.length;
       int left_sum=0;
       int right_sum=0,total_sum=0;
       for(int i=0;i<n;i++){
            total_sum+=nums[i];
       } 
       for(int i=0;i<n;i++){
        right_sum=total_sum-left_sum-nums[i];
        if(left_sum==right_sum){
            return i;
        }
        left_sum+=nums[i];
       }
       return -1;
    }
}