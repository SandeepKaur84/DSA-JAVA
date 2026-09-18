package Arrays;

public class Buy_Sell_Stocks {

    public static int buy_and_sell_stocks(int selling_prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < selling_prices.length; i++) {
            if (buy_price < selling_prices[i]) {
                int profit = selling_prices[i] - buy_price;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy_price = selling_prices[i];
            }
        }
        return maxProfit;
    }

    public static int buyAndSellStocks(int prices[]) {
        int buy_Price = Integer.MAX_VALUE;
        int max_Profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buy_Price) {
                int profit = prices[i] - buy_Price;
                max_Profit = Math.max(max_Profit, profit);
            } else {
                buy_Price = prices[i];
            }
        }
        return max_Profit;
    }

    public static void main(String[] args) {
        int selling_prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buy_and_sell_stocks(selling_prices));
        System.out.println("Maximum profit is : " + buyAndSellStocks(selling_prices));
    }
}
