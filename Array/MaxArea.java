import java.util.Scanner;
import java.util.ArrayList;

public class MaxArea {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int[] height) {

        int maxArea = 0;

        // Optimized [O(n)]
        int left = 0;
        int right = height.length - 1;

        while(left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        
        // Brute Force
        // for(int i = 0; i < height.length; i++) {

        //     for(int j = i+1; j < height.length; j++) {

        //         int area = Math.min(height[i], height[j]) * (j-i);

        //         if(area > maxArea)
        //             maxArea = area;
        //     }
        // }

        return maxArea;
    }

    // For CPH
    public static void main(String args[]) {

        MaxArea ma = new MaxArea();
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
        int output = ma.solution(nums);
        System.out.print(output);
    }
}