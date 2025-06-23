// https://leetcode.com/problems/contains-duplicate/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class ContainsDuplicate {
    
    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public boolean solution(int[] nums) {

        // Optimized[Using HashSet - O(n)]
        HashSet<Integer> seen = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            if(seen.contains(nums[i]))
                return true;
            else
                seen.add(nums[i]);
        }


        // Brute Force
        // for(int i = 0; i < nums.length-1; i++) {

        //     for(int j = i+1; j < nums.length; j++) {

        //         if(nums[i] == nums[j])
        //             return true;
        //     }
        // }

        return false;
    }

    // For CPH
    public static void main(String args[]) {

        ContainsDuplicate cd = new ContainsDuplicate();
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
        boolean output = cd.solution(nums);
        System.out.print(output);
    }
}