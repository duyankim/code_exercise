package dynamic_programing_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min;

        int[] memo = new int[n+1];
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            min = Integer.MAX_VALUE;

            for (int j = 1; j*j <= i; j++) {
                int tmp = i - j*j;
                min = Math.min(min, memo[tmp]);
            }
            memo[i] = min + 1;
        }
        System.out.println(memo[n]);
    }
}
