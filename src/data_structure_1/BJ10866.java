package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ10866 {

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
                case "push_front": {
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "push_back": {
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop_front": {
                    Integer element = deque.pollFirst();
                    if (element == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(element).append("\n");
                    }
                    break;
                }
                case "pop_back": {
                    Integer element = deque.pollLast();
                    if (element == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(element).append("\n");
                    }
                    break;
                }
                case "size": {
                    sb.append(deque.size()).append("\n");
                    break;
                }
                case "empty": {
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "front": {
                    Integer element = deque.peekFirst();
                    if (element == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(element).append("\n");
                    }
                    break;
                }
                case "back": {
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
