class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] la=new int[n];
        int[] ra=new int[n];
        la[0]=0;
        for(int i=1;i<n;i++){
            la[i]=la[i-1]+nums[i-1];
        }
        ra[n-1]=0;
        for(int i=n-2;i>=0;i--){
            ra[i]=ra[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(la[i]==ra[i]){
                return i;
            }
        }return -1;
    }
}