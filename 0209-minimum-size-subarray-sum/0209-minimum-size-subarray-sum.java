class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ms=Integer.MAX_VALUE,sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum>=target){
                    ms=Math.min(j-i+1,ms);
                    break;
                } 
            }
        }return ms==Integer.MAX_VALUE?0:ms;
    }
}