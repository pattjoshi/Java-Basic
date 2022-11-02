public class BuyAsellStock {
    public static int buyStuck(int price[]) {
        // profit = buyPrice - shel price
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) { // profit
                int profit = price[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
                // mix(golbal-profit,to day profit)
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyStuck(prices));

    }
}

// 2 variable , Buyrate = +inf; maxProfix =0
// loop 0 to n
// case 1 :- Buyrate > price[i]
// int profid = price[i] - buyratel
// maxProfix = min(maxProfid,profid)
// case 2
// Buyrate = price[i]
