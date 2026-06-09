class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        int pcount[]=new int[26];
        int scount[]=new int[26];
        if(p.length()>s.length()){
            return ans;
        }
        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;

        }
        if(Arrays.equals(pcount,scount)){
            ans.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            scount[s.charAt(i)-'a']++;
            scount[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(pcount,scount)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}
