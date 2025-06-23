// https://leetcode.com/problems/maximum-subarray/
import java.util.Scanner;
import java.util.ArrayList;

public class MaxSubArraySum {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Optimized[Kadane's Algoriothm - O(n)]
        for(int i = 0; i < nums.length; i++) {

            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0)
                currentSum = 0;
        }


        // Brute Force
        // for(int i = 0; i < nums.length; i++) {

        //     currentSum = 0;

        //     for(int j = i; j < nums.length; j++) {

        //         currentSum += nums[j];
        //         maxSum = Math.max(maxSum, currentSum);
        //     }
        // }

        return maxSum;
    }

    // For CPH
    public static void main(String args[]) {

        MaxSubArraySum msas = new MaxSubArraySum();
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
        int output = msas.solution(nums);
        System.out.print(output);
    }
}