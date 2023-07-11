package data_strucure_2;

import java.util.Collections;
import java.util.PriorityQueue;

public class PG42628 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        s.solution(input);
    }
}

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            String cmd = op.substring(0,1);
            int value = Integer.parseInt(op.substring(2));

            if (pq.size() < 1 && cmd.equals("D")) {
                continue;
            }

            if (cmd.equals("I")) {
                pq.add(value);
                maxPq.add(value);
                continue;
            }

            if (value < 0) {
                int min = pq.poll();
                maxPq.remove(min);
                continue;
            }

            int max = maxPq.poll();
            pq.remove(max);
        }

        if (pq.size() > 0) {
            answer[0] = maxPq.poll();
            answer[1] = pq.poll();
        }

        return answer;
    }
}