package implementation_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> list = new ArrayList<Integer>(30);

        for (int i = 1; i <= 30; i++) {
            list.add(i);
        }

        for (int j = 0; j < 28; j++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (list.contains(N)) {
                list.remove(list.indexOf(N));
            }
        }

        Collections.sort(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
