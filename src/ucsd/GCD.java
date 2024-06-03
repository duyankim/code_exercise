package usdc;

import java.util.*;

public class GCD {

  private static int find_gcd(int a, int b) {
    if (a % b == 0) {
      return b;
    }
    return find_gcd(b, a % b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(find_gcd(a, b));
  }
}
