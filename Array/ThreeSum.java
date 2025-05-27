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

            int left = i+1, right = nums.length-1;

            for(int j = i+1; j < nums.length; j++) {

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