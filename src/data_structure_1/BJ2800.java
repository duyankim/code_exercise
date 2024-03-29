package data_structure_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ2800 {

    private static List<Bracket> bracketList = new ArrayList<>();
    private static List<String> eqList = new ArrayList<>();
    private static String input;

    public static void main(String[] args) {
        FastReader rd = new FastReader();

        input = rd.nextLine();
        Stack<Integer> startStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                startStack.add(i);
            }
            if (input.charAt(i) == ')') {
                bracketList.add(new Bracket(startStack.pop(), i));
            }
        }

        for (int i = 0; i < bracketList.size(); i++) {
            boolean[] removedArr = new boolean[input.length()];
            removedArr[bracketList.get(i).start] = true;
            removedArr[bracketList.get(i).end] = true;
            solve(i, removedArr);
        }

        List<String> distinctList = new ArrayList<>(new HashSet<>(eqList));
        distinctList.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        for (String distinct : distinctList) {
            sb.append(distinct);
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static void solve(int idx, boolean[] removedArr) {
        if (idx == bracketList.size()) {
            addEq(removedArr);
            return;
        }

        for (int i = idx + 1; i < bracketList.size(); i++) {
            Bracket bracket = bracketList.get(i);

            removedArr[bracket.start] = true;
            removedArr[bracket.end] = true;
            solve(i, removedArr);
            removedArr[bracket.start] = false;
            removedArr[bracket.end] = false;
        }

        solve(idx + 1, removedArr);
    }

    private static void addEq(boolean[] removedArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(removedArr[i]) continue;
            sb.append(input.charAt(i));
        }
        eqList.add(sb.toString());
    }

    static class Bracket {
        int start, end;
        public Bracket(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
             br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch(IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
