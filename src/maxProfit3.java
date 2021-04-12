public class maxProfit3 {

    public int maxProfit (int[] prices) {
        // write code here
        int a = -prices[0];
        int b = 0;
        int max = 0;
        for (int i=1; i<prices.length; i++) {
            int c = Math.max(b - prices[i], a);
            b = Math.max(b, a + prices[i]);
            a = c;
            if (b > max) max = b;
        }
        return max;
    }
}
