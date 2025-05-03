import java.util.Scanner;
import java.util.ArrayList;

public class BuySellStock {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int Solution(int[] prices) {

        int minBuyPrice = prices[0];
        int profit = 0;
        int maxProfit = 0;

        // Optimized [O(n)]
        for(int i = 0; i < prices.length-1; i++) {

            // Track minimum price of stock
            if(prices[i] < minBuyPrice)
                minBuyPrice = prices[i];

            profit = prices[i+1] - minBuyPrice;

            // Track maximum profit generated
            if(profit > maxProfit)
                maxProfit = profit;
        }

        // Brute Force
        // for(int i = 0; i < prices.length; i++) {

        //     for(int j = i+1; j < prices.length; j++) {

        //         profit = prices[j] - prices[i];
        //         if(profit > maxProfit) {

        //             maxProfit = profit;
        //         }
        //     }
        // }

        return maxProfit;
    }

    // For CPH
    public static void main(String args[]) {

        BuySellStock bss = new BuySellStock();
        ArrayList<Integer> arr = new ArrayList<>();
        int price = 0;

        while(sc.hasNext()) {

            if(sc.hasNextInt()) {
                price = sc.nextInt();
                arr.add(price);
            }
            else {
                String input = sc.next();
                if(input.equalsIgnoreCase("q")) // When input is "q", loop will stop
                    break;
            }
        }
        sc.close();

        // Convert from ArrayList to Array
        int[] prices = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            prices[i] = arr.get(i);

        // Output
        int output = bss.Solution(prices);
        System.out.println(output);
    }
}