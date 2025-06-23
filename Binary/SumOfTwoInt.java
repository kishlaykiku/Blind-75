// https://leetcode.com/problems/sum-of-two-integers/
import java.util.Scanner;

public class SumOfTwoInt {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int a, int b) {

        int sum = 0;

        while(b != 0) {

            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;            
        }
        sum = a;

        return sum;
    }

    // For CPH
    public static void main(String args[]) {

        SumOfTwoInt soti = new SumOfTwoInt();
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        // Output
        int output = soti.solution(a, b);
        System.out.print(output);
    }
}