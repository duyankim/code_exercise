package tree_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ6416 {

    public static void main(String[] args) {
        FastReader br = new FastReader();
        HashMap<Integer, Integer> map;
        int cnt = 1;

        while (true) {
            map = new HashMap<>();
            int edge = 0;

            while (true) {
                int start = br.nextInt();
                int end = br.nextInt();

                if (start == -1 && end == -1) return;
                else if (start == 0 && end == 0) break;

                map.put(start, map.getOrDefault(start, 0));
                map.put(end, map.getOrDefault(end, 0) + 1);
                edge++;
            }

            int root = 0;
            boolean isTree = true;

            for (int k : map.keySet()) {
                if (map.get(k) == 0) root++;
                else if (map.get(k) > 1) {
                    isTree = false;
                    break;
                }
            }

            if (map.size() == 0) System.out.println("Case " + cnt + " is a tree.");
            else if (isTree && root == 1 && edge == map.size() - 1) System.out.println("Case " + cnt + " is a tree.");
            else System.out.println("Case " + cnt + " is not a tree.");
            cnt++;
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
