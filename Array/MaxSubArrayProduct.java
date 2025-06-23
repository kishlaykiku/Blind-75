// https://leetcode.com/problems/maximum-product-subarray/
import java.util.Scanner;
import java.util.ArrayList;

public class MaxSubArrayProduct {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;
        int product = 1;

        // Brute Force
        for(int i = 0; i < nums.length; i++) {

            product = 1;

            for(int j = i; j < nums.length; j++) {

                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    // For CPH
    public static void main(String args[]) {

        MaxSubArrayProduct msap = new MaxSubArrayProduct();
        ArrayList<Integer> arr = new ArrayList<>();
        int number = 0;

        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                number = sc.nextInt();
                arr.add(number);
            }
            else {
                String input = sc.next();
                if(input.equalsIgnoreCase("q")) // When input is "q", loop will stop
                    break;
            }
        }
        sc.close();

        // Convert from ArrayList to Array
        int[] nums = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            nums[i] = arr.get(i);

        // Output
        int output = msap.solution(nums);
        System.out.print(output);
    }
}