package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < N; i++) {
            list.add(i, i+1);
        }

        int K = Integer.parseInt(st.nextToken());
        int index = 0;
        while (list.size() > 1) {
            index = (index + K - 1) % list.size();
            sb.append(list.remove(index)).append(", ");
        }
        sb.append(list.remove()).append(">");
        System.out.print(sb);
    }
}
