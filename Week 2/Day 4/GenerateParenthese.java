class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }
    public static void generate(int n,int left,int right,String temp,ArrayList<String> ans){
        if(left+right==2*n){
            ans.add(temp);
            return;
        }
        if(left<n){
            generate(n,left+1,right,temp+"(",ans);
        }
        if(right<left){
            generate(n,left,right+1,temp+")",ans);
        }
    }
}
