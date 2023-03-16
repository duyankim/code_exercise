package data_strucure_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class BJ1620 {

    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int num = rd.nextInt();
        int questions = rd.nextInt();

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] arr = new String[num];

        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String pocktmon = rd.next();
            hashMap.put(pocktmon, i);
            arr[i] = pocktmon;
        }

        for (int j = 0; j < questions; j++) {
            String question = rd.next();
            try {
                int q = Integer.parseInt(question);
                sb.append(arr[q - 1] + "\n");
            } catch (NumberFormatException e) {
                sb.append(hashMap.get(question) + 1 + "\n");
            }
        }
        System.out.print(sb);
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
