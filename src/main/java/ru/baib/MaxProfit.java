package ru.baib;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int currentStock = Integer.MAX_VALUE;
        int difference = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < currentStock) {
                currentStock = prices[i];
            }
            if (prices[i] - currentStock > difference) {
                difference = prices[i] - currentStock;
            }
        }
        return difference;
    }
}
