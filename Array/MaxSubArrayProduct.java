import java.util.Scanner;
import java.util.ArrayList;

public class MaxSubArrayProduct {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int[]nums) {

        return 0;
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
        for(int i = 0; i < nums.length; i++)
            nums[i] = arr.get(i);

        // Output
        int output = msap.solution(nums);
        System.out.print(output);
    }
}