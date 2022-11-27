package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(st.nextToken());

        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            Queue<int[]> queue = new LinkedList<>();
            int order = 0;

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{i, num});
                priorityQueue.offer(num);
            }

            while (queue.size() > 0) {
                int[] n = queue.poll();

                if (priorityQueue.peek() == n[1]) {
                    order++;
                    if (M == n[0]) {
                        break;
                    }

                    priorityQueue.poll();
                } else if (priorityQueue.peek() > n[1]) {
                    queue.offer(n);
                }
            }
            System.out.println(order);
        }
    }
}
