import java.util.Scanner;
import java.util.ArrayList;

public class MinRotatedSortedArray {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int[] nums) {

        // Optimized[Binary Search - O(log n)]
        int left = 0, right = nums.length-1, mid = 0;

        while(left < right) {

            mid = left + (right - left)/2;

            if(nums[mid] > nums[mid+1])
                return nums[mid+1];
            if(nums[mid] < nums[mid+1] && nums[mid] < nums[right])
                right = mid;
            else
                left = mid;
        }

        return nums[0];

        // Brute Force
        // for(int i = 0; i < nums.length-1; i++) {

        //     if(nums[i] > nums[i+1])
        //         return nums[i+1];
        // }

        // return nums[0];
    }

    // For CPH
    public static void main(String args[]) {

        MinRotatedSortedArray mrsa = new MinRotatedSortedArray();
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
        int output = mrsa.solution(nums);
        System.out.print(output);
    }
}