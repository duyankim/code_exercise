package implementation_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2578 {
    static int[][] bingo;
    static int cnt;

    public static void main(String[] args) {
        FastReader br = new FastReader();

        bingo = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = br.nextInt();
            }
        }

        cnt = 0;

        for (int k = 1; k <= 25; k++) {
            int value = br.nextInt();
            // color the number that already called
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bingo[i][j] == value) {
                        bingo[i][j] = 0;
                    }
                }
            }

            checkBingoComplete();

            if (cnt >= 3) {
                System.out.println(k);
                break;
            }
            cnt = 0;
        }
    }

    static void checkBingoComplete() {
        horizontalCheck();
        verticalCheck();
        rightDiagonalCheck();
        leftDiagonalCheck();
    }

    private static void leftDiagonalCheck() {
        int tmp = 0;

        // check left diagonal bingo
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0) tmp++;
        }
        if (tmp == 5) cnt++;
    }

    private static void rightDiagonalCheck() {
        int tmp = 0;
        // check right diagonal bingo
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == 0) tmp++;
        }
        if (tmp == 5) cnt++;
    }

    private static void verticalCheck() {
        int tmp = 0;
        // check vertical bingo
        for (int i = 0; i < 5; i++) {
            tmp = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0) tmp++;
            }
            if (tmp == 5) cnt++;
        }
    }

    private static void horizontalCheck() {
        int tmp = 0;
        // check horizontal bingo
        for (int i = 0; i < 5; i++) {
            tmp = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) tmp++;
            }
            if (tmp == 5) cnt++;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
