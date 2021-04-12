public class MaxProfit2 {

    public int maxProfit (int[] prices) {
        // write code here
        int[][] dp = new int[prices.length][2];
        int a = -prices[0];
        int b = 0;
        int max = 0;
        for (int i=1; i<prices.length; i++) {
            int c = Math.max(a, -prices[i]);
            b = Math.max(a + prices[i], b);
            a = c;
            if (b > max) max = b;
        }
        return max;
    }
}
