// https://leetcode.com/problems/reverse-bits/
import java.util.Scanner;

public class ReverseBits {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int n) {

        int result = 0;

        for(int i = 0; i < 32; i++) {

            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }

        return result;
    }

    // For CPH
    public static void main(String args[]) {

        ReverseBits rb = new ReverseBits();
        String binaryString;
        int n;
        long longN;

        binaryString = sc.next();
        longN = Long.parseLong(binaryString, 2);
        n = (int) longN;

        // Output
        int output = rb.solution(n);
        System.out.print(Integer.toUnsignedString(output));
    }
}