package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str;

        int lines = Integer.parseInt(st.nextToken());

        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(br.readLine());
            str = st.nextToken();

            if (str.length()%2 != 0) {
                System.out.println("NO");
                continue;
            } else if (str.charAt(0) != '(' || str.charAt(str.length()-1) != ')') {
                System.out.println("NO");
                continue;
            } else {
                int cnt = 0;

                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(j) == '(') {
                        cnt++;
                    } else {
                        cnt--;
                    }

                    if (cnt < 0) {
                        System.out.println("NO");
                        break;
                    } else if (j == str.length() - 1 && cnt == 0) {
                        System.out.println("YES");
                    } else if (j == str.length() - 1 && cnt != 0) {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
