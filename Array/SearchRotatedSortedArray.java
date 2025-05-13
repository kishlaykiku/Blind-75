import java.util.Scanner;
import java.util.ArrayList;

public class SearchRotatedSortedArray {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int[] nums, int key) {

        // Optimized[Binary Search - O(log n)]
        int left = 0, right = nums.length-1, mid = 0;

        while(left <= right) {

            mid = left + (right - left)/2;

            if(nums[mid] == key)
                return mid;

            // Check for sorted half
            if(nums[left] <= nums[mid]) {

                // Left half is sorted
                if(nums[left] <= key && key < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {

                // Right half is sorted
                if(nums[mid] < key && key <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        // Brute Force
        // for(int i = 0; i < nums.length; i++) {

        //     if(nums[i] == key)
        //         return i;
        // }

        return -1;
    }

    // For CPH
    public static void main(String args[]) {

        SearchRotatedSortedArray srsa = new SearchRotatedSortedArray();
        ArrayList<Integer> arr = new ArrayList<>();
        int number = 0;
        int key = 0;

        key = sc.nextInt();

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
        int output = srsa.solution(nums, key);
        System.out.print(output);
    }
}