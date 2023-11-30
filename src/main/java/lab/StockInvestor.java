/* Question 5
 * week7
 * Author: Haziq Halifi;
 */
package lab;

class SharesInfo {

    int quantity;
    int price;

    SharesInfo(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "<" + quantity + ", $" + price + ">";
    }
}

public class StockInvestor {

    MyQueue<SharesInfo> share = new MyQueue<>();

    public static void main(String[] args) {
        StockInvestor user1 = new StockInvestor();
        // Buy Shares
        System.out.println("Day 1: Bought 100 shares at $20");
        user1.buy(100, 20);
        System.out.println("Day 2: Bought 20 shares at $24");
        user1.buy(20, 24);
        System.out.println("Day 3: Bought 200 shares at $36");
        user1.buy(200, 36);
        // Test Statement
        user1.buy(30, 90);
        //share.display();
        // Sell Shares
        System.out.println("Day 4: Sold 150 shares at $36");
        user1.sell(150, 30);
    }

    public void sell(int q, int p) {
        int totalProfit = 0;
        int balanceQ = q;
        while (!share.isEmpty() && balanceQ > 0) {
            SharesInfo oldestShares = share.peek();
            int currentQ = oldestShares.quantity;
            if (balanceQ - currentQ >= 0) {
                share.dequeue();
                totalProfit += (currentQ * (p - oldestShares.price));
                balanceQ -= currentQ;
            } else {
                totalProfit += (balanceQ * (p - oldestShares.price));
                oldestShares.quantity -= balanceQ;
                balanceQ = 0;
            }
        }
        //share.display();
        System.out.println("Total profit: $" + totalProfit);
    }

    public void buy(int q, int p) {
        share.enqueue(new SharesInfo(q, p));

    }

}
