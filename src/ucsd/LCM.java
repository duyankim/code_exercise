package usdc;

import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    return (long) a * b / find_gcd(a, b);
  }

  private static long find_gcd(int a, int b) {
    if (a % b == 0) {
      return b;
    }
    return find_gcd(b, a % b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));

  }
}
