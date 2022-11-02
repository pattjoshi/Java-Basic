public class Practic {
    public static int buyStuck(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfid = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {

                int profid = price[i] - buyPrice;
                maxProfid = Math.max(maxProfid, profid);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfid;

    }
    // 2 variable , Buyrate = +inf; maxProfix =0

    // loop 0 to n
    // case 1 :- Buyrate > price[i]
    // int profid = price[i] - buyratel
    // maxProfix = min(maxProfid,profid)
    // case 2
    // Buyrate = price[i]
    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(buyStuck(price));

    }
}
