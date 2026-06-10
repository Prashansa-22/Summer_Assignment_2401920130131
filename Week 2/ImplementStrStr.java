class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++){
            int j=i,k=0;
            while(k<m && haystack.charAt(j)==needle.charAt(k)){
               j++;
               k++;
            }
            if(k==m){
                return i;
            }
        }
        return -1;
    }
}
