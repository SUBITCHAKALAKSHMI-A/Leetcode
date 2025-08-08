class Solution {
    public String toLowerCase(String s) {
        char[] cg=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(cg[i]>='A' && cg[i]<='Z'){
                cg[i]+=32;
            }
        }return new String(cg);
    }
}