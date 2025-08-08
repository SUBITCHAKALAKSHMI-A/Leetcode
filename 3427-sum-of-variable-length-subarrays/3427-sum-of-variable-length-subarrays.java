class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int start=0,sum=0,sum1=0;
        for(int i=0;i<n;i++){
            start=Math.max(0,i-nums[i]);
            sum=0;
            for(int j=start;j<=i;j++){
                sum+=nums[j];
            }
            sum1+=sum;
        }return sum1;
    }
}