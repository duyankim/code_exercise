package data_strucure_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BJ11279 {

    public static void main(String[] args) {
        FastReader br = new FastReader();

        int num = br.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int input = br.nextInt();
            if (pq.size() == 0 && input == 0) {
                sb.append("0").append("\n");
            } else if (pq.size() > 0 && input == 0) {
                sb.append(pq.poll()).append("\n");
            } else {
                pq.add(input);
            }
        }

        System.out.println(sb);
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
