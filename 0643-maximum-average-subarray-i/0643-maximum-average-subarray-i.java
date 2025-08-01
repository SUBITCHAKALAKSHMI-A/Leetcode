class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        double sum=0;
        double ma=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        ma=sum/k;

        for(int j=k;j<n;j++){
            sum+=arr[j]-arr[j-k];
            ma=Math.max(sum/k,ma);
        }
        return ma;
    }
}