class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minii=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int cost=prices[i]-minii;
            profit=Math.max(cost,profit);
            minii=Math.min(minii,prices[i]);
        }
        return profit;
    }
}
