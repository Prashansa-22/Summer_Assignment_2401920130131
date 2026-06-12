class Solution {
    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while(i < chars.length) {

            char curr = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }

            chars[index++] = curr;

            if(count > 1) {
                String freq = String.valueOf(count);

                for(char ch : freq.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }
}
