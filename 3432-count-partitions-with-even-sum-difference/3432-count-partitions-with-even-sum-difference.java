class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int left=0,right=0,total=0,c=0;
        for(int num: nums){
            total+=num;
        }
        int i=0;
        while(i<nums.length-1){
            right=total-left-nums[i];
            left+=nums[i];
            if((left%2)==(right%2)){
                c++;
            }
            
            i++;
        }return c;
    }
}