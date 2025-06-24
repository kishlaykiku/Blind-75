// https://leetcode.com/problems/missing-number/
import java.util.Scanner;
import java.util.ArrayList;

public class MissingNumber {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int nums[]) {

        int missingNum = 0;

        // Bit Manipulation [XOR]
        int xorIndex = 0, xorElements = 0;
        for(int i = 0; i <= nums.length; i++) {

            xorIndex = xorIndex ^ i;
            if(i != nums.length)
                xorElements = xorElements ^ nums[i];
        }
        missingNum = xorIndex ^ xorElements;

        // Formula Approach
        // int actualSum = 0, expectedSum = 0;
        // for(int i = 0; i < nums.length; i++)
        //     actualSum += nums[i];

        // expectedSum = (nums.length*(nums.length+1))/2;
        // missingNum = expectedSum - actualSum;

        return missingNum;
    }

    // For CPH
    public static void main(String args[]) {

        MissingNumber mn = new MissingNumber();
        ArrayList<Integer> arr = new ArrayList<>();
        int number;

        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                number = sc.nextInt();
                arr.add(number);
            }
            else {
                String input = sc.next();
                if(input.equalsIgnoreCase("q")) // When inout is "q", loop will stop
                    break;
            }
        }
        sc.close();

        // Convert from ArrayList to Array
        int nums[] = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            nums[i] = arr.get(i);

        // Output
        int output = mn.solution(nums);
        System.out.print(output);
    }
}