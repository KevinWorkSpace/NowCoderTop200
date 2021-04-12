public class MaxProfit {

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        int max = 0;
        for (int i=1; i<prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][1] + prices[i], dp[i-1][0]);
            dp[i][1] = Math.max(-prices[i], dp[i-1][1]);
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
}
