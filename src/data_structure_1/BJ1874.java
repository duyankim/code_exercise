package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int inStack = 0;

        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if (inStack < num) {
                for (int i = inStack + 1; i <= num; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                inStack = num;
            } else if (stack.peek() != num){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.print(sb);
    }
}
