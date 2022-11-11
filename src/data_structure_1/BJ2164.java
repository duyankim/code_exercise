package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        while (num > 0) {
            deque.offer(num);
            num--;
        }

        while (deque.size() > 1) {
            deque.pollLast();
            deque.offerFirst(deque.pollLast());
        }

        System.out.println(deque.poll());
    }
}
