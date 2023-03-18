package data_strucure_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ14425 {

    public static void main(String[] args) {
        FastReader rd = new FastReader();

        int num = rd.nextInt();
        int strings = rd.nextInt();

        List<String> group = new ArrayList<>(num);
        List<String> list = new ArrayList<>(strings);

        while(num-- > 0) {
            group.add(rd.next());
        }

        while(strings-- > 0) {
            list.add(rd.next());
        }

        list.retainAll(group);
        System.out.println(list.size());
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
