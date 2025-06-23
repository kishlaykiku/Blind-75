// https://leetcode.com/problems/number-of-1-bits/
import java.util.Scanner;

public class HammingWeight {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int n) {

        int count = 0;
    
        // Brian Kernighan's Algorithm [O(n)] - Remove the right most set bit until number becomes 0
        while(n != 0) {

            n = n & (n-1);
            count++;
        }


        // Division approach
        // int rem;
        // while(n != 0) {

        //     rem = n % 2;
        //     n = n / 2;
        //     if(rem == 1)
        //         count++;
        // }

        return count;
    }

    // For CPH
    public static void main(String args[]) {

        HammingWeight hw = new HammingWeight();
        int n;

        n = sc.nextInt();

        // Output
        int output = hw.solution(n);
        System.out.print(output);
    }
}