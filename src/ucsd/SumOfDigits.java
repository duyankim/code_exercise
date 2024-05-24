package ucsd;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println(sumOfDigits(i, j));
    }

    public static int sumOfDigits(int i, int j) {
        return i + j;
    }
}
