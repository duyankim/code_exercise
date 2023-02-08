package implementation_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2753 {

    public static final String TRUE = "1";
    public static final String FALSE = "0";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());
        String result = FALSE;

        if (year % 400 == 0) {
            result = TRUE;
        } else if (year % 100 == 0) {
            result = FALSE;
        } else if (year % 4 == 0) {
            result = TRUE;
        }

        System.out.println(result);
    }
}
