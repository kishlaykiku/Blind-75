// https://leetcode.com/problems/counting-bits/
import java.util.Scanner;

public class CountBits {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int[] solution(int n) {

        int arr[] = new int[n+1];

        // Brian Kernighan's Algorithm [O(n)] - Remove the right most set bit until number becomes 0
        for(int i = 0; i < n+1; i++) {

            int count = 0, temp = i;

            while(temp != 0) {

                temp = temp & (temp-1);
                count++;
            }

            arr[i] = count;
        }


        // Division Approach
        // for(int i = 0; i < n+1; i++) {

        //     int count = 0, temp = i, rem = 0;

        //     while(temp != 0) {

        //         rem = temp % 2;
        //         temp = temp / 2;
        //         if(rem == 1)
        //             count++;
        //     }

        //     arr[i] = count;
        // }

        return arr;
    }

    // For CPH
    public static void main(String args[]) {

        CountBits cb = new CountBits();
        int n;

        n = sc.nextInt();

        // Output
        int output[] = cb.solution(n);
        System.out.print("[");
        for(int i = 0; i < n+1; i++) {

            System.out.print(output[i]);
            if(i < n)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}