class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] la=new int[n];
        int[] ra=new int[n];
        int[] na=new int[n];
        la[0]=0;
        for(int i=1;i<n;i++){
            la[i]=la[i-1]+nums[i-1];
        }
        ra[n-1]=0;
        for(int i=n-2;i>=0;i--){
            ra[i]=ra[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            na[i]=Math.abs(la[i]-ra[i]);
        }
        return na;
    }
}