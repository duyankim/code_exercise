package dynamic_programing_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = f(Integer.parseInt(br.readLine()));
        System.out.println(answer);
    }

    static int f(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return f(n-1) + f(n-2);
    }
}
