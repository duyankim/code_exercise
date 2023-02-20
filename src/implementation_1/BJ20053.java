package implementation_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ20053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lines = Integer.parseInt(st.nextToken());

        while (lines-- > 0) {
            st = new StringTokenizer(br.readLine());
            int numbers = Integer.parseInt(st.nextToken());

            List list = new ArrayList<Integer>(numbers);
            st = new StringTokenizer(br.readLine());

            while (numbers-- > 0) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            System.out.println(Collections.min(list) + " " + Collections.max(list));
        }
    }
}
