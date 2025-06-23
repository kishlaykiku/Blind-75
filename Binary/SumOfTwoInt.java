import java.util.Scanner;

public class SumOfTwoInt {

    private static final Scanner sc = new Scanner(System.in);

    // Solution
    public int solution(int a, int b) {

        int sum = 0, carry = 1, nextSum = 0;

        while(carry != 0) {

            carry = a & b;
            nextSum = carry << 1;
            a = a ^ b;
            b = nextSum;
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

        int output = soti.solution(a, b);
        System.out.print(output);
    }
}