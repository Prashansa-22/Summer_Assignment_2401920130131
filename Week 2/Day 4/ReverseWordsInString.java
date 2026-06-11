class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String arr[]=s.split(" ");
        for(int j=0;j<arr.length;j++){
            String word=arr[j];
            int i=word.length()-1;
            while(i>=0){
                sb.append(word.charAt(i));
                i--;
            }
            if(j!=arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
