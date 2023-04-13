package implementation_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ21918 {

    public static void main(String[] args) {
        FastReader br = new FastReader();
        int[] result = new int[br.nextInt()];
        int loop = br.nextInt();

        for (int i = 0; i < result.length; i++) {
             result[i] = br.nextInt();
        }

        for (int j = 0; j < loop; j++) {
            int cmd = br.nextInt();
            int l;
            int r;

            switch (cmd) {
                case 1 -> result[br.nextInt() - 1] = br.nextInt();
                case 2 -> {
                    l = br.nextInt();
                    r = br.nextInt();
                    for (int k = l-1; k < r; k++) {
                        if (result[k] == 1) result[k] = 0;
                        else if (result[k] == 0) result[k] = 1;
                    }
                }
                case 3 -> {
                    l = br.nextInt();
                    r = br.nextInt();
                    for (int k = l-1; k < r; k++) {
                        result[k] = 0;
                    }
                }
                case 4 ->  {
                    l = br.nextInt();
                    r = br.nextInt();
                    for (int k = l-1; k < r; k++) {
                        result[k] = 1;
                    }
                }
                default -> System.out.println("invalid");
            }
        }
        Arrays.stream(result).forEach(a -> System.out.print(a + " "));
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
