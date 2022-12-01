package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ2346 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int elements = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        Deque<int[]> ballons = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        sb.append("1 ");

        int nxtMove = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= elements; i++) {
            ballons.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        while (!ballons.isEmpty()) {
            int[] out;
            if (nxtMove > 0) {
                for (int i = 1; i < nxtMove; i++) {
                    ballons.add(ballons.pollFirst());
                }
                out = ballons.removeFirst();
            } else {
                for (int i = nxtMove; i < -1; i++) {
                    ballons.addFirst(ballons.pollLast());
                }
                out = ballons.removeLast();
            }
            nxtMove = out[1];
            sb.append(out[0]).append(" ");
        }

        System.out.println(sb);
    }
}
