package usdc;

import java.util.Scanner;

public class Fibonacci {
    private static long[] memo;

    private static long calc_fib(int n) {
        if (n <= 1) {
            memo[n] = n;
            return memo[n];
        } else {
            if (memo[n] == 0) {
                return memo[n] = calc_fib(n - 1) + calc_fib(n - 2);
            } else {
                return memo[n];
            }
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        memo = new long[n+1];
        memo[0] = 0;
        memo[1] = 1;

        System.out.println(calc_fib(n));
    }
}
