class Solution {
    public int largestAltitude(int[] gain) {
          int sum=0;
          int[] ps=new int[gain.length+1];
          ps[0]=0;
          int max=ps[0];
          for(int i=1;i<gain.length+1;i++){
            ps[i]=ps[i-1]+gain[i-1];
            if(ps[i]>max){
                max=ps[i];
            }
          }
    return max;
    }
}