// https://leetcode.com/problems/3sum/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreeSum {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public List<List<Integer>> solution(int[] nums) {

        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);

        // Optimized[O(n^2)]
        for(int i = 0; i < nums.length; i++) {

            int left = i+1;
            int right = nums.length-1;

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate left
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    // Skip duplicate right
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }


        // Brute Force
        // for(int i = 0; i < nums.length; i++) {

        //     for(int j = i+1; j < nums.length; j++) {

        //         for(int k = j+1; k < nums.length; k++) {

        //             if(nums[j] + nums[k] == -(nums[i])) {

        //                 List<Integer> triplet = new ArrayList<>();

        //                 triplet.add(nums[i]);
        //                 triplet.add(nums[j]);
        //                 triplet.add(nums[k]);

        //                 if(!ls.contains(triplet))
        //                     ls.add(triplet);
        //             }
        //         }
        //     }
        // }

        return ls;
    }

    // For CPH
    public static void main(String args[]) {

        ThreeSum ts = new ThreeSum();
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
        List<List<Integer>> output = ts.solution(nums);
        System.out.print(output);
    }
} 