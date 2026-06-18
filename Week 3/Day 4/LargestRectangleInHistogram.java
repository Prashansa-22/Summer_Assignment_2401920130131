

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            while (!st.isEmpty() &&
                  (i == n || heights[st.peek()] >= heights[i])) {

                int height = heights[st.pop()];

                int rightSmall = i;

                int leftSmall;
                if (st.isEmpty()) {
                    leftSmall = -1;
                } else {
                    leftSmall = st.peek();
                }

                int width = rightSmall - leftSmall - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            st.push(i);
        }

        return maxArea;
    }
}
