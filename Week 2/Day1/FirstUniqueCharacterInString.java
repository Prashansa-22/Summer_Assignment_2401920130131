class Solution {
    public int firstUniqChar(String s) {
        char a[]=s.toCharArray();
        int freq[]=new int[26];
        for(int i=0;i<a.length;i++){
            freq[a[i]-'a']++;
        }
        for(int i=0;i<a.length;i++){
            if(freq[a[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
