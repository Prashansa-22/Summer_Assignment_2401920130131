class Solution {

    int idx = 0;

    public String decodeString(String s) {
        return helper(s);
    }

    private String helper(String s) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (idx < s.length()) {

            char ch = s.charAt(idx);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                idx++;
            }

            else if (ch == '[') {
                idx++; // skip '['

                String decoded = helper(s);

                for (int i = 0; i < num; i++) {
                    result.append(decoded);
                }

                num = 0;
            }

            else if (ch == ']') {
                idx++; // skip ']'
                return result.toString();
            }

            else {
                result.append(ch);
                idx++;
            }
        }

        return result.toString();
    }
}
