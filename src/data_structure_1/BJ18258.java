package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lines = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (lines-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push" : {
                    deque.offer(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop" : {
                    Integer element = deque.poll();
                    if (element == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(element).append("\n");
                    }
                    break;
                }
                case "size" : {
                    sb.append(deque.size()).append("\n");
                    break;
                }
                case "empty" : {
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "front" : {
                    Integer element = deque.peek();
                    if (element == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(element).append("\n");
                    }
                    break;
                }
                case "back" : {
                    Integer element = deque.peekLast();
                    if (element == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(element).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
