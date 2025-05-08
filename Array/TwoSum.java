// https://leetcode.com/problems/two-sum/description/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int[] solution(int[] numbers, int target) {

        int[] result = new int[2];

        // Optimized [Using Hash Map - O(n)]
        HashMap<Integer, Integer> record = new HashMap<>();
        int difference = 0;

        for(int i = 0; i < numbers.length; i++) {

            difference = target - numbers[i];

            if(record.containsKey(difference)) {

                result[0] = record.get(difference);
                result[1] = i;

                break;
            }
            else {

                record.put(numbers[i], i);
            }
        }

        // Brute Force
        // for(int i = 0; i < numbers.length-1; i++) {

        //     for(int j = i+1; j < numbers.length; j++) {

        //         if(numbers[i] + numbers[j] == target) {

        //             result[0] = i;
        //             result[1] = j;

        //             break;
        //         }
        //     }
        // }

        return result;
    }

    // For CPH
    public static void main(String args[]) {

        TwoSum ts = new TwoSum();
        ArrayList<Integer> arr = new ArrayList<>();
        int target;
        int number;

        target = sc.nextInt();

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
        int[] numbers = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            numbers[i] = arr.get(i);

        // Output
        int[] output = ts.solution(numbers, target);
        System.out.print("[");
        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if(i != output.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}