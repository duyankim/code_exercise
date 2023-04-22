package implementation_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ14467 {
    public static void main(String[] args) {
        FastReader br = new FastReader();
        int lines = br.nextInt();
        HashMap<Integer,Cow> cows = new HashMap<>(10);

        for (int i = 0; i < lines; i++) {
            int cowIdx = br.nextInt() - 1;
            int location = br.nextInt();

            if (cows.get(cowIdx) == null) {
                cows.put(cowIdx, new Cow(location, 0));

            } else {
                if (cows.get(cowIdx).location != location) {
                    int cnt = cows.get(cowIdx).movedCnt;
                    cows.replace(cowIdx, new Cow(location, cnt + 1));
                }
            }
        }

        int result = 0;
        for (Integer i : cows.keySet()) {
            result += cows.get(i).movedCnt;
        }

        System.out.println(result);
    }

    static class Cow {
        int location;
        int movedCnt;

        Cow (int location, int movedCnt) {
            this.location = location;
            this.movedCnt = movedCnt;
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
