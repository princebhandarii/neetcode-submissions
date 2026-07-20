class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxp = 0;
        int bb = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] > bb) {
                maxp = Math.max(maxp, prices[i] - bb);
            }

            bb = Math.min(bb, prices[i]);
        }
        return maxp;
    }
}
