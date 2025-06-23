// https://leetcode.com/problems/product-of-array-except-self/
import java.util.Scanner;
import java.util.ArrayList;

public class ProductExceptSelf {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int[] solution(int[] nums) {

        int[] productArray = new int[nums.length];

        // Optimized [O(n)]
        int[] left = new int[nums.length];
        int[] right  = new int [nums.length];

        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i = 1; i < nums.length; i++)
            left[i] = left[i-1] * nums[i-1];

        for(int i = nums.length-2; i >= 0; i--)
            right[i] = right[i+1] * nums[i+1];

        for(int i = 0; i < nums.length; i++)
            productArray[i] = left[i] * right[i];


        // Brute Force
        // int product = 1;

        // for(int i = 0; i < nums.length; i++) {

        //     product = 1;

        //     for(int j = 0; j < nums.length; j++) {

        //         if(i != j)
        //             product *= nums[j];
        //     }

        //     productArray[i] = product;
        // }

        return productArray;
    }

    // For CPH
    public static void main(String args[]) {

        ProductExceptSelf pes = new ProductExceptSelf();
        ArrayList<Integer> arr = new ArrayList<>();
        int number = 0;

        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                number = sc.nextInt();
                arr.add(number);
            }
            else{
                String input = sc.next();
                if(input.equalsIgnoreCase("q")) // When input is "q", loop will stop
                    break;
            }
        }
        sc.close();

        // Converty From ArrayList to Array
        int[] nums = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            nums[i] = arr.get(i);

        // Output
        int[] output = pes.solution(nums);
        System.out.print("[");
        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if(i != output.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
