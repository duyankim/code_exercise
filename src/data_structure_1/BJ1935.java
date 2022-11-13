package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1935 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String line = st.nextToken();

        Stack<Double> stack = new Stack<>();
        List<Character> operator = new ArrayList<>(Arrays.asList('+', '-', '*', '/'));
        double[] numbers = new double[num];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            numbers[i] = Double.parseDouble(st.nextToken());
        }

        for (int k = 0; k < line.length(); k++) {
            double a, b = 0.0;
            char c = line.charAt(k);
            if (!operator.contains(c)) {
                stack.push(numbers[c - 'A']);
            } else {
                a = stack.pop();
                b = stack.pop();
                
                switch (c) {
                    case '+' :
                        stack.push(a + b);
                        break;
                    case '-' :
                        stack.push(b - a);
                        break;
                    case '*' :
                        stack.push(a * b);
                        break;
                    case '/' :
                        stack.push(b / a);
                        break;
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
