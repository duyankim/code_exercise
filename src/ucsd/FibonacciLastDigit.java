package usdc;

import java.util.*;

public class FibonacciLastDigit {

    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1) {
            return n;
        } else {
            int result = calc_fib(n);
            return result;
        }
    }

    private static int calc_fib(int n) {
        int[] lastDigit = new int[n+1];
        lastDigit[0] = 0;
        lastDigit[1] = 1;

        for (int i = 2; i <= n; i++) {
            lastDigit[i] = (lastDigit[i - 1] + lastDigit[i - 2]) % 10;
        }
        return lastDigit[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

