package data_strucure_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ4358 {

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Double> hashMap = new HashMap<>();
        String tree = null;

        while (( tree = br.readLine()) != null) {
            if (hashMap.containsKey(tree)) {
                hashMap.put(tree, hashMap.get(tree) + 1);
            } else {
                hashMap.put(tree, 1.0);
            }
        }
        br.close();

        Double sum = 0.0;
        for (Double value : hashMap.values()) {
            sum += value;
        }

        List<String> keySet = new ArrayList<>(hashMap.keySet());
        Collections.sort(keySet);

        for (String key: keySet) {
            Double percent = hashMap.get(key)/sum * 100;
            System.out.println(key + " " +  String.format("%.4f", percent));
        }
    }
}